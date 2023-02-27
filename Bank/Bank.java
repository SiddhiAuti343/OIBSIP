
import java.util.*;
class Bank
{

    void input()
	{

 	  	 int user_id,pin_no;
  		 Scanner sc=new Scanner(System.in);
  		 System.out.println("Please enter the user id:");
   		 user_id=sc.nextInt();
   		 System.out.println("Please enter the pin no:");
           pin_no:sc.nextInt();

           System.out.println("User has enter correct details and logged in successfully!!!!!");
	}

          public static void main(String[] args)
		{
              int op;
              Transaction d=new Transaction();
			while(true)
			{
				System.out.println("1.Deposit");
				System.out.println("2.Withdraw");
				System.out.println("3.Transfer");
				System.out.println("4.Transaction Details");
				System.out.println("5.Exit");
                  Scanner sc=new Scanner(System.in);
			    op=sc.nextInt();	
                  switch(op)
                {
                    case 1:
                           d.input();
                           d.depositbank();
                           break;
				 case 2:
                           d.withdrawbank();
                           break;
                    case 3:
                           d.transdep();
                           d.transwith();
                           break;
                    case 4:
                           d.transdetails();
                           break;
                   case 5:
           			 System.exit(0);
                        break;
             }
	
				
		}
}
}


class deposit extends Bank
{
    	
	int in_bal,amt,trans_d,trans_w;			
     void depositbank()
	{	
		Scanner sc=new Scanner(System.in);
          System.out.println("Please enter the initial balance of user:");
          in_bal=sc.nextInt();
			System.out.println("Please enter the amount to be deposited:");
          amt=sc.nextInt();
			in_bal=in_bal+amt;
			System.out.println("The new amount after deposit is:"+in_bal);	
	
	}
}



class withdraw extends deposit
{
	void withdrawbank()
	{
        Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the amount to be withdrawed:");
		amt=sc.nextInt();
		in_bal=in_bal-amt;
		System.out.println("The new amount after withdrawal is:"+in_bal);
	}
}



class Transfer extends withdraw
{
	
	int td;
     void transdep()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the amount to be received:");
		td=sc.nextInt();
		in_bal=in_bal+td;
		System.out.println("The new amount is:"+in_bal);
	}
	
	int wd;
	void transwith()
	{
        Scanner sc= new Scanner(System.in);
		System.out.println("Please enter the amount to be sent:");
		wd=sc.nextInt();
		in_bal=in_bal-wd;
		System.out.println("The new amount is:"+in_bal);
	}
}

		
class Transaction extends Transfer
{
    		
		void transdetails()
		{
			System.out.println("The last transaction amount to be deposited is:"+td);
			System.out.println("The last transaction amount to be withdrawed is:"+wd);
		}
}


			
		



			
		  
   
  