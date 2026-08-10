package Sandeep.Constructor;

public class BasicCon {
    String name;
    int age;

    public BasicCon(){
        this.name="Sandeep";
        this.age=21;
    }

    public static void main(String[] args) {
        BasicCon obj=new BasicCon();
        System.out.println(obj.age);
    }
}
