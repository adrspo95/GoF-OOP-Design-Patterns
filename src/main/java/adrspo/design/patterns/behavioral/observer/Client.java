package adrspo.design.patterns.behavioral.observer;

import java.util.Observable;
import java.util.Observer;

public class Client implements Observer {

	private final String name;
	private double maxPrice;
	
	public Client(String name,double maxPrice) {
		this.name = name;
		this.maxPrice = maxPrice;
	}
	
	@Override
	public void update(Observable observable, Object price) {

		if(observable instanceof Auction){
			System.out.println(name+": I was notyfied about price "+price);
			
			double currentPrice = (Double)price;
			if(maxPrice<currentPrice){
				System.out.println(name+": I withraw from the auction");
				observable.deleteObserver(this);
			}
			
		}

	}

	public double getMaxPrice() {
		return maxPrice;
	}

	public void setMaxPrice(double maxPrice) {
		this.maxPrice = maxPrice;
	}

	public String getName() {
		return name;
	}
	
	

}
