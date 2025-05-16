import java.util.Scanner;
class StrMaxWordLength
{
      public static void main(String[] args)
      {
         Scanner s = new Scanner(System.in);
         System.out.println("Enter String");
         String str = s.nextLine();
         MaxWord m = new MaxWord();
         m.maxWordLength(str);
     }
}
class MaxWord
{
     void maxWordLength(String str)
     {
           //String s = "Vital Information Resources ";
           int max_length=0;
           String max_word= "0";
           String a[] = str.split("");
           for(String t : a)
           {
               String s2 =t;
               System.out.println(s2.length());
           if(s2.length()>=max_length)
          {
              if(s2.length() > max_length)
             {
                 max_length = s2.length();
                 max_word = s2;
            }
            else{
               max_word= max_word+" "+ s2;
            }
        }
      }
     System.out.println("Max word with length is " +max_word);
  }
}
