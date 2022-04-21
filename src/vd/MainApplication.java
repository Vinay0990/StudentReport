package vd;

import java.util.Scanner;

public class MainApplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Input Regarding student
		
		System.out.format("%40s %20s %40s", "", "Welcome to Student Report", "");
		System.out.println();
		System.out.println("Please enter student name? ");
		String name = sc.nextLine();
		
		System.out.println("Please enter student id? ");
		int id = sc.nextInt();
		
		System.out.println("Please enter student standard? ");
		String std = sc.next();
		
		// Input Marks

		System.out.println("Please enter student marks? ");
		String[] subs = {"English", "Science", "Geography", "Math", "Social Science", "PT"};
		int[] marks = new int[6];
		
		for(int i=0;i<subs.length;i++) {
			System.out.print(subs[i]);
			marks[i] = sc.nextInt();
			System.out.println();
		}
		
		Student st = new Student(id, name, std, marks);
		// Output tabulated result

		System.out.format("%40s %20s %40s", "", "Student Report", "");

		System.out.format("%30s %30s %30s", "id", "name", "std");
		System.out.format("%30s %30s %30s", st.getId(), st.getName(), st.getStd());
		System.out.println();

		System.out.format("%30s %30s %30s", "subject", "total marks", "marks obt");
		for(int i=0;i<subs.length;i++) {
			System.out.format("%30s %30s %30s", subs[i], 100, st.getMarks()[i]);
			System.out.println();
		}
		
		System.out.println("Overall score   " + st.getFinalScore());
	}
}
