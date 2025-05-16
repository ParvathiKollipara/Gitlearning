import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.List;
class Return
{
     public static void main(String[] args)
     {
         Return r = new Return();
         r.m1();
         r.m2();
     }
       public void m1()
       {
        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(10,20,34,50,36));
        Iterator<Integer> itr = al.iterator();
        while(itr.hasNext())
        {
        System.out.println(itr.next());
        }
      }
   
     public void m2()
    {
         List<Integer> list = new ArrayList<>();
        list.add(98);
        list.add(23);
        list.add(13);
        ListIterator<Integer> listIterator = list.listIterator(list.size());
       while(listIterator.hasPrevious())
       {
           String s = listIterator.previous();
            System.out.println(s);
        }
    }
}