package CTF01.Java.part4.AbstractFinalEnum;

public final class Final
{
	public final String name = "Final";
	
	public static void main (String[] args) {
		Final f = new Final();
//		f.name = "jack"; // The final field Final.name can not be assign
		System.out.println(f.getName()); 
		
	}
	
	public final String getName () {
		return name;
	}
}


