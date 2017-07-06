package adrspo.design.patterns.structural.decorator;

public class LinuxOS extends ComputerDecorator {

    @Override
    public void assemble() {
        computer.assemble();

        System.out.println("Installing Linux OS");
    }

    public LinuxOS(ComputerAssembler computer) {
        super(computer);
    }

}
