public class staticKeyword {
    static int age;
    static String name;

    static{
        age=22;
        name="Sandy";
    }
    static void show(){
        System.out.println(age+" -  "+name);
    }


    public static void main(String[] args) {
        //staticKeyword obj=new staticKeyword();
        show();
    }
}
