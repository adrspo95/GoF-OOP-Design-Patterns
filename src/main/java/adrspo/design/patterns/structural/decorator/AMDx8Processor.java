package adrspo.design.patterns.structural.decorator;

public class AMDx8Processor extends ComputerDecorator {

    public AMDx8Processor(ComputerAssembler computer) {
        super(computer);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Installing AMDx8 processor");
    }


}
