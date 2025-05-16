class Extraction
{
       public static void main(String[ ] args)
       {
          int num = 12345, rem = 0, count = 0, temp = num, firstdigit, lastdigit, seconddigit, secondlastdigit, middledigit;
          while(num>0)
          {
                 count++;
                 num = num/10;
           }
          num =temp;
          lastdigit = num%10;
          firstdigit = num/((int)Math.pow(10, count-1));
          seconddigit = (num/(int)Math.pow(10, count-2)) % 10;
          secondlastdigit =  (num/(int)Math.pow(10, 1)) % 10; 
          middledigit = (count!=0) ? (num / (int) Math.pow(10, count - 3)) % 10 : 0;
          int sum =  (lastdigit*firstdigit) +  (seconddigit*secondlastdigit);
          int result = sum +middledigit;
          System.out.println("Final Result: " + result);
     }
}