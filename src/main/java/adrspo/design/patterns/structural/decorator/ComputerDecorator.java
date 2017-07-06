package adrspo.design.patterns.structural.decorator;

public abstract class ComputerDecorator implements ComputerAssembler {

    protected ComputerAssembler computer;

    public ComputerDecorator(ComputerAssembler computer) {
        this.computer = computer;
    }

    @Override
    public void assemble() {
        computer.assemble();
    }

}
