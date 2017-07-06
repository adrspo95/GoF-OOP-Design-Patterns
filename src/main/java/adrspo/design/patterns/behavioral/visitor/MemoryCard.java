package adrspo.design.patterns.behavioral.visitor;

public class MemoryCard extends Item {

	private String type;
	
	public MemoryCard(int price, String name,String type) {
		super(price, name);
		this.type=type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public int accept(Visitor visitor) {
		return visitor.visit(this);
	}

}
