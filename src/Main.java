import java.util.Random;

/**
 * Created by: Businge Pius
 * Company : Gegabox
 * Year : 2024
 * Date : 16/01/2024
 * Time : 10:23
 * Project Name : PACKAGE_NAME
 */

public class Main {
    public static void main(String[] args) {
        // substring
        String name = "Robert";
        System.out.println(name.substring(0,3));
        System.out.println(name.substring(0,name.length()));
        System.out.println(name.substring(0,1));
        System.out.println(name.substring(0,0));

        //  indexOf
        System.out.println(name.indexOf('t'));
        System.out.println(name.indexOf("bert"));

        // startsWith
        System.out.println(name.startsWith("Rob"));
        System.out.println(name.startsWith("R"));
        System.out.println(name.startsWith("bert"));

        // concatenation
        String space = " ";
        String lastName = "Stevens";
        System.out.println(name + space + lastName);

        // equals
        System.out.println(name.equals("Robert"));
        String newName = new String("Robert");
        System.out.println(newName == "Robert");
        System.out.println(newName.equals("Robert"));

        // == compares memory address while equals compares content
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");
        String str4 = new String("Hello");
        String str5 = str4;
        System.out.println(str1==str2); // true
        System.out.println(str2==str3); // false
        System.out.println(str3==str4); // false
        System.out.println(str4==str5); // true
    }
}
