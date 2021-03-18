package CTF01.Java.part4;

import CTF01.Java.part4.my_interface.IWebsiteCreator;

public class CEO extends Employee
{

	public CEO(String firstnameInput, String lastnameInput, int salaryInput)
	{
		super(firstnameInput, lastnameInput, salaryInput);
	}
	
	public void orderWebsite(IWebsiteCreator creator) {
		creator.createWebsite("some template", "Codecamp");
	}
	
	@Override
	public int getSalary () {
		return super.getSalary() * 2;
	}
	
	public void hello () {
		System.out.println("Hi, nice to meet you. " + this.firstname + "!");
	}
	
	public void fire (Employee employee) {
		System.out.println(employee.firstname + " has been fired!");
	}

}
