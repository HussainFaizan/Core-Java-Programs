
public class BreakDemo
{
   public static void main(String[] args)
   {
      for (int i = 1; i <= 10; i++)
      {
         if (i == 5)
         {
            break;    // Break loop if i is 5
         }

         System.out.println(i + " ");
      }

      System.out.println("Loop is over.");
   }
}