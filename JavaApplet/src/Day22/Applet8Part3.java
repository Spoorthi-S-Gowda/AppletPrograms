package Day22;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Applet8Part3 extends Applet 
{
	Button b1,b2;
	TextField t;
	public void init()
	{
		add(b1=new Button("Click"));
		add(t=new TextField(15));
		add(b2=new Button("clear"));
		b1.addActionListener(new ActionListener()
	{
			public void actionPerformed(ActionEvent e)
			{
				t.setText("HelloWorld");
			}
	});
				b2.addActionListener(new ActionListener()
						{
					public void actionPerformed(ActionEvent e)
					{
						t.setText("");
					}
	});
	}

}
