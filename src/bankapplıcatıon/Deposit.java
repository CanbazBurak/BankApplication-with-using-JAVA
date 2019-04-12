/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankapplıcatıon;

/**
 *
 * @author USER
 */
public class Deposit extends Account{
    
    protected double deposit;
        public void setdeposit(double deposit) {

		this.deposit = deposit;
	}

	public double getdeposit() {

		return deposit;
	}
	public double calculateinterestrate(double rate)
	{
		if (rate > 0)
		{
			deposit = deposit * rate + deposit;
			return deposit;
		}
		else
		{
                    System.out.println("Interest rate can't be negative or equal to 0!!!");
			
			return 0;
		}

    
    
}
