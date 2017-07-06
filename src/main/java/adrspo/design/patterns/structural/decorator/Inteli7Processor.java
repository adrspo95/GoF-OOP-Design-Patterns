package adrspo.design.patterns.structural.decorator;

public class Inteli7Processor extends ComputerDecorator {

    public Inteli7Processor(ComputerAssembler computer) {
        super(computer);
    }

    @Override
    public void assemble() {
        computer.assemble();
        System.out.println("Installing Intel i7 Processor");
    }

}
