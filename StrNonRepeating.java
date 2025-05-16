class StrNonRepeating
{
      public static void main(String[] args)
      {
           String s = "developer";
           for(int x=0; x<=s.length()-1; x++)
           {
               char letter = s.charAt(x);
               if(s.indexOf(letter) == s.lastIndexOf(letter))
               {
                     System.out.println("First Non repeating character " +letter);
                     return;
                }
           }

     }
}