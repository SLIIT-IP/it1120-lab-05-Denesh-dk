import java.util.Scanner;
public class IT24102826Lab5Q1 {
   
    public static void main(String[]args){
   
    int firInt, secInt, thirdInt, smallest, largest, userEnt;
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the first integer: ");
    firInt = input.nextInt();
    System.out.print("Enter the second integer: ");
    secInt = input.nextInt();
    System.out.print("Enter the third integer: ");
    thirdInt = input.nextInt();
    
      smallest = firInt;
      if(secInt < smallest){
       smallest = secInt;
      }
      if(thirdInt < smallest){
       smallest = thirdInt;
      }

      largest = firInt;
      if(secInt > largest){
       largest = secInt;
      }
      if(thirdInt > largest){
       largest = thirdInt;
      }
    System.out.println(" ");

    System.out.println("User entered numbers are : " + firInt + " " + secInt + " " + thirdInt);
    System.out.println("The smallest number is: " + smallest);
    System.out.println("The Largest number is: " + largest);
   
   }
}