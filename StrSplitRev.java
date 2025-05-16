import java.util.Scanner;
class StrSplitRev
{
     public static void main(String[] args)
     {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter String");
        String str = s.nextLine();
        StrSplitRev r = new StrSplitRev();
        r.calSplit(str);
     }
         // String s = " Hello All Good "; // 0lleh lla doog 
      void calSplit(String str)
       {  
          String a[] = str.split(" ");  // Hello
          for(String t : a)
          {
             String s2 = t;
             StringBuffer sb = new StringBuffer(s2);
             sb.reverse();
             System.out.println(sb);
          }
      }
}