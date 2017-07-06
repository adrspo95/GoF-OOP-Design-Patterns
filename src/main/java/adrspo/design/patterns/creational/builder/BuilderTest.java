package adrspo.design.patterns.creational.builder;

public class BuilderTest {

    public static void main(String args[]) {
        Product product = new Product.Builder("Lenovo X210")
                .sizeX(30)
                .sizeY(6)
                .sizeZ(19)
                .weight(1.4)
                .build();

        System.out.println(product);
    }


}
