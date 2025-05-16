import java.util.ArrayList;
class Typed
{
      public static void main(String[] args)
      {
         Typed t = new Typed();
          t.m1();
          t.m2();
          t.m3();
      }
       public void m1()
       {
          Integer i = 10;
          ArrayList<Object>  al = new ArrayList<>();
          al.add(i);
          al.add(10.5);
          al.add(5);
          al.add(4);
          System.out.println(al);
      }
        public void m2()
       {
          ArrayList<Number>  al = new ArrayList<>();
          Integer i = 10;
          Short s = 3;
          Byte b = 2;
          Double d = 10.45;
          al.add(i);
          al.add(s);
          al.add(b);
          al.add(d);
          System.out.println(al);
      }
      public void m3()
      {
          Integer i = 10;
          System.out.println(i+" "+System.identityHashCode());
       }
}