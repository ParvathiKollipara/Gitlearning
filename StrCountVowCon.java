class StrCountVowCon
{
       public static void main(String[] args)
       {
           String s = "Hello";
           int vowels = 0, consonants=0;
           for(int x=0;x<=s.length()-1; x++)
           {
                char ch = s.charAt(x);
                if(ch=='a' || ch == 'e' || ch=='i' || ch=='o' || ch=='u')
                {
                     vowels++;
                }
                 else{
                      consonants++;
                }
           }
         System.out.println("Number of vowels is " +vowels);
         System.out.println("Number of consonants is " +consonants);

     }
}

