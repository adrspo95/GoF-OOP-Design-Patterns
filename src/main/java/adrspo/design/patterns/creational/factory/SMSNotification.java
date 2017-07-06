package adrspo.design.patterns.creational.factory;

public class SMSNotification extends Notification {

    @Override
    public void notify(String recipent, String phoneNumber) {
        System.out.println("Sending sms to: " + recipent + ", with number: " + phoneNumber + ", title: " + getTitle() +
                " and content: " + getContent());
    }

}
