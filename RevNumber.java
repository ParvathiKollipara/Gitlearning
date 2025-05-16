class RevNumber
{
       public static void main(String[ ] args)
       {
            int n = 120000, rem1 =0, rem2 = 0, rev1 = 0, rev2 = 0, temp = n, c1 = 0, c2=0, a;
            while(n!=0)
            {
               c1++; //6
               n = n/10; // 12000
            }
           n = temp;
           while(n>0)
           {
             rem1 = n%10; 
             rev1= rev1*10+rem1; //21
             n = n/10;
           }
          System.out.println(rev1);
           a = rev1;
          while(rev1>0)
          { 
             c2++; // 2
             rev1 = rev1/10;   
          }
          rev1 =a;
          while(rev1>0)  
          {
            rem2 = rev1%10; //1
            switch(rem2)
            {
                case 0:
                            System.out.println("Zero");
                            break;
               case 1:
                            System.out.println("One");
                            break;
               case 2:
                           System.out.println("Two");
                           break;
               case 3: 
                            System.out.println("Three");
                            break;
              case 4:
                            System.out.println("Four");
                            break;
               case 5: 
                           System.out.println("Five");
                            break;
               case 6: 
                           System.out.println("Six");
                            break;
              case 7:
                           System.out.println("Seven");
                            break;
             case 8:
                          System.out.println("Eight");
                            break;
             case 9:
                         System.out.println("Nine");
                           break;
            }
            rev2 = rev2*10+rem2;  //12
            rev1 = rev1/10;  // 2
           }
          int c = c1 - c2;// 6-2 =4
         while(c>0)
        {
          rev2 = rev2 *10; //120 1200 12000 120000
          int t=0;
          t = rev2%10;
          switch(t)
          {
                  case 0:
                            System.out.println("Zero");
                            break;
               case 1:
                            System.out.println("One");
                            break;
               case 2:
                           System.out.println("Two");
                           break;
               case 3: 
                            System.out.println("Three");
                            break;
              case 4:
                            System.out.println("Four");
                            break;
               case 5: 
                           System.out.println("Five");
                            break;
               case 6: 
                           System.out.println("Six");
                            break;
              case 7:
                           System.out.println("Seven");
                            break;
             case 8:
                          System.out.println("Eight");
                            break;
             case 9:
                         System.out.println("Nine");
                            break;
           }

          c--; // 3 2 1 0
        }
         System.out.println(rev2);
     }
}