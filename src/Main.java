import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Enter your first number here: ");
        System.out.println("Enter your second number here: ");
        System.out.println("Enter your third number here: ");
        Scanner myVar=new Scanner(System.in);
        int number=myVar.nextInt();
        int number2=myVar.nextInt();
        int number3=myVar.nextInt();
        int newNumber=number+number2+number3;
        System.out.println(newNumber);

    }
}