class StrVowel
{
      public static void main(String[] args)
      {
           String s = "WELCOME @ 123";
           int digit=0, symbol=0, space=0, capital=0, small=0,vowel=0, consonant=0;
           for(int x=0; x<=s.length()-1; x++)
           {
                char letter = s.charAt(x);
                if(letter>='0' && letter<='9')
                {
                    digit++;
                }
                else if(letter==' ')
                {
                     space++;
                }
                else if(letter>='A' && letter<='Z')
                {
                       capital++;
                      if(letter=='A' || letter=='E' || letter=='I' || letter=='O' || letter=='U')
                      {
                           vowel++;
                       }
                     else{
                          consonant++;
                     }
               }
               else
               {
                   symbol++;
               }
         System.out.println(letter);
      }
       System.out.println("Digit : " +digit);
       System.out.println("Space : " +space);
       System.out.println("Capital :  " +capital);
       System.out.println("Small :  " +small);
       System.out.println("Vowel :  " +vowel);
        System.out.println("Consonant : " +consonant);
         System.out.println("Symbol : " +symbol);
 
  }
}