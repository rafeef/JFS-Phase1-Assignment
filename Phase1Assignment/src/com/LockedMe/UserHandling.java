package com.LockedMe;
import java.io.File;

import java.io.IOException;  // Import the IOException class to handle errors

public class UserHandling {

	private final static String path = "..\\Phase1Assignment\\src\\Users\\";
	private final static File folder = new File(path);
		
	public static void addUser (String fileName)
	{
		
		File user = new File(path+fileName+".txt") ;
		try
		{
			 if (user.createNewFile()) 
			 {
			        System.out.println("user created: " + user.getName());			        
			 }
			 else 
			 {
			        System.out.println("user already exists.");
			 }
		}
		catch(IOException ex)
		{
			System.out.println("An error occurred while adding user");
		     ex.printStackTrace();
		}
		catch (Exception ex)
		{
			System.out.println("An error occurred while adding user");
		     ex.printStackTrace();
			
		}
	}
	
	public static void deleteUser (String fileName)
	{
		
		File user = new File(path+fileName+".txt") ;
		try
		{
			 if (user.delete()) 
			 {
			        System.out.println("user: " + user.getName() + " is deleted successfully");			        
			 }
			 else 
			 {
			        System.out.println("user dosen't already exist.");
			 }
		}
		
		catch (Exception ex)
		{
			System.out.println("An error occurred while deleting user");
		     ex.printStackTrace();
			
		}
			
		
	}
	
	
	public static void sortUserNames()
	{
		
		File[] listOfFiles = folder.listFiles();
		QuickSort.quickSort (listOfFiles, 0 , listOfFiles.length-1);
		
		for (int i = 0; i < listOfFiles.length; i++) 			
			 System.out.println(listOfFiles[i].getName());
		if (listOfFiles.length == 0)
			System.out.println("App doesn't have any users yet");

	}
	
	public static void searchUser(File user)
	{
		
		File[] listOfFiles = folder.listFiles();
		QuickSort.quickSort (listOfFiles, 0 , listOfFiles.length-1);

		
		if (BinarySearch.recursiveBinarySearch(listOfFiles, 0, listOfFiles.length-1, user) < 0 ) 
			System.out.println("User: "+ user + " is not found");
		else
			System.out.println("User: "+ user + " is found");
		
		
	}
	
}
