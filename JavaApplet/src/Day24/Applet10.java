package Day24;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Applet10 extends Applet
{
	Button b1,b2;
	TextField t;
	public void init()
	{
		add(b1=new Button("Click"));
		add(t=new TextField(15));
		add(b2=new Button("Clear"));
		b1.addFocusListener(new FocusAdapter()
				{
				@Override
					public void focusGained(FocusEvent e) {
						// TODO Auto-generated method stub
						t.setText("Hello World");
						
					}
			
				});
		b2.addFocusListener(new FocusListener()
				{
					public void focusGained(FocusEvent e) {
						// TODO Auto-generated method stub
						t.setText("");
						
					}

					public void focusLost(FocusEvent e) {
						// TODO Auto-generated method stub
						
					}
			
				});
	}

}
