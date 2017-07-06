package adrspo.design.patterns.structural.decorator;

public class BasicComputer implements ComputerAssembler {

    @Override
    public void assemble() {
        System.out.println("Assembling basic computer");
    }

}
