import java.util.Scanner;

public class AccountTest{

	public static void main(String[] args){

	Account jayAccount = new Account("Jibola Bakare", 23_890.67);

	System.out.printf("The account holder is %s%n with a balance of: %f%n", jayAccount.getName(), jayAccount.getBalance());

	Scanner input = new Scanner(System.in);
	System.out.println("Eneter an amount to deposit");
	double depositAmount = input.nextDouble();
	jayAccount.deposit(depositAmount);
	System.out.printf("A sum of %.2f was deposited into account of %s.%n New balance is %.2f%n", depositAmount, jayAccount.getName(), jayAccount.getBalance());

	System.out.print("Enter the amount to withdraw: ");
	double withdrawAmount = input.nextDouble();
	jayAccount.withdraw(withdrawAmount);
	
	if (withdrawAmount <= jayAccount.getBalance()){
	System.out.printf("%.2f was was withdrawn from your account.%n New Balance is %.2f%n", withdrawAmount, jayAccount.getBalance());
	}
	if (withdrawAmount > jayAccount.getBalance()){
	System.out.println("Insufficient Funds");
	}
	}
}