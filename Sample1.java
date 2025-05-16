class Sample1
{
       public static void main(String[] args)
       {
           Parent p = new Child();
           p.m1();
           p.m2();
        }
 }
class Child extends Parent
{
   public final void m1()
   {
       int x = 5;
       System.out.println(x);
    }  
}
abstract class Parent
{
     public abstract final void m1();
     public final void m2()
    {
        int x = 5;
        System.out.println(x);
     }
}
  