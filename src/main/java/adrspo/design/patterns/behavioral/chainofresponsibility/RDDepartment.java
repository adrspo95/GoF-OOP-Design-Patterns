package adrspo.design.patterns.behavioral.chainofresponsibility;

public class RDDepartment extends DepartmentChain {

    @Override
    public boolean redirect(ClientCall call) {
        if (call.getDepartament().equals(Departaments.RD)) {

            System.out.println("Connecting client " + call.getName() + "to RD Departament");

            return true;

        } else if (nextDepartment != null)
            return nextDepartment.redirect(call);

        else {
            return false;
        }
    }

}
