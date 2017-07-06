package adrspo.design.patterns.behavioral.chainofresponsibility;

public class InternetSupportDepartment extends DepartmentChain {

    @Override
    public boolean redirect(ClientCall call) {
        if (call.getDepartament().equals(Departaments.INTERNET_SUPPORT)) {

            System.out.println("Connecting client " + call.getName() + "to Internet Support Departament");

            return true;

        } else if (nextDepartment != null)
            return nextDepartment.redirect(call);

        else {
            return false;
        }

    }

}
