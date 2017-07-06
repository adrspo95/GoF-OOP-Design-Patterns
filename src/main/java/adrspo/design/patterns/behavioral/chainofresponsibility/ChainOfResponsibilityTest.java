package adrspo.design.patterns.behavioral.chainofresponsibility;

public class ChainOfResponsibilityTest {

    public static void main(String args[]) {

        ClientCall clientCall1 = new ClientCall("Adrian", Departaments.HR);
        ClientCall clientCall2 = new ClientCall("Dawid", Departaments.INTERNET_SUPPORT);
        ClientCall clientCall3 = new ClientCall("Jan", Departaments.SALES);

        DepartmentChain salesDept = new SalesDepartment();
        DepartmentChain hrDept = new HRDepartment();
        DepartmentChain rdDept = new RDDepartment();
        DepartmentChain tvSuppDept = new TVSupportDepartment();
        DepartmentChain intSuppDept = new InternetSupportDepartment();
        DepartmentChain telSuppDept = new TelephonySupportDepartment();

        salesDept.setNext(hrDept);
        hrDept.setNext(rdDept);
        rdDept.setNext(tvSuppDept);
        tvSuppDept.setNext(intSuppDept);
        intSuppDept.setNext(telSuppDept);

        salesDept.redirect(clientCall1);
        salesDept.redirect(clientCall2);
        salesDept.redirect(clientCall3);
    }


}
