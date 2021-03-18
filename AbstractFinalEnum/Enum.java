package CTF01.Java.part4.AbstractFinalEnum;

public class Enum
{
// 3. ทดลอง Enum
	enum Status {
		HEALTHY,
		SLEEPY,
		DEAD
	}

	public static void main(String[] args)
	{
		Status myStatus = Status.HEALTHY;
		switch (myStatus) {
			case HEALTHY:
				System.out.println("พร้อมจะลุยกันมานานแล้วววว!!");
				break;
			case SLEEPY:
				System.out.println("ง่วงจังขอกาแฟหน่อย");
				break;
			case DEAD:
				System.out.println("ไม่ไหวแล้วไปนอนละบาย");
				break;
		}
	}

}
