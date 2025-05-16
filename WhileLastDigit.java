class WhileLastDigit
{
        public static void main(String[ ] args) 
        {
              int start = 1, end = 100;
              while(start<=end)
              {
                  int lastdigit = start%10;
                  System.out.println(start+ " last digit is " +lastdigit);
                  start++;
              }
        }
}