import java.util.Scanner;
class StrUnique
{
     public static void main(String[] args)
     {
       Scanner s = new Scanner(System.in);
       System.out.println("Enter String");
       String str = s.nextLine();
       System.out.println("Unique elements in string is ");
       Unique u = new Unique();
       u.calUnique(str);
       System.out.println("Duplicate elements in string is ");
       u.calDuplicate(str);
      }
}
class Unique
{
    void calUnique(String str)
    {
         for(int x=0; x<=str.length()-1; x++)
         {
             char letter = str.charAt(x);
             if(str.indexOf(letter)==str.lastIndexOf(letter))
             {
                 System.out.print(letter+" ");
                System.out.println();
             }
         }
    }
    void calDuplicate(String str)
    {
          String s2= "";
          for(int x=0; x<=str.length()-1; x++)
          {
             char letter = str.charAt(x);
             if(str.indexOf(letter) != str.lastIndexOf(letter))
             {
                 if(s2.indexOf(letter)==-1)
                 {
                      s2 = s2+letter;
                 }
              }
         }
         System.out.println(s2);

     }
}