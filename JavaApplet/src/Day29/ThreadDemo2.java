package Day29;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class ThreadDemo2 implements Runnable
{

	public static void main(String[] args) 
	{
		//ThreadDemo2 th=new ThreadDemo2();
		Thread t=new Thread(new ThreadDemo2());
		t.start();
		System.out.println(t.getName());
	}
	public void run()
	{
		System.out.println("Spoorthi");
	}

}
