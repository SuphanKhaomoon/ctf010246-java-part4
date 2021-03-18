package CTF01.Java.part4.AbstractFinalEnum;

public class Human extends Earthling
{
	public String name;
	public String food;
	public String moveby;

// 1. ทดลองสร้าง Abstract Class แล้วสืบทอดออกไป new ออกมา
//	(สร้าง Abstract Class ชื่อ Earthling สร้าง Class Human มา extend Earthling)
	
	public static void main(String[] args)
	{
		Human hm = new Human("ฟอร์ซ", "ขาหมู", "เดิน");
		hm.getInt(10);
		hm.move();
		
		hm.getInt(2);
		hm.eat();
		
		hm.stand();
		
	}
	

	public Human(String name, String food, String moveby)
	{
		this.name = name;
		this.food = food;
		this.moveby = moveby;
	}


	@Override
	public void move()
	{
		System.out.println(name + " เคลื่อนที่ด้วยการ " + moveby + " จำนวน " + i  + " ครั้ง");	
	}

	@Override
	public void eat()
	{
		System.out.println(name + " กิน " + food + " เป็นอาหาร จำนวน " + i + " มื้อ");	
	}
	
	public int getInt (int i) {
		return this.i = i;
	}

}
