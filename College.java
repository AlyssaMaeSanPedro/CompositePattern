import java.util.ArrayList;
import java.util.List;

public class College implements EducationalUnit {
    private String name;
    private List<EducationalUnit> components = new ArrayList<>();

    public College(String name) {
        this.name = name;
    }

    public void add(EducationalUnit unit) {
        components.add(unit);
    }

    public void remove(EducationalUnit unit) {
        components.remove(unit);
    }

    @Override
    public int getNumberOfStudents() {
        int total = 0;
        for (EducationalUnit unit : components) {
            total += unit.getNumberOfStudents();
        }
        return total;
    }

    @Override
    public double getBudget() {
        double total = 0;
        for (EducationalUnit unit : components) {
            total += unit.getBudget();
        }
        return total;
    }

    @Override
    public void displayDetails() {
        System.out.println("\n=== " + name + " ===");
        for (EducationalUnit unit : components) {
            unit.displayDetails();
        }
    }
}
