package adrspo.design.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Employee {

    private String name;
    private String departament;
    private int salary;

    private List<Employee> subortinates;

    public Employee(String name, String departament, int salary) {
        this.name = name;
        this.departament = departament;
        this.salary = salary;
        this.subortinates = new ArrayList<Employee>();
    }

    public void addSubordinate(Employee employee) {
        subortinates.add(employee);
    }

    public void removeSubordinate(Employee employee) {
        subortinates.remove(employee);
    }

    public List<Employee> getSubortinates() {
        return subortinates;
    }


    @Override
    public String toString() {
        return "Employee [name=" + name + ", departament=" + departament
                + ", salary=" + salary + "]";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartament() {
        return departament;
    }

    public void setDepartament(String departament) {
        this.departament = departament;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


}
