package test;


public class Abstractusesclass {
	public static void main(String[] args) {
		
		AA obj = new CC();
		obj.call();
		obj.move();
		obj.touch();
		obj.cook();
	}
}

abstract class AA{

public void call()
{
	System.out.println("calling");
}

public abstract void move();
public abstract void touch();
public abstract void cook();

}

abstract class BB extends AA {
	public void move(){
		System.out.println("moving");
	}
}

class CC extends BB {
	public void touch(){
		System.out.println("touching");
	}
	
		public void cook(){
			System.out.println("cooking");
	}
}

