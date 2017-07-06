package adrspo.design.patterns.behavioral.chainofresponsibility;

public class ClientCall {

    private String departament;
    private final String name;

    public ClientCall(String name, String departament) {
        this.departament = departament;
        this.name = name;
    }

    public String getDepartament() {
        return departament;
    }

    public void setDepartament(String departament) {
        this.departament = departament;
    }

    public String getName() {
        return name;
    }

}
