import java.util.Scanner;
class StrMissingElements
{
      public static void main(String[] args)
      {
        	Scanner s = new Scanner(System.in);
                System.out.println("Enter String");
                String str = s.nextLine();
                StrMissAlp m = new StrMissAlp();
                m.calMissing(str);
      }
}
class StrMissAlp
{
      void calMissing(String str)
      {
          for(char x='a'; x<='z'; x++)
          {
               int count=0;
               for(int y=0; y<=str.length()-1; y++)
               {
                   char letter = str.charAt(y);
                   if(letter == x || letter == (char)(x+32))
                   {
                       count++;
                   }
               }
            if(count==0)
               System.out.println(x);
          }
     }
}