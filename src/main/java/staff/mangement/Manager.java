package staff.mangement;

import staff.Employee;

public class Manager extends Employee{
    private String deptname;

    public Manager(String name, String ni, int salary, String deptname) {
        super(name, ni, salary);
        this.deptname = deptname;
    }

    public String getDeptname() {
        return deptname;
    }
}

