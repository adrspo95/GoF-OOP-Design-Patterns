package adrspo.design.patterns.creational.factorymethod;

public class SMSNotification extends Notification {

    @Override
    public void notify(String to, String address) {
        System.out.println("Wysy�anie SMS do " + to + " na numer " + address + " o tytule " + getTitle() +
                " i tresci: " + getContent());
    }

}
