package adrspo.design.patterns.structural.flyweight;

public abstract class Shape {

    private String size;
    private String name;

    public static class Size {
        public static final String SMALL = "small";
        public static final String MEDIUM = "medium";
        public static final String BIG = "big";
    }

    abstract void display();

    public Shape(String size, String name) {
        this.size = size;
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
