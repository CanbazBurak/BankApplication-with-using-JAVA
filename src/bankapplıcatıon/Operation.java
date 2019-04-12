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
public class Operation extends Account{
    
         protected String type;
	 protected String dateofexecution;
	 protected String description;


	public Operation(String tp, String doe, String dsp)
		{
			type = tp;
			dateofexecution = doe;
			description = dsp;
		}
    
}
