package Day25;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Applet12 extends Applet
{
	public void init()
	{
		addMouseMotionListener(new MouseMotionAdapter()
				{
			@Override
			public void mouseMoved(MouseEvent e)
			{
				int x=e.getX();
				int y=e.getY();
				//String i=String.valueOf(x);
				//String j=String.valueOf(y);
				showStatus(String.valueOf(x)+","+String.valueOf(y));
			}
			
				});
	}

}
