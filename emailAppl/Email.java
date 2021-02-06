package emailAppl;

import java.util.Scanner;

public class Email {

	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private int mailBoxCapacity;
	private int defaultPasswordLength=10;
	private String alternateEmail;
	private String email;
	private String companySuffix="company.com";
	
	//Constructor to receive first name and last
	public Email(String firstName,String lastName)
	{
		this.firstName=firstName;
		this.lastName=lastName;   // classvariable= local variable
	
		//System.out.println("Email created "+firstName+" "+lastName+" ");
		
		this.department=setDepartment();
		System.out.println("Department :"+ this.department);
		
		//call a method that return a password
		this.password= randomPassword(defaultPasswordLength);
		System.out.println("Your password :"+this.password);
		
		//combine element to generate email
		email=firstName.toLowerCase()+"."+ lastName.toLowerCase()+"@"+department +"."+companySuffix;
		System.out.println("Your email is = "+email);
	}
	
	//Ask for the department
	private String setDepartment()
	{
		System.out.println("Department Code\n1 for  sales \n2 for development \n3 for acc \n0 for none \nEnter the department code");
		Scanner in=new Scanner(System.in); 
		int depChoice=in.nextInt();
		if(depChoice==1) return "sales";
		else if(depChoice==2) return "dev";
		else if(depChoice==3) return "acc";
		else return "";
	} 
	//Generate a random password
	private String randomPassword(int length)
	{
		String passwordSet="ABCDEFGHIJKLMNOPQRSTU0123456789!@#$%";
		char[] password=new char[length];
		for(int i=0;i<length;i++)
		{
			int rand=(int) (Math.random()* passwordSet.length());
			password[i]=passwordSet.charAt(rand);
		}
		return new String(password);
	}
	//set the mailbox capacity
	
	public void setMailboxCapacity(int capacity)
	{
		this.mailBoxCapacity=capacity;
	}
	
	//get the alternate email
	
	public int getMailBoxCapacity()
	{
		return mailBoxCapacity;
	}
	//set the alternate email
	
	public void setAlternateEmail(String altMail)
	{
		this.alternateEmail=  altMail;
	}
	
	//get alternate email
	
	public String getAlternateEmail()
	{
		return alternateEmail;
	}
	
	
	//change the password
	public void changePassword(String password)
	{
		this.password=password;
	}
	
	//get password
	public String getPassword()
	{
		return password;
	}
	
	//show info
	public String showInfo()
	{
		return "Display Name"+firstName+" "+lastName+ " Company EMail"+email+" MailBox capacity"+mailBoxCapacity;
	}
}
