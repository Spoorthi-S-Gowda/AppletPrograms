package Day34;

import java.util.Vector;

import java.util.Vector;

public class Vector1 
{

	public static void main(String[] args) 
	{
		Vector v1=new Vector();
		Vector v2=new Vector();
		String s1=new String("Spoorthi");
		String s2=new String("Spoorthi");
		Employee1 e1=new Employee1(1,"Spoorthi",50000);
		Employee1 e2=new Employee1(1,"Spoorthi",50000);
		v1.add(s1);
		v2.add(e1);
		System.out.println(v1.contains(s2));
		System.out.println(v2.contains(e2));

	}

}
