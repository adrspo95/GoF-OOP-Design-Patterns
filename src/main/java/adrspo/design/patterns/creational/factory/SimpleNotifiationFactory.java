package adrspo.design.patterns.creational.factory;

public class SimpleNotifiationFactory implements Factory {

    @Override
    public Notification create(String name) {
        switch (name) {
            case "EmailNotification":
                return new EmailNotification();
            case "SMSNotification":
                return new SMSNotification();
            case "FaxNotification":
                return new FaxNotification();
            default:
                System.out.println("Wrong name. Object was not created");
        }
        return null;
    }

}
