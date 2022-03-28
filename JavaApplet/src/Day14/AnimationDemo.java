package Day14;

import java.applet.*;// used to access showStatus()
import java.awt.*;//Graphic class is available in this package
import java.util.Date;// used to access Date object

public class AnimationDemo extends Applet
{
public void paint(Graphics g)
{
Date dt = new Date();
super.showStatus("Today is" + dt);
//in this line, super keyword is avoidable too.
}
}