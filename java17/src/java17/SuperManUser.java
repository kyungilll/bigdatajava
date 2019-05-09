package java17;

public class SuperManUser {
	public static void main(String[] args) {
	
		SuperMan sMan = new SuperMan();
		sMan.height = 200;
		sMan.weight = 100;
		sMan.eye = 300;
		sMan.fly = true;
		
		
		sMan.eat();
		sMan.sleep();
		sMan.army();
		sMan.flySpeed();
		
		System.out.println(sMan);
}
}
