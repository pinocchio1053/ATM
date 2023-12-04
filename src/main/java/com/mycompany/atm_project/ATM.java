package com.mycompany.atm_project;

import java.io.IOException;

public class ATM {

	public static void main(String[] args) throws IOException {
		OptionMenu optionMenu = new OptionMenu();
		introduction();
		optionMenu.mainMenu();
	}

	public static void introduction() {
		
            System.out.println("'''''''''''''''''''''''''''''''''''''");
            System.out.println("'                                   '");
            System.out.println("'    Welcome to Java_ATM Machine!   '");
            System.out.println("'                                   '");
            System.out.println("'   Copyright: Golam Ahmed Mugdha   '");
            System.out.println("'    Student ID: 221-35-1053        '");
            System.out.println("'''''''''''''''''''''''''''''''''''''");
	}
}
