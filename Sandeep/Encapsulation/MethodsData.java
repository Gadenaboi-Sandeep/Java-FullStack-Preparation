package Sandeep.Encapsulation;

class Details{
    private String name="Sandeep";
    private int age=22;

    void getName(){
        System.out.println(name);
    }
    void getAge(){
        System.out.println(age);
    }

}


public class MethodsData {
    public static void main(String[] args) {
        Details obj=new Details();
        obj.getName();
        obj.getAge();
    }
}
