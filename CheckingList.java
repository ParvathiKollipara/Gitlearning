import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.HashSet;
class CheckingList
{
     public static void main(String[] args)
     {
         CheckingList cl = new CheckingList();
         cl.m1();
         cl.m2();
         cl.m3();
        
     }
       public void m1()
       {
          ArrayList<Object> al = new ArrayList<>();
          al.add(10);
          al.add("hello");
          al.add('x');
          al.add(12.56);
          al.add(false);
          al.add(2, "78");
          System.out.println("ArrayList: " +al);
          al.remove(2);
          System.out.println("ArrayList after remove: " +al);
          System.out.println("ArrayList after contains the element 5: " +al.contains(5));
          System.out.println("Array List Size is: " +al.size());
          System.out.println("Array List is Empty : " +al.isEmpty());
          al.clear();
          System.out.println("Array List after clear : " +al);

          ArrayList<Integer> a = new ArrayList<>();
          a.add(10);
          a.add(5);
          ArrayList<Integer> al1 = new ArrayList<>();
          al1.add(55);
          al1.add(11);
          
          a.addAll(al1);
          System.out.println("Array List after add all " +a);
         
          ArrayList<Integer> b = new ArrayList<>();
          b.add(10);
          b.add(34);
          b.add(335); 
          b.remove(0);
          System.out.println("Array List after removal " +b);

        }
       public void m2()
       {
           PriorityQueue<Integer> pq = new PriorityQueue<>();
           pq.add(23);
           pq.add(8);
           pq.add(15);
           System.out.println("Priority Queue: " +pq);
           pq.remove(2);
           System.out.println("Priority Queue after removing: " +pq);
           System.out.println("Priority Queue contains element 3: " +pq.contains(3));
           System.out.println("Priority Queue size: " +pq.size());
           System.out.println("Priority Queue is Empty: " +pq.isEmpty());
           pq.clear();
           System.out.println("Priority Queue after clear the list " +pq);
           PriorityQueue<String> p = new PriorityQueue<>();
           p.add("Hello");
           p.add("APPLE");
           p.add("Umbrella");
           System.out.println("Priority Queue: " +p);
           p.remove(2);
           System.out.println("Priority Queue after removing: " +p);
           System.out.println("Priority Queue contains element 3: " +p.contains(3));
           System.out.println("Priority Queue size: " +p.size());
           System.out.println("Priority Queue is Empty: " +p.isEmpty());
           p.clear();
           System.out.println("Priority Queue after clear the list " +p);

        }
         public void m3()
       {
           HashSet<Object> hs = new HashSet<>();
           hs.add(10);
           hs.add(25);
           hs.add(15);
           hs.add("Hello");
           hs.add("APPLE");
           hs.add("Umbrella");
           hs.add(false);
           System.out.println("HashSet: " +hs);
        }
}