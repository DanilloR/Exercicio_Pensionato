package boardingSchool;

import java.util.Scanner;

import entities.Student;

public class ProgramBoardingSchool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("How many rooms will be rented? ");
		int rooms = sc.nextInt();
		Student [] vect = new Student [10];
		
		
		for (int i=0;i<rooms;i++) {
			sc.nextLine();
			System.out.println();
			System.out.print("Enter student name: ");
			String name = sc.nextLine();
			System.out.print("Enter student email: ");
			String email = sc.nextLine();
			System.out.print("Enter room's number: ");
			int choice = sc.nextInt();			
			vect [choice] = new Student (name,email);
			//System.out.println();
		}
		
		System.out.println();
		
		for (int i=0;i<vect.length;i++) {
			if (vect[i]!=null) {
				System.out.println(i+": "+vect[i]);
			}
		}
		
		sc.close();

	}

}
