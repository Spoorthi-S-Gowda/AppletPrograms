package Day24;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Applet11Part5 extends Applet
{
	Button b1,b2;
	TextField t;
	public void init()
	{
		add(b1=new Button("Click"));
		add(t=new TextField(15));
		add(b2=new Button("Clear"));
		E e=new E();
		e.takeRef(this);
		b1.addActionListener(e);
		//F f=new F(this);
		b2.addActionListener(new F(this));
	}

}
class E implements ActionListener
{
	Applet11Part5 ap;
	public void takeRef(Applet11Part5 ap)
	{
		this.ap=ap;
	}
	public void actionPerformed(ActionEvent arg0)
	{
		ap.t.setText("Hello World");
	}
}
class F implements ActionListener
{
	Applet11Part5 ap;
	public F(Applet11Part5 ap)
	{
		this.ap=ap;
	}
	public void actionPerformed(ActionEvent e)
	{
		ap.t.setText("");
	}
}
