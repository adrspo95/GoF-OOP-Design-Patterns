package adrspo.design.patterns.creational.factorymethod;

public class EmailNotificationCreator implements Creator {

    @Override
    public Notification createNotification() {
        return new EmailNotification();
    }

}
