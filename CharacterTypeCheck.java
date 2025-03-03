class CharacterTypeCheck
{
    public static void main(String[] args)
    {
       char ch = 'm';
       if(ch >= 'A' && ch <= 'Z')
       {
         System.out.println(ch + " is a Capital letter");
       }
       else if(ch >= 'a' && ch <= 'z')
       {
         System.out.println(ch + " is a Small letter"); 
       }
       else if(ch >= '0' && ch <= '9')
       {
         System.out.println(ch + " is a Digit");
       }
       else
       {
         System.out.println(ch + " is a Special Symbol");
       }
    }
}