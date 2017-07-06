package adrspo.design.patterns.creational.factory;

public class EmailNotification extends Notification {

    @Override
    public void notify(String recipent, String emailAddress) {
        System.out.println("Sending email to: " + recipent + " with email address: " + emailAddress + ", title: " + getTitle() +
                " and content: " + getContent());
    }

}
