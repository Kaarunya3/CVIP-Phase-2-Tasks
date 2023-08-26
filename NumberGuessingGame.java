import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
public static void main(String[] args) {
Random random = new Random();
int n = random.nextInt(100) + 1;

Scanner scanner = new Scanner(System.in);
int guess;

do {
	System.out.print("Enter the number you are guessing: ");
	guess = scanner.nextInt();

	if (n % 10 == 0)
	{
		System.out.println("The number is a multiple of ten");
		
	}
	else if (n % 10 == 1) 
	{
		System.out.println("The number's last digit is 1");
	}
	else if (n % 10 == 2) 
	{
		System.out.println("The number's last digit is 2");
	}
	else if (n % 10 == 3) 
	{
		System.out.println("The number's last digit is 3");
	}
	else if (n % 10 == 4) 
	{
		System.out.println("The number's last digit is 4");

	}
	else if (n % 10 == 5) 
	{
		System.out.println("The number's last digit is 5");
	} 
	else if (n % 10 == 6) 
	{
		System.out.println("The number's last digit is 6");
	}
	else if (n % 10 == 7) 
	{
		System.out.println("The number's last digit is 7");
	}
	else if (n % 10 == 8) 
	{
		System.out.println("The number's last digit is 8");
	}
	else if (n % 10 == 9) 
	{
		System.out.println("The number's last digit is 9");
	}
	else 
	{
		break;
	}
} while (n != guess);

System.out.println("The guessed number is correct");
}
}