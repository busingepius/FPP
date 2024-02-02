package assignment11;
import java.util.*;
public class Admin {
	public static HashMap<Key, Student> processStudents(List<Student> students) {
		//implement
		HashMap<Key, Student> hashMap = new HashMap<>();
		for(Student student : students){
		Key key = new Key(student.getFirstName(), student.getLastName());
			hashMap.put(key,student);
		}
		return hashMap;
	}
	public static double computeAverageGPA(HashMap<Key,Student> maps){
               //implements
		double gpa = 0, count = 0;
		for(Map.Entry entry: maps.entrySet()){
			Student student = (Student)entry.getValue();
			gpa = gpa + student.getGpa();count++;
		}
		return gpa/count;
}
}
