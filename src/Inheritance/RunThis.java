package Inheritance;

public class RunThis {

	public static void main(String[] args) {
		Rectangle rec= new Rectangle();
		Triangle tri= new Triangle();
		rec.SetPara(10, 20);
		System.out.println(rec.area());
		tri.SetPara(30, 20);
		System.out.println(tri.area());
	}

}
