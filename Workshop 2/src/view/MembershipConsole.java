package view;

import java.util.Scanner;

public class MembershipConsole {

	public void printMemberChoises() {
		System.out.println("1.Create New Member"
				+ "\n2.Retrive Member info"
				+ "\n3.Update a Member"
				+ "\n4.Delete a Member");
	}
	
	public String printRetrieveMember() {
		Scanner input = new Scanner(System.in);
		System.out.println("please enter member ID:");
		return input.nextLine();
	}

}
