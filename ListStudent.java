package thinkQ;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class ListStudent {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		List<Student> student= new ArrayList<Student>();
		
		//List<String> secondList = new ArrayList<String>();
		
		System.out.println("enter the number of student to add in the list: ");
		int studNum = scn.nextInt();
		for(int i = 0; i<=studNum-1; i++ ) {
			System.out.println("enter the student name: ");
			String name = scn.next();
			
			System.out.println("enter the score:");
			
			int score = scn.nextInt();
			
			Student stud = new Student(score, name);
			
			stud.setName(name);
			stud.setScore(score);
			student.add(stud);
			}
		
		for(Student li :student) {
			System.out.println("Name : " +li.getName()+ " marks " + li.getScore());
		}
		
	

	}

	
}
