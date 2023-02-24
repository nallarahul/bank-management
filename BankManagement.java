package Miniprojects;
import java.util.Scanner;
public class BankManagement 
{
    public static void main(String[] args)
    {
        String username,userid;
        int op=1,balance=0,deposit=0,withdrawl=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("**********WELCOME TO STATE BANK OF INDIA - VIT AP**********");
        System.out.println("Username :");
        username=sc.nextLine();
        System.out.println("User Id :");
        userid=sc.nextLine();
        System.out.println("     \nCostumer Details");
        System.out.println("**************************");
        System.out.println("Username - "+username);
        System.out.println("User Id - "+userid);
        System.out.println("**************************");
        while(op!=4)
        {
            
            System.out.println("\n");
            System.out.println("***************************");
            System.out.println("1.Check Balance");
            System.out.println("2.Deposit");
            System.out.println("3.Withdrawl");
            System.out.println("4.Exit");
            System.out.println("***************************");
            System.out.println("\nChoose an option :");
            op=sc.nextInt();
            if(op!=1 && op!=2 && op!=3 && op!=4)
            {
                System.out.println("\nInvalid option,Please try again !!");
                continue;
            }
            else if(op==1)
            {
                System.out.println("**************");
                System.out.println("Balance= "+balance);
                System.out.println("**************");
            }
            else if(op==2)
            {
                System.out.println("**************");
                System.out.println("Amount--->");
                System.out.println("**************");
                deposit=sc.nextInt();
                System.out.println("\nDeposit successfull !!");
                balance=balance+deposit;
            }
            else if(op==3)
            {
                System.out.println("**************");
                System.out.println("Amount--->");
                System.out.println("**************");
                withdrawl=sc.nextInt();
                balance-=withdrawl;
                if(balance<=0)
                System.out.println("******Insufficient balance !!******");
                System.out.println("******Withdrawl not possible*******");
            }
            
        }
        System.out.println("\n\n*************************************");
        System.out.println("             Thank you");
        System.out.println("          Visit us again !!");
        System.out.println("*************************************");
        sc.close();
    }

}
