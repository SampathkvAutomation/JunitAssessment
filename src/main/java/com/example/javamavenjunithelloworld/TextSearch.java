package com.example.javamavenjunithelloworld;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class TextSearch 
{
public static boolean  searchString(String Filename , String searchInput) throws IOException
{
	boolean stringFound=false;
	int count=0;
    File f1=new File(System.getProperty("user.dir")+File.separator+"src/"+Filename+".txt"); //Creation of File Descriptor for input file
  
    Scanner sc2 = new Scanner(new FileInputStream(f1));
    while(sc2.hasNextLine()) {
        String line = sc2.nextLine();
      if(line.indexOf(searchInput)!=-1) {
        	stringFound = true;
           count = count+1;
        }
     }
     if(stringFound) {
        System.out.println("File contains the  word "+searchInput);
        stringFound=true;
     } else {
        System.out.println("File does not contain the  word "+searchInput);
     }

	return stringFound;
 }

public static boolean  searchStringregex(String Filename , String searchInput) throws IOException
{
	boolean stringFound=false;
	int count=0;
    File f1=new File(System.getProperty("user.dir")+File.separator+"src/"+Filename+".txt"); //Creation of File Descriptor for input file
  
    Scanner sc2 = new Scanner(new FileInputStream(f1));
    while(sc2.hasNextLine()) {
        String line = sc2.nextLine();
    if(line.matches("(.*)"+searchInput+"(.*)"))
    {
        	stringFound = true;
           count = count+1;
        }
     }
     if(stringFound) {
        System.out.println("File contains the  word "+searchInput);
       
     } else {
        System.out.println("File does not contain the  word "+searchInput);
     }

	return stringFound;
 }
}

