public class Employee1 {
    int id;
    String name;
    static int employeeCount;

    Employee1(int id, String name) {
        this.id = id;
        this.name = name;
        employeeCount++;
    }

    void display() {
        System.out.println("ID : " + id);
        System.out.println("Name : " + name);
    }

    public static void main(String[] args) {
        Employee1 e1 = new Employee1(101, "Rahul");
        Employee1 e2 = new Employee1(102, "Sandeep");
        Employee1 e3 = new Employee1(103, "Priya");
        e1.display();
        e2.display();
        e3.display();
        System.out.println("Total Employees : "+Employee1.employeeCount);

    }
}