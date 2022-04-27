package Day31;

class TContent1
{
	public synchronized void m1(String s)
	{
		System.out.println("{");
		System.out.println(s);
		try
		{
			Thread.sleep(200);
		}
		catch(Exception e)
		{
		}
		System.out.println("}");
	}
}
class ThreadJob1 extends Thread
{
	TContent1 t1;
	String s;
	public ThreadJob1(TContent1 t1,String s)
	{
		this.t1=t1;
		this.s=s;
		start();
	}
	public void run()
	{
		t1.m1(s);
	}
}
public class SyncDemo1 
{

	public static void main(String[] args) 
	{
		TContent1 t1=new TContent1();
		new ThreadJob1(t1,"Hello");
		new ThreadJob1(t1,"World");

	}

}
