/**
 * Created by: Businge Pius
 * Company : Gegabox
 * Year : 2024
 * Date : 23/01/2024
 * Time : 13:57
 * Project Name : lecture5.reflection
 */
package lecture5.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class CompanyReflection {
    public static void main(String[] args) throws Exception{
        Company company = new Company("Veridian Solutions",24000);
        Class companyClass = company.getClass();
        System.out.println(companyClass.getName());
        System.out.println(companyClass.getSimpleName());
        Field[] fields = companyClass.getDeclaredFields();
        for (Field field:fields){
            if(field.getName().equals("name")){
                field.setAccessible(true);
                field.set(company,"NextGen Innovation");
            }
        }//
        System.out.println("Name of the company: "+company.getName());

        Method[] methods = companyClass.getDeclaredMethods();
        for (Method method:methods){
            if(method.getName().equals("setNumOfEmployees")){
                method.setAccessible(true);
                method.invoke(company,25000);
            }
        }
        System.out.println("Number of employees: "+company.getNumOfEmployees());
    }
}
