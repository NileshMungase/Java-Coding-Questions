package com.nt.programs;

public class VotingProgram {

	public static void main(String[] args) {
		int age = 2000;
		char gender = 'M';
		if (age != 0 && age < 100) {
			if (age >= 18 && gender == 'M') {
				System.out.println("Males are eligible for voting ");
			} else if (age >= 18 && gender == 'F') {
				System.out.println("Females are eligible for voting ");
			} else {
				System.out.println("Not eligible for voting ");
			}
		} else {
			System.out.println("Enter valid input ");
		}
	}

}
