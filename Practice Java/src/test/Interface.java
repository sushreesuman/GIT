package test;


	interface Abc 
	{
	public abstract void show();
	}
	
	class AbcImpl implements Abc
	{ 
		public void show() 
		{
			System.out.println("in show");
		}
	}
public class Interface
{
	public static void main(String[] args) {
		Abc obj=new AbcImpl();
		obj.show();
					
	}

}
