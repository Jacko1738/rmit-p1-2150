import java.util.Scanner;
public class money {
    public static void main(String[] args){
        Scanner inputOne = new Scanner(System.in);
        System.out.println("enter first value: ");
        int valueOne = inputOne.nextInt();
        Scanner inputTwo = new Scanner(System.in);
        System.out.println("enter second value: ");
        int valueTwo = inputTwo.nextInt();
        int resultValue = valueOne + valueTwo;
        System.out.println("The result of your values are: " + resultValue);
    }
}