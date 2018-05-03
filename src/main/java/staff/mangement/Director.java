package staff.mangement;

public class  Director  extends Manager {
    Director director;
    private double budget;

    public Director(String name, String ni, int salary, String deptname, double budget) {
        super(name, ni, salary, deptname);
        this.director = director;
        this.budget = budget;


    }

    public double getBudget() {
        return budget;
    }
}
