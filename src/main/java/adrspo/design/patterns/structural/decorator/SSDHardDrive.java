package adrspo.design.patterns.structural.decorator;

public class SSDHardDrive extends ComputerDecorator {

    @Override
    public void assemble() {
        computer.assemble();

        System.out.println("Installing SSD hard drive");
    }

    public SSDHardDrive(ComputerAssembler computer) {
        super(computer);
    }

}
