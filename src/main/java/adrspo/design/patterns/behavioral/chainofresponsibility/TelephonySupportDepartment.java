package adrspo.design.patterns.behavioral.chainofresponsibility;

public class TelephonySupportDepartment extends DepartmentChain {

    @Override
    public boolean redirect(ClientCall call) {
        if (call.getDepartament().equals(Departaments.TELEPHONY_SUPPORT)) {

            System.out.println("Connecting client " + call.getName() + "to Telephony Support Departament");

            return true;

        } else if (nextDepartment != null)

            return nextDepartment.redirect(call);
        else {
            return false;
        }
    }

}
