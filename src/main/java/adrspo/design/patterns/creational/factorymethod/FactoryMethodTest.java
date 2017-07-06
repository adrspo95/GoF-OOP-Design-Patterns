package adrspo.design.patterns.creational.factorymethod;

public class FactoryMethodTest {

    public static void main(String[] args) {

        String client1 = "Jan Nowak";
        String client2 = "Janusz Kowalski";
        String client3 = "Dawid Topolski";
        String client4 = "Dariusz Kaczmarczyk";

        Creator notificationCreator = new SMSNotificationCreator();
        Notification smsNotification1 = notificationCreator.createNotification();
        Notification smsNotification2 = notificationCreator.createNotification();

        smsNotification1.setTitle("Reminder");
        smsNotification1.setContent("Reminder for payment");
        smsNotification1.notify(client1, "501839510");

        smsNotification2.setTitle("Discounts");
        smsNotification2.setContent("Recomendation to check out new discounts");
        smsNotification2.notify(client3, "889646107");

        notificationCreator = new EmailNotificationCreator();
        Notification emailNotification = notificationCreator.createNotification();

        emailNotification.setTitle("Contract extension");
        emailNotification.setContent("In connection with expiration of the contact, check ou our special offer");
        emailNotification.notify(client2, "client2@domain.com");

        notificationCreator = new FaxNotificationCreator();
        Notification faxNotification = notificationCreator.createNotification();

        faxNotification.setTitle("Report");
        faxNotification.setContent("Daily transfer usage report...");
        faxNotification.notify(client4, "62 26-79-831");

    }

}
