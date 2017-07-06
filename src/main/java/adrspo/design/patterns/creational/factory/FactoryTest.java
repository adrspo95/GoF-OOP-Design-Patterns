package adrspo.design.patterns.creational.factory;

public class FactoryTest {

    public static void main(String args[]) {
        String client1 = "Jan Nowak";
        String client2 = "Janusz Kowalski";
        String client3 = "Dawid Topolski";
        String client4 = "Dariusz Kaczmarczyk";

        Factory factory = new SimpleNotifiationFactory();

        Notification smsNotification1 = factory.create("SMSNotification");
        Notification smsNotification2 = factory.create("SMSNotification");

        smsNotification1.setTitle("Reminder");
        smsNotification1.setContent("Reminder for payment");
        smsNotification1.notify(client1, "501839510");

        smsNotification2.setTitle("Discounts");
        smsNotification2.setContent("Recomendation to check out new discounts");
        smsNotification2.notify(client3, "889646107");

        Notification emailNotification = factory.create("EmailNotification");

        emailNotification.setTitle("Contract extension");
        emailNotification.setContent("In connection with expiration of the contact, check ou our special offer");
        emailNotification.notify(client2, "client2@domain.com");

        Notification faxNotification = factory.create("FaxNotification");

        faxNotification.setTitle("Report");
        faxNotification.setContent("Daily transfer usage report...");
        faxNotification.notify(client4, "62 26-79-831");


    }
}

