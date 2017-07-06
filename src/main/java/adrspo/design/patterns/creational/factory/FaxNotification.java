package adrspo.design.patterns.creational.factory;

public class FaxNotification extends Notification {

    @Override
    public void notify(String recipent, String faxNumber) {
        System.out.println("Sending fax to: " + recipent + " with number: " + faxNumber + ", title: " + getTitle() +
                " and content: " + getContent());
    }

}
