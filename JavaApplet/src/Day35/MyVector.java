package Day35;

class MyVector1
{
	
}

public class MyVector 
{

	public static void main(String[] args) 
	{
		MyVector1 v1,v2;
		Employee2 e1=new Employee2(1,"Spoorthi",50000);
		Employee2 e2=new Employee2(1,"Spoorthi",50000);
		v1=new MyVector1();
		v2=v1;
		System.out.println(v1.equals(v2));
		System.out.println(v1.hashCode());
		System.out.println(v2.hashCode());
		
		System.out.println(e1.equals(e2));
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());

	}

}
