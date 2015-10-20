package com.wbqa.edu;


public class Account {
	
	public int amt;
	public int accountNumber;
	public double accountBalance;

	 public void dosomething()
	 {
	 }
	public void withdraw(int amt)
	{
		if(amt>0)
		{
			   accountBalance= (accountBalance- amt);
				
		}	 
	}
	

    public static void main(String args[])
    {
    
    	
    	Account a= new Account();
    			a.accountBalance=100;
    	        a.accountNumber= 1;
    	        
    	        System.out.println("accountBalance:" + a.accountBalance);
    	        
    			
    	
    }	
}

