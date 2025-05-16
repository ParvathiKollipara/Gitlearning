import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;
class Sample
{
    public static void main(String[] args) throws FileNotFoundException
    {
        File f = new File("C:\\Users\\hp\\Desktop\\Hii AL Good Morning.txt");
        Scanner s = new Scanner(f);
        while(s.hasNextLine())
         {
               System.out.println(s.nextLine());
          }
     }
}