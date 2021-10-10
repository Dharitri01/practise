package dharitri;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
	    Operation operation= new Operation();
	    int a= 8 , b= 9, mul;
        System.out.println("Enter the value of a: ");
        a = input .nextInt();
        System.out.println("Enter the value of b: ");
	    b =input.nextInt();

	    operation.mul (a, b);
        System.out.println("Multiplication of a and b = "+ mul);



    }
}
