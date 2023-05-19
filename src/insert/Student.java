package insert;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Student {
	int roll;
	String name;
	String address;
	Student(int roll,String name,String address){
		this.roll=roll;
		this.name=name;
		this.address=address;
		
		
	}
	public int getRoll(){
		
		return roll;
		
	}
	
public String getName(){
	
	return name;
	
}
public String getAddress(){
	
	return address;
	
}
public String toString(){
	
	return roll+" "+name+" "+address;
	
}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner (System.in);
		Collection<Student>c=new ArrayList<Student>();
		
		
		boolean loop=true;
		while(loop){
		System.out.println("1.add Student :");
		System.out.println("2.Exit        :");
		System.out.println("Enter the choice");
		int choice=Integer.parseInt(s.nextLine());
		switch(choice){
		
		case 1:
			System.out.println("enter the roll no");
		int	roll=Integer.parseInt(s.nextLine());
		System.out.println("enter the name");
		String name=s.nextLine();
		System.out.println("Enter the address");
        String address=s.nextLine();
        c.add(new Student(roll,name,address));
        System.out.println("Data insert succesfully");
			
			break;
		
		case 2:
			loop=false;
			
			break;
		
		
		}
			
			
			
			
		
		
		
		}
		
		
		
		
	}

}
