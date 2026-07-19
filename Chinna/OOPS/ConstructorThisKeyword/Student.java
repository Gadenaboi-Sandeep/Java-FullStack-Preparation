package Chinna.OOPS.ConstructorThisKeyword;

public class Student {
    int id;
    String name;

    Student(int id,String name){
        this.id=id;
        this.name=name;
    }
    void display(){
        System.out.println("Id: "+id);
        System.out.println("Name: "+name);
    }
    public static void main(String[] args) {
        Student st = new Student(40, "Chinna");
        st.display();
    }
}
