package adrspo.design.patterns.behavioral.chainofresponsibility;

public class HRDepartment extends DepartmentChain {

    @Override
    public boolean redirect(ClientCall call) {
        if (call.getDepartament().equals(Departaments.HR)) {

            System.out.println("Connecting client " + call.getName() + "to HR Departament");

            return true;

        } else if (nextDepartment != null)
            return nextDepartment.redirect(call);

        else {
            return false;
        }

    }

}
