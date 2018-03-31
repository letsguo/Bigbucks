import java.util.*;
import java.io.*;
import java.text.*;
/**
 * Write a description of class Tester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class Tester{
    public static void main(String []args){
        NumberFormat formatter = NumberFormat.getNumberInstance( );
        formatter.setMinimumFractionDigits(2);
        formatter.setMaximumFractionDigits(2);
        List<BankAccount> listOfAccounts = new ArrayList();
        String name;
        do{
            Scanner kbReader = new Scanner(System.in);
            System.out.print("Please enter the name to whom the account belongs.(\"Exit\" to abort)");
            name = kbReader.nextLine( );
            if( !name.equalsIgnoreCase("EXIT") )
            {
                System.out.print("Please enter the amount of the deposit. ");
                double amount = kbReader.nextDouble();
                System.out.println(" "); //gives an eye-pleasing blank line
                BankAccount ba1 = new BankAccount(name, amount);// Create a BankAccount object
                listOfAccounts.add(ba1);
            }
        } while(!name.equalsIgnoreCase("EXIT"));
        //Search aryList and print out the name and amount of the largest bank account
        BankAccount ba = listOfAccounts.get(0);
        double maxBalance = ba.balance;
        String maxName = ba.name;
        for(int j = 1; j < listOfAccounts.size( ); j++)
        {
            ba = listOfAccounts.get(j);
            if (ba.balance > maxBalance){
                maxBalance = ba.balance;
                maxName = ba.name;
            }
        }
        System.out.println("The account with the largest balance belongs to " + maxName);
        System.out.println("The amount is " + maxBalance);
        
    
    }
}
