class TwoDArrayRev
{
        public static void main(String[] args)
        {
             int a[][] ={{1,2,3}, {4,5,6}, {7,8,9}};
             System.out.println("Rows in Reverse order");
             for(int r=0; r<=a.length-1; r++)
             {
                 for(int c=a[r].length-1; c>=0; c--)
                 {
                       System.out.print(a[r][c]+"  ");
                  }
               System.out.println();
              }
        }
}