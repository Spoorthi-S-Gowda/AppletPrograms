package Day23;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Applet9Part4 extends Applet
{
	Button b1,b2;
	TextField t;
	public void init()
	{
		add(b1=new Button("Click"));
		add(t=new TextField(15));
		add(b2=new Button("Clear"));
		b1.addActionListener((ActionEvent e)->
		{
			t.setText("Hello World");
		});
		//b1.addActionListener((e)->{t.setText("Hello World");});
		//b1.addActionListener((e)->t.setText("Hello World"));
		b2.addActionListener((e)->t.setText(""));
	}

}
