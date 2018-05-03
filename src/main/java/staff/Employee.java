package staff;

public abstract class Employee {
    Employee employee;

    private String name;
    private String ni;
    private int salary;

    public Employee(String name, String ni, int salary) {
        this.name = name;
        this.ni = ni;
        this.salary = salary;
    }

    public Employee getEmployee() {
        return employee;
    }

    public String getName() {
        return name;
    }

    public String getNi() {
        return ni;
    }

    public int getSalary() {
        return salary;
    }
    public void raiseSalary(Double increment){
         salary += increment;
    }
    public int payBonus(){
        return salary / 100;
    }
}
