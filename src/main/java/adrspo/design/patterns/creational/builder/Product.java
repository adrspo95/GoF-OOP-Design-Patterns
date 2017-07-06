package adrspo.design.patterns.creational.builder;

public class Product {

    private String name;
    private int sizeX, sizeY, sizeZ;
    private double weight, price;

    @Override
    public String toString() {
        return "Product [name=" + name + ", sizeX=" + sizeX + ", sizeY="
                + sizeY + ", sizeZ=" + sizeZ + ", weight=" + weight
                + ", price=" + price + "]";
    }

    public static class Builder {

        private String name;

        private int sizeX, sizeY, sizeZ;
        private double weight, price;

        public Builder(String name) {
            this.name = name;
        }

        public Builder sizeX(int sizeX) {
            this.sizeX = sizeX;
            return this;
        }

        public Builder sizeY(int sizeY) {
            this.sizeY = sizeY;
            return this;
        }

        public Builder sizeZ(int sizeZ) {
            this.sizeZ = sizeZ;
            return this;
        }

        public Builder weight(double weight) {
            this.weight = weight;
            return this;
        }

        public Builder price(double price) {
            this.price = price;
            return this;
        }

        public Product build() {
            return new Product(this);
        }
    }

    private Product(Builder builder) {
        this.name = builder.name;
        this.sizeX = builder.sizeX;
        this.sizeY = builder.sizeY;
        this.sizeZ = builder.sizeZ;
        this.weight = builder.weight;
        this.price = builder.price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSizeX() {
        return sizeX;
    }

    public void setSizeX(int sizeX) {
        this.sizeX = sizeX;
    }

    public int getSizeY() {
        return sizeY;
    }

    public void setSizeY(int sizeY) {
        this.sizeY = sizeY;
    }

    public int getSizeZ() {
        return sizeZ;
    }

    public void setSizeZ(int sizeZ) {
        this.sizeZ = sizeZ;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
