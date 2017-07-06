package adrspo.design.patterns.behavioral.mediator;

public class MediatorTest {

    public static void main(String[] args) {
        Auction auction = new Auction(0);
        Client client1 = new Client("Adrian", 50);
        Client client2 = new Client("Dawid", 120);
        Client client3 = new Client("Jan", 70);

        Mediator mediator = Mediator.getInstance();
        mediator.add(auction, client1);
        mediator.add(auction, client2);
        mediator.add(auction, client3);

        for (int i = 0; i < 150; i++) {
            auction.setPrice(i);
        }

    }

}
