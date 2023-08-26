import java.util.*;
class atm_machine
{
Scanner s= new Scanner(System.in);
String name="Kaarunya";
public int account_no=12345678,pin_number=1234;
public double balance=20000, withdraw, deposit;
public void deposit()
{
System.out.println("Enter the amount to deposit");
deposit=s.nextDouble();
if(deposit>0)
{
System.out.println("Please insert the cash");
balance+=deposit;
System.out.println(deposit+" has been deposited to your account");
System.out.println("Your current balance is: "+balance);
}
else
{
System.out.println("Enter valid amount");
}
}
public void withdraw()
{
System.out.println("Enter the amount to withdraw");
withdraw=s.nextDouble();
if(withdraw>0)
{
balance-=withdraw;
System.out.println("Please collect your cash");
System.out.println(withdraw+" has been deducted from your account ");
System.out.println("Your current balance: "+balance);
}
else
{
System.out.println("Enter valid amount");
}
}
public void display()
{
System.out.println("Account holder name: "+name);
System.out.println("Account number: "+account_no);
System.out.println("Balance is: "+balance);
}
boolean check(int accno,int pin)
{
if(account_no==accno && pin_number==pin)
{
return true;
}
else
{
return false;
}
}
}
class Execute
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
atm_machine a= new atm_machine();
System.out.println("Enter account number");
int accno=s.nextInt();
System.out.println("Enter pin number ");
int pin=s.nextInt();
if(a.check(accno,pin)==true)
{
System.out.println("MENU");
System.out.println("1. Deposit. 2. Withdraw. 3. Mini statement ");
System.out.println("Enter your choice ");
int choice=s.nextInt();
switch(choice)
{
case 1:a.deposit();
	break;
case 2:a.withdraw();
	break;
case 3:a.display();
	break;
default: System.out.println("Enter valid choice");
}
}
else
{
System.out.println("Enter valid atm and pin numbers ");
}
System.exit(0);
}
}