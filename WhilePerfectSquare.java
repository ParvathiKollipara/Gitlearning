class WhilePerfectSquare
{
        public static void main(String[ ] args)
        {
            int start = 1, end = 500;
            while(start<=end)
            {
               int num = start;
               int square = (int)(Math.sqrt(num));
               if(square*square == num)
              {
                 System.out.println(num+ " is Perfect Square");
              }
              start++;
             }
       }
}
                  
            
