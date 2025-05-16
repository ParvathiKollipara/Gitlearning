import java.util.LinkedList;
class CheckingLinkedData
{
      public static void main(String[] args)
      {
         CheckingData c = new CheckingData();
         c.m1();
         c.m2();
         c.m3();
         c.m4();
      }
         public void m1()
         {
            LinkedList<Object> al = new LinkedList<>();
            al.add(10);
            al.add(13.5);
            al.add("hello");
           System.out.println("Heterogeneous data ");
           for(Object t : al)
           {
                 System.out.println(al);
           }
        }
         
        public void m2()
         {
            LinkedList<String> al = new LinkedList<>();
            al.add("Hii");
            al.add("hello");
           System.out.println("Homogeneous data");
           for(Object t : al)
           {
                 System.out.println(al);
           }
        }
       public void m3()
         {
            LinkedList<String> al = new LinkedList<>();
            al.add("Apple");
           al.add("Apple");
           System.out.println("Duplicate value");
           for(Object t : al)
           {
                 System.out.println(al);
           }
        }
         public void m4()
          {
           LinkedList<Object> al = new LinkedList<>();
           al.add(null);
           al.add(null);
           System.out.println("Null value");
           for(Object t : al)
           {
                 System.out.println(al);
           }
        }
         public void m5()
          {
           LinkedList<Integer> al = new LinkedList<>();
           al.add(10);
           System.out.println("Generics");
           for(Object t : al)
           {
                 System.out.println(al);
           }
        }
}

