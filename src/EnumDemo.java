
/**
 * Created by: Businge Pius
 * Company : Gegabox
 * Year : 2024
 * Date : 19/01/2024
 * Time : 11:28
 * Project Name : PACKAGE_NAME
 */

enum Month {
    JAN,FEB,MAR,APR,MAY,JUN,JUL,AUG,SEP,OCT,NOV,DEC
}

public class EnumDemo{
    public static void main(String[] args) {
        Integer x = 10;
        int res = x.compareTo(12);
        System.out.println(res);
        for(Month mon: Month.values()){
            System.out.println("Month name: "+mon.name()+" and position: "+mon.ordinal());
        }
    }
}
