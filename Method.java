import java.util.Scanner;

class Parameters 
{
  public static void main(String[ ] args)
  {
	 Scanner s = new Scanner(System.in);
	 System.out.println("Enter value");
	 Param p = new Param();
	 p.sample();
  }
}
class Param
{
	void sample(int x)
	{
		System.out.println(x);
	}
    void sample(double x)
    {
	System.out.println(x);
    }
    void sample(long x)
    {
    	System.out.println(x);
    }
    void sample(int n, double d)
    {
    	System.out.println(n+" "+d);
    }
    void sample(int n, String s, char c)
    {
    	System.out.println(n+" "+s+" "+c);
    }
    void sample(char c, double d)
    {
    	System.out.println(c+" "+d);
    }
    void sample()
    {
    	System.out.println("Hi");
    }
}