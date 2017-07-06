package adrspo.design.patterns.creational.factorymethod;

public class FaxNotificationCreator implements Creator {

    @Override
    public Notification createNotification() {
        return new FaxNotification();
    }

}
