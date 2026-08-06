public class Employee{
    int empId;
    String empName;
    double salary;

    void setDetails(int id, String name, double sal){
        empId=id;
        empName=name;
        salary=sal;
    }
    void display(){
        System.out.println("Employee Details\n----------------");
        System.out.println("ID : "+empId);
        System.out.println("Name : "+empName);
        System.out.println("Salary : "+salary);
    }
    public static void main(String[] args) {
        Employee obj=new Employee();
        obj.setDetails(201,"Rahul",55000);
        obj.display();
    }
}