package Day35;

import java.util.Vector;

import Day34.Employee1;

import java.util.Vector;
import java.util.HashSet;

public class Vector2 
{

	public static void main(String[] args) 
	{
		Vector v1=new Vector();
		Vector v2=new Vector();
		String s1=new String("Spoorthi");
		String s2=new String("Spoorthi");
		Employee2 e1=new Employee2(1,"Spoorthi",50000);
		Employee2 e2=new Employee2(1,"Spoorthi",50000);
		v1.add(s1);
		v2.add(e1);
		System.out.println(v1.contains(s2));
		System.out.println(v2.contains(e2));
		
		HashSet hs1= new HashSet();
		hs1.add(e1);
		System.out.println(hs1.contains(e2));
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());


	}

}
