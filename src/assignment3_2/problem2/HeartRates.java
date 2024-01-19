/**
 * Created by: Businge Pius
 * Company : Gegabox
 * Year : 2024
 * Date : 18/01/2024
 * Time : 20:40
 * Project Name : assignment3_2.problem2
 */
package assignment3_2.problem2;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class HeartRates {
    private String firstName;
    private String lastName;
    private String datOfBirth;

    public HeartRates(String firstName, String lastName, String datOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.datOfBirth = datOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDatOfBirth() {
        return datOfBirth;
    }

    public void setDatOfBirth(String datOfBirth) {
        this.datOfBirth = datOfBirth;
    }

    public int calculateAge() {
        LocalDate dateOfBirth = LocalDate.parse(datOfBirth,DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        LocalDate today = LocalDate.now();
        return Period.between(dateOfBirth, today).getYears();
    }

    public int maxHeartRate() {
        return 220 - calculateAge();
    }

    public void targetHeartRateRange() {
        int RHR = 70;
        int MHR = maxHeartRate();
        int AHR = MHR - RHR;
        double LB = 0.5;
        double UB = 0.85;
        double LBTHR = (AHR + LB) + RHR;
        double UBTHR = (AHR + UB) + RHR;
        System.out.println("The Target Heart Rate Range is between " + LBTHR + " and " + UBTHR);
    }

    @Override
    public String toString() {
        targetHeartRateRange();
        return "First Name : "+firstName+"\nLast Name : "+lastName+"\nAge: "+calculateAge()+"\nDate of Birth : "+datOfBirth+"\nMaximum Heart Rate : "+maxHeartRate()+"\n";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter your first name");
        String firstName = sc.nextLine();
        System.out.println("Please, enter your last name");
        String lastName = sc.nextLine();
        System.out.println("Please enter your date in the format-(yyyy-mm-dd)-Example 1989-4-14");
        String dateOfBirth = sc.next();
        sc.close();
        HeartRates htr = new HeartRates(firstName,lastName,dateOfBirth);
        System.out.println(htr);
    }
}

