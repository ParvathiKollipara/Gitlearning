import java.util.Arrays;
class StrAnagram
{
      public static void main(String[] args)
      {
           String s1 = "silent";
           String s2 = "list";
          if(s1.length()==s2.length())
          {
                 char a[] = s1.toCharArray();
                 //System.out.println(a);
                 char b[] = s2.toCharArray();
                  // System.out.println(b);
                  Arrays.sort(a);
                 Arrays.sort(b);
                System.out.println(a);
                System.out.println(b);
             System.out.println(Arrays.equals(a,b) ? "Anagram" : "Not an Anagram");
          }
          else{
                 System.out.println("Not an Anagram");
         }
    }
}
                    
