public class Main {
    public static void main(String[] args) {

        // Students
        Student inigo = new Student("Inigo Cruz", "23-11111-101", 27000);
        Student maika = new Student("Maika Valdez", "22-23412-102", 28500);
        Student ravi  = new Student("Ravi Mendoza", "22-12341-103", 29000);
        Student clara = new Student("Clara Navarro", "24-24125-201", 30000);

        // Teachers
        Teacher selene = new Teacher("Prof. Selene Rivera", "Software Engineering", 58000);
        Teacher malik  = new Teacher("Prof. Malik Santiago", "Intelligent Systems", 65000);
        Teacher mia    = new Teacher("Dr. Mia Lorenzo", "Cognitive Psychology", 53000);

        // Departments
        Department csDepartment = new Department("Department of Computer Science");
        csDepartment.add(malik);
        csDepartment.add(inigo);
        csDepartment.add(maika);

        Department itDepartment = new Department("Department of Information Technology");
        itDepartment.add(selene);
        itDepartment.add(ravi);

        Department psychologyDepartment = new Department("Department of Psychology");
        psychologyDepartment.add(mia);
        psychologyDepartment.add(clara);

        // Colleges
        College cics = new College("College of Informatics and Computing Studies");
        cics.add(csDepartment);
        cics.add(itDepartment);

        College cas = new College("College of Arts and Sciences");
        cas.add(psychologyDepartment);

        cics.displayDetails();
        System.out.println("\nTotal Students: " + cics.getNumberOfStudents());
        System.out.println("Total Budget: ₱" + cics.getBudget());

        cas.displayDetails();
        System.out.println("\nTotal Students: " + cas.getNumberOfStudents());
        System.out.println("Total Budget: ₱" + cas.getBudget());
    }
}
