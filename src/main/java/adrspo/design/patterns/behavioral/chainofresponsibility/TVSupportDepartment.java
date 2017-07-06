package adrspo.design.patterns.behavioral.chainofresponsibility;

public class TVSupportDepartment extends DepartmentChain {

    @Override
    public boolean redirect(ClientCall call) {
        if (call.getDepartament().equals(Departaments.TV_SUPPORT)) {

            System.out.println("Connecting client " + call.getName() + "to TV Support Departament");

            return true;

        } else if (nextDepartment != null)
            return nextDepartment.redirect(call);

        else {
            return false;
        }
    }

}
