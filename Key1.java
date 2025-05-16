class Key2
{
     public static void main(String[] args)
     {
         A a = new A(100);
         System.out.println(a.x);
      }
}
 final class A
{
   final int x;
   A()
   {
       this.x = 10;
   }
  A(int x)
  {
      this.x = x;
   }
}