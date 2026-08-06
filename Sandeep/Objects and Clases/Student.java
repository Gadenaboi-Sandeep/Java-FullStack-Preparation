public class Student {
    int id;
    String name;
    double marks;
    public static void main(String[] args) {
        Student obj=new Student();
        obj.id=101;
        obj.name="Sandeep";
        obj.marks=92.5;
        System.out.println("Student Details");
        System.out.println("ID : "+obj.id);
        System.out.println("Name : "+obj.name);
        System.out.println("Marks :"+obj.marks);
    }
}
