package adrspo.design.patterns.behavioral.observer;

public class ObserverTest {

	public static void main(String[] args) {
		Auction auction = new Auction(0);
		Client client1 = new Client("Adrian", 50);
		Client client2 = new Client("Dawid", 120);
		Client client3 = new Client("Jan", 70);
		
		auction.addObserver(client1);
		auction.addObserver(client2);
		auction.addObserver(client3);
		
		for(int i=0;i<150;i++){
			auction.setPrice(i);
		}

	}

}
