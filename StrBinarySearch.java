import java.util.Arrays;
class StrBinarySearch
{
     public static void main(String[] args)
     {
        StrBinarySearch s = new StrBinarySearch();
        s.calBinarySearch();
      }
         void calBinarySearch()
         {
             String s = "Hello All";
             char a[] = s.toCharArray();
            Arrays.sort(a);
            System.out.println(a);
            char search = 'd';
            int  f = 0, l=a.length-1, m =0;
            while(f<=l)
            {
                m =(f+l)/2;
                if(search == a[m])
                {
                    System.out.println("\nElement found");
                    return;
                 }
                else if(search>a[m])
                {
                  f= m+1;          
               }
                else{
                    l = m-1;
                }
            }
          System.out.println("Element not found");
        }
}
       
         