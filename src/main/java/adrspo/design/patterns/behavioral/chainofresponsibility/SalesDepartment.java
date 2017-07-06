package adrspo.design.patterns.behavioral.chainofresponsibility;

public class SalesDepartment extends DepartmentChain {

    @Override
    public boolean redirect(ClientCall call) {
        if (call.getDepartament().equals(Departaments.SALES)) {

            System.out.println("Connecting client " + call.getName() + "to Sales Departament");

            return true;

        } else if (nextDepartment != null)
            return nextDepartment.redirect(call);

        else return false;
    }

}
