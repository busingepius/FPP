/**
 * Created by: Businge Pius
 * Company : Gegabox
 * Year : 2024
 * Date : 23/01/2024
 * Time : 16:12
 * Project Name : assignment5.problem5
 */
package assignment5.problem5;

public class Main {
    public static void main(String[] args) {
        Computer computer1 = new Computer("DELL","Intel",4,2.76);
        Computer computer2 = new Computer("DELL","Intel",4,2.76);
//        Computer computer2 = new Computer("APPLE","Silicon",16,4.45);
        System.out.println(computer1.equals(computer2));
        System.out.println(computer1.hashCode());
        System.out.println(computer2.hashCode());

    }
}
