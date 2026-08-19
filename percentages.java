import java.util.Scanner;
public class Percentages{
public static void main(String[] args){
   
   double number1 =2.0;
   double number2 =5.0;

   computePercentage(double number1, double number2);
   computePercentage(double number2, double number1);
Scanner input= new Scanner(System.in);

System.out.println("Enter the first number: ");
double firstNumber = input.nextDouble();

System.out.pintln("Enter second number: ");
double secondNumber = input.nextDouble();

computePercentage(firstNumber, secondNumber);
computePercentage(secondNumber, firstNumber);

input.close();
}

public static void computePercentage(double number1, double number2){
    double Percentage = (double number1 / double number2) * 100;
    System.out.println(number1 + "is " + Percentage + "percent of" + number2);
}







}