import java.util.Scanner;


public class ArraysB
{

   public static void main(String[] args)
   {
      int numbers; // how many numbers user inputs
      double[] numbers1; // the array
      
      Scanner keyboard = new Scanner(System.in);
      System.out.println("how manny numbers do you want to input");
      numbers = keyboard.nextInt();
      
      numbers1 = new double[numbers];
      
      for (int index = 0; index < numbers1.length; index++)
      {
         System.out.println("input numbers");
         numbers1[index] = keyboard.nextDouble();
      }
      
      System.out.println();
      System.out.println("this is your numbers in reverse");
      for (int index = numbers1.length - 1; index >= 0; index--)
         // print array in reverse
      System.out.println(numbers1[index]);
      

   }

}
