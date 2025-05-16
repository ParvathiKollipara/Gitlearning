class FunctionalInterface
{
    public static void main(String[] args)
    {
      Parent p=()->
      {
           System.out.println("I am here");
      }
      p.m1();
      Parent.m2();
      p.m3();
    }
}
@FunctionalInterface
interface Parent
{
       void m1();
       static void m2()
       {
          System.out.println("Static method");
       }
     default void m3()
     {
         System.out.println("Default method");
     }
}