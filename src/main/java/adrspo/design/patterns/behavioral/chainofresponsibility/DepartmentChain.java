package adrspo.design.patterns.behavioral.chainofresponsibility;

public abstract class DepartmentChain {

    protected DepartmentChain nextDepartment;

    public void setNext(DepartmentChain dept) {
        nextDepartment = dept;
    }

    public abstract boolean redirect(ClientCall call);
}
