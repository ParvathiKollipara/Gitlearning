class Pattern_Alphabet2
{
      public static void main(String[] args)
      {
         int rows = 5;     
        int columns = 4;  
        char ch = 'A';    

        for (int i = 0; i <=rows; i++) {
            for (int j = 1; j <=columns; j++) {
                if (i % 2 == 0) {
                    System.out.print(ch+"  ");
                } else {
                    System.out.print(Character.toLowerCase(ch)+"  ");
                }
                ch++;
            }
            System.out.println();
        }
    }
}
