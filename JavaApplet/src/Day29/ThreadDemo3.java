package Day29;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class ThreadDemo3 extends Frame
{
	TextField t1,t2;
	public ThreadDemo3()
	{
		setLayout(new FlowLayout());
		add(t1=new TextField(15));
		add(t2=new TextField(15));
		addWindowListener(new WindowAdapter()
				{
			@Override
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
			
		});
		setSize(40,400);
		setVisible(true);
	}

	public static void main(String[] args)
	{
		new ThreadDemo3();

	}

}
