class StrRemoveVowels
{
       public static void main(String[] args)
       {
            String s = "Mysore";
            String res ="";
            for(int x=0; x<s.length()-1; x++)
            {
                 char letter = s.charAt(x);
                 if("aeiouAEIOU".indexOf(letter) == -1)
                 {
                      res = res+letter;
                  }
            }
         System.out.println(res);
     }
 }