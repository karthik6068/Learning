package edu;

public class IfElseStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int studentAge = 26;

		if (studentAge <= 10)
			System.out.println("He is eligible for kindergarden");
		else if (studentAge > 25)
			System.out.println("He is eligible for University");

		else
			System.out.println("He is eligible for high school");
	}
}
