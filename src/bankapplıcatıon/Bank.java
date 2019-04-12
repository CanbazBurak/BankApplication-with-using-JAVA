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
public class Bank {
    protected double balance;
    protected double income;
     public void setbalance(double bal) {

		balance = bal;
	}
	public double getbalance() {

		return balance;
	}


	public void setincome(double in) {

		income = in;
	}
	public double getincome() {

		return income;
	}
	
	virtual void  transfering() {

		//////////////////////////////transfering


	}
	virtual void receiving() {
	////////////////////////////////receiving
	}
    
    
    
}
