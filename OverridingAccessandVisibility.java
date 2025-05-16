class OverridingAccessandVisibility
{
     public static void main(String[] args)
     {
       Parent parent;
       parent = new child();
       parent.m1();
       parent.m2(10);
       parent.m3("Good Evening");
      }
}
class Parent 
{
   protected void m1()
   {
     System.out.println("Parent M1");
   }
   protected int m2(int x)
   {
      System.out.println("Parent M2");
      return x;
   }
   public String m3(String x)
  {
      System.out.println("Parent M3");
      return x;
  }
}
class child extends Parent  // more accessibility
{
    protected void m1()
    {
       System.out.println("Child-M1");
    }
     public String m3(String x)
    {
       System.out.println("Child-M3");
       return x;
    }
}