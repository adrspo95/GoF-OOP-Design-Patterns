package adrspo.design.patterns.structural.decorator;

public class WindowsOS extends ComputerDecorator {

    @Override
    public void assemble() {
        computer.assemble();

        System.out.println("Installing Windows OS");
    }

    public WindowsOS(ComputerAssembler computer) {
        super(computer);
    }

}
