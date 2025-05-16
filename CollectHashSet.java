import java.util.HashSet;
class CollectHashSet
{
     public static void main(String[] args)
     {
           HashSet a = new HashSet();
           HashSet b = new HashSet();
           a.add(10);
           a.add("hello");
           a.add(false);
           b.add(55.7);
           b.add(true);
           b.add("Apple");
           System.out.println(a);
           System.out.println(b);
      }
}