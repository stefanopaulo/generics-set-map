package application;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import entities.Student;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Set<Student> setA = new TreeSet<>();
		// Set<Student> setB = new TreeSet<>();
		// Set<Student> setC = new TreeSet<>();
		
		System.out.print("How many students for course A? ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			int cod = sc.nextInt();
			
			setA.add(new Student(cod));
		}
		
		System.out.print("How many students for course B? ");
		n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			int cod = sc.nextInt();
			
			setA.add(new Student(cod));
		}
		
		System.out.print("How many students for course C? ");
		n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			int cod = sc.nextInt();
			
			setA.add(new Student(cod));
		}
		
		System.out.println("Total students: " + setA.size());
		
		sc.close();

	}

}
