package Sandeep.Encapsulation;

class Details{
    private String name;
    private int age;

    public Details(){
        age=20;
        name="Sandy";
    }
    public Details(int a,String n){
        age=a;
        name=n;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
public class MethodsData {
    public static void main(String[] args) {
        Details obj=new Details();
        Details obj1=new Details(21,"Sandeep");
        System.out.println(obj.getName()+" : "+obj.getAge());
        System.out.println(obj1.getName()+" : "+obj1.getAge());
    }
}
