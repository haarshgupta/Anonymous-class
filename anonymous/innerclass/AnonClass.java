package anonymous.innerclass;

class demo{
	public void show() {
		System.out.println("Orignalllll");
	}
}

public class AnonClass {
	public static void main (String args[]) {
		demo obj1=new demo()
				{
			public void show() {
				System.out.println("Nooooot Orignalllll");
			}
					};
						obj1.show();

		demo obj=new demo();
		obj.show();
		
	}
}
