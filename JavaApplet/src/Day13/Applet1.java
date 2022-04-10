package Day13;

import java.applet.*;
import java.awt.Dimension;
import java.awt.*;


public class Applet1 extends Applet
{
	Button b;
	TextField t;
	public void init()
	{
		b= new Button("SUBMIT");
		//b.setLabel("SUBMIT");
		add(b);
		t= new TextField();	
		t.setSize(300,250);
		add(t);			
	}
}