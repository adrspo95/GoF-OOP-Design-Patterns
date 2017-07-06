package adrspo.design.patterns.structural.decorator;

public class DecoratorTest {

    public static void main(String[] args) {
        ComputerAssembler computer = new BasicComputer();
        computer = new Inteli5Processor(computer);
        computer = new WindowsOS(new SSDHardDrive(computer));

        computer.assemble();
    }

}
