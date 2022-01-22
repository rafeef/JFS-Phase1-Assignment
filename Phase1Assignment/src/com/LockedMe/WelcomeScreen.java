package com.LockedMe;
import java.io.File;
import java.util.Scanner;

public class WelcomeScreen {
	
		
	private static Scanner userInput = new Scanner(System.in);
	public static void welcomeMethod() 
	{
		System.out.println("Welcome to LockedMe Application");
		System.out.println("This app is developed by Rafeef Abobakr");
	
	}
	
	
	public static void appDescription()
	{
		System.out.println("--------------------------------------------------------------");
		System.out.println(" Please enter one of the following options");
		System.out.println(" 1 : Add user");
		System.out.println(" 2 : remove user");
		System.out.println(" 3 : search for a user");
		System.out.println(" 4 : list all  users");
		System.out.println(" 5 : exist the app");
		
	}
	
	public static void addUser()
	{
		System.out.print("Please enter userName: ");		
		userInput = new Scanner(System.in);
		try
		{
			String userName = userInput.nextLine(); 
			UserHandling.addUser(userName);			
		}
		catch (Exception ex)
		{
			System.out.println("Please enter valid userName");
		}
	
	}
	
	public static void removeUser()
	{
		System.out.print("Please enter userName: ");
		userInput = new Scanner(System.in);
		try
		{
			String userName = userInput.nextLine(); 
			UserHandling.deleteUser(userName);
		}
		catch (Exception ex)
		{
			System.out.println("Please enter valid userName");
		}
	}
	
	public static void searchUser()
	{
		System.out.print("Please enter userName : ");
		userInput = new Scanner(System.in);
		try
		{
			String userName = userInput.nextLine();
			
			UserHandling.searchUser(new File (userName+".txt")) ;
		}
		catch (Exception ex)
		{
			System.out.println("Please enter valid userName");
		}
	}
	
	public static void displayAllUsers()
	{
		System.out.println("System Users are: ");
		UserHandling.sortUserNames();
	}
	
	public static void existApp()
	{
		System.out.println("App is closed :)");		
		System.exit(0);
		userInput.close();
	}

	public static void main(String[] args) 
	{
	
		welcomeMethod();
		appDescription();	
		 
		while (true)
		{
			
			System.out.print("write an option here: ");	
		    try
		    {	userInput = new Scanner(System.in);	    	
		    	int option =userInput.nextInt(); 
		    	
		    	switch (option)
		    	{
		    	case 1:
		    		addUser();		    		
		    		break;
		    	case 2:
		    		removeUser();
		    		break;
		    	case 3:
		    		searchUser();
		    		break;
		    	case 4: 
		    		displayAllUsers();
		    		break;
		    	case 5 :
		    		existApp();
		    		break;
		    	default:
		    		System.out.println("Please enter valid option");
		    		
		    	}				
		    }
		    catch(Exception ex)
		    {
		    	
		    	System.out.println("Please enter valid option");
		    }
		} 
	}

}
