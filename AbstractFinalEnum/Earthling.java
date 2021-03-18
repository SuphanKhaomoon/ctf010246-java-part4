package CTF01.Java.part4.AbstractFinalEnum;

abstract class Earthling
{
	protected int i = 1;
	public abstract void move();
	public abstract void eat();
	
	// Remember Non-abstract methods are also allowed
	public void stand () {
		System.out.println("Stand Still...");
	}
}
