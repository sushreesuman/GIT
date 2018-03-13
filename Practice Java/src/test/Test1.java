package test;

public class Test1 {

	int a;
	int b;
	
	public void setData(int a, int b){
		this.a=a;
		this.b=b;
	}
	
	public void showdata(){
		System.out.println("Value of A is =" +a);
		System.out.println("Value of B is =" +b);
	}
	
	public static void main (String args[]){
		Test1 obj=new Test1();
		obj.setData(2,3);
		obj.showdata();
		
		
	}

}
