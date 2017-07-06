package adrspo.design.patterns.structural.decorator;

public class Inteli5Processor extends ComputerDecorator {

    public Inteli5Processor(ComputerAssembler computer) {
        super(computer);
    }

    @Override
    public void assemble() {
        computer.assemble();
        System.out.println("Installing Intel i5 processor");
    }

}
