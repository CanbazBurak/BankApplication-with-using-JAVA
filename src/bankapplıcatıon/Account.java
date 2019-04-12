/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bankapplıcatıon;
import java.util.Scanner;
import jdk.nashorn.tools.ShellFunctions;
/**
 *
 * @author USER
 */
public class Account extends Bank{
    
    protected int id;
    protected String owner ;
   protected String dateofopening;
   protected  double interestrate;
   
   
	public void setid(int id) {

		this.id =id;
	}

	public void setowner(String owner) {

		this.owner = owner;
	}

	public void setdateofopening(String dateofopening) {

		this.dateofopening = dateofopening;
	}


	public void setinsterestrate(double interestrate) {

		this.interestrate = interestrate;
	}

	public int getid() {

		return id;
	}
        
        //------------------------------------------------------------------
        
        String getowner() {

		return owner;
	}
	String getdateofopening() {

		return dateofopening;
	}
	double getisterestrate() {

		return interestrate;
	}
	void transfering(Account other) {

		double num;

            System.out.println("Enter the amount you want to transfer.");
            Scanner input = new Scanner(System.in);
            
            num=input.nextDouble();
            
		

		if (num > balance) {
                    
                    System.out.println("You dont have enough money in your account.You can transfer money maxiumum "+balance);
                   
			

		}

		else if (num <= balance) {

			balance = balance - num;

			other.balance = num + other.balance;
                        
                    System.out.println("Proccess is completed.");
			


		}
	}
	void receiving()
	{
		double amount;
                System.out.println("Enter the amount you want to withdraw");
                Scanner input = new Scanner(System.in);
		amount= input.nextDouble();
                        
		
		if (amount > balance)
		{
                    System.out.println("There is not enough money in your account.");
			
		}
		else if (amount <= balance)
		{
			balance = balance - amount;
                        
                        System.out.println("The amount of money in your account:");
			
			
		}
	}
	 double calculateinterestrate(double rate) {
	if (rate > 0) 
		{
			balance = balance * rate + balance;
			return balance;
		}
	else 
		{
               System.out.println("Interest rate can't be negative or equal to 0!!!");
			return 0;
		}
        
        
	}


        

}
