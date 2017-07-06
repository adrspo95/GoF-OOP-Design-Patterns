package adrspo.design.patterns.creational.factorymethod;

public class FaxNotification extends Notification {

    @Override
    public void notify(String to, String address) {
        System.out.println("Wysy�anie faksu do " + to + " pod numer " + address + " o tytule " + getTitle() +
                " i tresci: " + getContent());
    }

}
