package com.cisco.ph1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeSet;

class operations {
	
	public void createfile(String filename) {
		File f = new File(filename);
		try {
			boolean result=f.createNewFile();
			if(result==true)
				System.out.println("filecreationdone");
			else
				System.out.println("failed");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public void deletefile(String filename) {
		File f = new File (filename);
		boolean result= f.delete();
		if(result==true)
			System.out.println("deleted sucessfully");
		else
			System.out.println("not deleted");
		
	}
	public void searchfile(String filename) {
		File f = new File (filename);
		boolean result= f.exists();
		if(result==true)
			System.out.println("sucessfully found");
		else
			System.out.println("not found");	
	}

	public void sorting() {
		String Path="C:\\Users\\smerupo\\eclipse-workspace\\Mini\\src\\PH1_Project";
		File f = new File (Path);
		File F[]=null;
		F=f.listFiles();
		TreeSet<String> TM= new TreeSet<String>();
		for(File fi:F) {
			TM.add(fi.getName());
		}
		
		for (String s:TM) {
			System.out.println(s);
			
		}
		
		
	}
}

class Ph1__project{
	public static void main(String args[]) {
		System.out.println("Developed by Sushma");
		operations ma = new operations();
		Scanner sc = new Scanner(System.in);
		while(true) {
		System.out.println("1.sortingorder\n2.filehandling function\n3.exit");
		
		int mopt=sc.nextInt();
		if(mopt==1)
			ma.sorting();
		else if(mopt==2) {
			while(true) {
				System.out.println("1.createfile\n2.deletefile\n3.searchfile\n4.exit\n");
				
				int opt=sc.nextInt();
				if(opt==1)
				{
					String fn=sc.next();
					ma.createfile(fn);
					
				}
				
				else if(opt==2) {
					String df=sc.next();
					ma.deletefile(df);
				}
				
				else if(opt==3) {
					String sf=sc.next();
					ma.searchfile(sf);
				}
				else if (opt==4)
					break;
					
			}
			
		}
		else if(mopt==3)
			break;
	
		}	
	
	}
	
}


