/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankapplıcatıon;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Loan {
    
    protected double loan;
		
	public void setloan(double loan) {

			this.loan = loan;
		}

		public double getloan() {

			return loan;
		}
		public double calculateinterestrate(double rate)
		{
			double loanWithRate;
                        System.out.println("Enter the amount of credit");
			Scanner input = new Scanner(System.in);
		   loan =input.nextDouble();
                        
                        System.out.println("Amount of loan:"+loan);
			
			loanWithRate = loan * rate + loan;
			return (loanWithRate);

		}
    
}
