/**
 * Created by: Businge Pius
 * Company : Gegabox
 * Year : 2024
 * Date : 29/01/2024
 * Time : 17:09
 * Project Name : assignment8.problem3
 */
package assignment8.problem3;

import java.util.*;

public class Marketing {
    private String employeeName;
    private String productName;


    private int salesAmount;

    public Marketing(String employeeName, String productName, int salesAmount) {
        this.employeeName = employeeName;
        this.productName = productName;
        this.salesAmount = salesAmount;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getProductName() {
        return productName;
    }

    public int getSalesAmount() {
        return salesAmount;
    }

    // toString()
    public String toString() {
        return "Marketing{employeeName: " + employeeName +
                ", productName: " + productName +
                ", salesAmount: " + salesAmount +
                "}";
    }

    // equals
    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || object.getClass() != getClass()) return false;
        Marketing marketing = (Marketing) object;
        return marketing.getEmployeeName().equals(employeeName)
                &&
                marketing.getProductName().equals(productName)
                &&
                salesAmount == marketing.getSalesAmount();
    }

    // hashCode
    public int hashCode() {
        return Objects.hash(employeeName, productName, salesAmount);
    }


}

class Main {
    static List<Marketing> marketings = new ArrayList<>();

    public static void main(String[] args) {
        marketings.add(new Marketing("abrass", "Lotion1", 999));
        var kedi2 = new Marketing("kedikeba22", "Lotion2", 1234);
        marketings.add(kedi2);
        marketings.add(new Marketing("caleb", "Lotion3", 67));
        marketings.add(new Marketing("badsd", "Lotion4", 1200));
        marketings.add(new Marketing("abass", "Lotion5", 34590));
        marketings.add(new Marketing("abass", "Lotion5", 90));
        marketings.remove(kedi2);
        System.out.println(marketings.size());
        Collections.sort(marketings, new Comparator<Marketing>() {
            @Override
            public int compare(Marketing o1, Marketing o2) {
                return o1.getSalesAmount() - o2.getSalesAmount();
            }
        });
//        System.out.println(marketings);
        System.out.println(listMoreThan1000(marketings));
    }

    public static List<Marketing> listMoreThan1000(List<Marketing> list) {
        List<Marketing> marketingList = new ArrayList<>();
        for (Marketing marketing : list) {
            if (marketing.getSalesAmount() > 1000) {
                marketingList.add(marketing);
            }
        }
        Collections.sort(marketingList, new Comparator<Marketing>() {
            @Override
            public int compare(Marketing o1, Marketing o2) {
                return o1.getEmployeeName().compareTo(o2.getEmployeeName());
            }
        });
        return marketingList;
    }
}
