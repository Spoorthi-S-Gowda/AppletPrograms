package Day20;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Applet6Part1 extends Applet implements ActionListener
{
	Button b1,b2;
	TextField t;
	public void init()
	{
		add(b1=new Button("Click"));
		add(t=new TextField(15));
		add(b2=new Button("clear"));
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		Object o=e.getSource();
		if(o.equals(b1))
			t.setText("Hello World");
		if(o.equals(b2))
			t.setText("");
	}

}
