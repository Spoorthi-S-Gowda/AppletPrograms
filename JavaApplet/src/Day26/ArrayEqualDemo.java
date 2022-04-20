package Day26;

class A
{
	int i;
	String s;
	public A(int i,String s)
	{
		this.i=i;
		this.s=s;
	}
}

public class ArrayEqualDemo
{

	public static void main(String[] args) 
	{
		A a=new A(10, "Spoorthi");//ref1
		A a1=a;
		A a2=new A(10, "Spoorthi");//ref2
		if(a==a1)
			System.out.println("equal");
		else
			System.out.println("Not equal");
		if(a==a2)
			System.out.println("equal");
		else
			System.out.println("Not equal");
		if(a.equals(a1))
			System.out.println("equal");
		else
			System.out.println("not equal");
		if(a.equals(a2))
			System.out.println("equal");
		else
			System.out.println("not equal");

	}

}
