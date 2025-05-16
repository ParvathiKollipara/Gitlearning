class Overriding
{
     public static void main(String[] args)
     {
       Parent parent;
       parent = new child();
       parent.m1();
       parent.m2();
       parent.m3();
    
      }
}
class Parent
{
   public void m1()
   {
      System.out.println("Parent-M1");
   }
   public void m2()
   {
      System.out.println("Parent M2");
   }
  public void m3()
  {
      System.out.println("Parent M3");
  }
}
class child extends Parent
{
    public void m1()
    {
       System.out.println("Child-M1");
    }
     public void m3()
    {
       System.out.println("Child-M3");
    }
   

}