package CTF01.Java.part4;

import CTF01.Java.part4.my_interface.IWebsiteCreator;
import CTF01.Java.part4.my_interface.IWindowsInstaller;

public class Programmer extends Employee implements IWebsiteCreator, IWindowsInstaller
{
	
	public Programmer(String firstnameInput, String lastnameInput, int salaryInput)
	{
		super(firstnameInput, lastnameInput, salaryInput);
	}
	
	public void FixPC (String serialNumber) {
		System.out.println("I'm trying to fix PC serialNumber:" + serialNumber);
	}
	
	@Override
	public void createWebsite(String template, String titleName)
	{
		System.out.println("Setup template: " + template);
		System.out.println("Setup Title name: " + titleName);		
	}
	
	@Override
	public void installWindows(String version, String productKey)
	{
		// TODO Auto-generated method stub
		
	}
	
	
	@Override
	public int getLastInstalledWindowsVersion()
	{
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void formatWindows(String drive)
	{
		// TODO Auto-generated method stub
		
	}

}