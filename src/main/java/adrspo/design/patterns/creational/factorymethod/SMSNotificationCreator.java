package adrspo.design.patterns.creational.factorymethod;

public class SMSNotificationCreator implements Creator {

    @Override
    public Notification createNotification() {
        return new SMSNotification();
    }

}
