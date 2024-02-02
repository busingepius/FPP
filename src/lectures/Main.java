package lectures;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

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
//        // substring
//        String name = "Robert";
//        System.out.println(name.substring(0, 3));
//        System.out.println(name.substring(0, name.length()));
//        System.out.println(name.substring(0, 1));
//        System.out.println(name.substring(0, 0));
//
//        //  indexOf
//        System.out.println(name.indexOf('t'));
//        System.out.println(name.indexOf("bert"));
//
//        // startsWith
//        System.out.println(name.startsWith("Rob"));
//        System.out.println(name.startsWith("R"));
//        System.out.println(name.startsWith("bert"));
//
//        // concatenation
//        String space = " ";
//        String lastName = "Stevens";
//        System.out.println(name + space + lastName);
//
//        // equals
//        System.out.println(name.equals("Robert"));
//        String newName = new String("Robert");
//        System.out.println(newName == "Robert");
//        System.out.println(newName.equals("Robert"));
//
//        // == compares memory address while equals compares content
//        String str1 = "Hello";
//        String str2 = "Hello";
//        String str3 = new String("Hello");
//        String str4 = new String("Hello");
//        String str5 = str4;
//        System.out.println(str1 == str2); // true
//        System.out.println(str2 == str3); // false
//        System.out.println(str3 == str4); // false
//        System.out.println(str4 == str5); // true
//
//        System.out.println("a".compareTo("b")); // A = 65, a= 97 and B = 66, b = 98 Hence 97 - 98 = -1
//        System.out.println("b".compareTo("a")); // 98 - 97 = 1
//        System.out.println("a".compareTo("a")); // 97 - 97 = 0
//
//        int sales = 1;
//        int target = 2;
//        String performance = "";
//        int bonus;
//        if (sales >= 2 * target) {
//            performance = "Excellent";
//            bonus = 100;
//        } else if (sales >= target) {
//            performance = "Satisfactory";
//            bonus = 50;
//        } else {
//            performance = "Unsatisfactory";
//            bonus = 0;
//        }
//
//        if (sales >= 2 * target) {
//            performance = "Excellent";
//            bonus = 100;
//        } else {
//            if (sales >= target) {
//                performance = "Satisfactory";
//                bonus = 500;
//            } else {
//                performance = "Unsatisfactory";
//                bonus = 0;
//            }
//        }
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Type your name");
//        String nextLine = sc.nextLine();
//        int count = 0;
//        for (int i = 0; i < nextLine.length(); i++) {
//            if (nextLine.charAt(i) == 'e') {
//                count++;
//            }
//        }
//        sc.close();
//        System.out.println(count);
//
//        count = 0;
//        while (count < 5) {
//            System.out.println(count);
//            count++;
//        }
//        System.out.print("-".repeat(10));
//        int count2 = 10;
//        do {
//            System.out.println(count2);
//            count2--;
//        } while (count2 >= 0);
//
//        boolean condition = false;
//        while (condition) {
//            System.out.println("Hello");
//        }
//        do {
//            System.out.println("Hello");
//        } while (condition);
//
//        Scanner scc = new Scanner(System.in);
//        System.out.println("Pick an integer in the range 1...9");
//        int val = scc.nextInt();
//        System.out.println();
//        switch (val) {
//            case 2:
//            case 4:
//            case 6:
//            case 8:
//                System.out.println("You chose an even number");
//                break;
//            default:
//                System.out.println("You chose an odd number");
//        }
//        scc.close();

//        String str = "Hello,strings can be fun. They have many uses.";
//        System.out.println("here");
//        System.out.println(Arrays.toString(str.split(",| |\\. |\\.")));
//
//        int[] arr = {4,5,12,25};
//        for (int x:arr){
//            System.out.println(x);
//        }
//
//        char[] cArray = {'p','i','u','s'};
//        for (char c : cArray){
//            System.out.println(c);
//        }

//        int[] smallPrimes = {2,3,5,7,11};
//        int[] copy = new int[5];
//        System.arraycopy(smallPrimes, 0, copy,0,5);
//
//        int[] luckNumbers = {350,400,150,200,250};
//        System.arraycopy(smallPrimes,1,luckNumbers,3,2);
//
//        Arrays.sort(luckNumbers);
//        System.out.println(Arrays.toString(luckNumbers));
//        String[][] teams = {
//                {"Joe","Bob","Frank","Steve"},
//                {"Jon","Tom","David","Ralph"},
//                {"Tim","Bev","Susan","Dennis"},
//        };
//        System.out.println("Hello World!");

        String number = "28";
        int n = Integer.parseInt(number);
        Integer value = Integer.valueOf(n);
        System.out.println(n);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("YYYY-MM-DD");
        LocalDate dateParsed = LocalDate.parse("2014-12-04");
//        LocalDate formattedDate = dateParsed.format(formatter);
        LocalDate oldDate = LocalDate.of(2014,12,04);
        Period period = Period.between(dateParsed,LocalDate.now());
        int numberOfYears = period.getDays();
        System.out.println(numberOfYears);
        System.out.println("\\");
    }
}
