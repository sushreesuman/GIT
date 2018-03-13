package test;

public class Inheritance {

	
public static void main(String[] args) {
		
AddSub obj=new AddSub();
obj.num1=5;
obj.num2=4;
obj.sum();
System.out.println(obj.result);
obj.sub();
System.out.println(obj.result);

	}
}
class Add // parent class, super class, base class
{
int num1, num2, result;
public void sum()
{
	result = num1 + num2;
}

}
//child,sub,derived
class AddSub extends Add  // Single level Inheritance
{
public void sub()
{
result = num1 - num2;
}
}
class AddSubMul extends AddSub  // Multi level Inheritance
{
	public void mul()
	{
		result = num1 * num2;
	}

	}

