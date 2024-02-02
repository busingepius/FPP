package lectures;

/**
 * Created by: Businge Pius
 * Company : Gegabox
 * Year : 2024
 * Date : 18/01/2024
 * Time : 10:44
 * Project Name : PACKAGE_NAME
 */

public class Student {
    public String name;
    public static String schoolName;
    {
        // instance block
        name="John";
        System.out.println("Hello");
    }
    static{
        // static block
        schoolName="Fairfield High";
    }
    public Student(String name){
        System.out.println(name);
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

}
