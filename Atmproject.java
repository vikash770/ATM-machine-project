
package corejava;

import java.util.Scanner;

class Atm{
	float Balance;
	int Pin;
	
	public void checkpin() {
		
	}
	public void menu() {
			System.out.println("enter your choice:");
			System.out.println("1.check A/C balance:");
			System.out.println("2.withdraw money:");
			System.out.println("3.diposite money:");
			System.out.println("4.exit");
			
			Scanner sf=new Scanner(System.in);
			int opt =sf.nextInt();
			
			
			if(opt == 1) {
				checkbalance();
			}
			else if(opt == 2) {
				withdrawmoney();
			}
			
			else if (opt == 3) {
				dipositemoney();
			}
			
			else {
				System.out.println("exit");
				System.out.println("please right number provide:");
				
				menu();
			}
			
	}
	
	public void checkbalance() {
		System.out.println("Balance:"+Balance);
		
		menu();
		
	}
	
	public void withdrawmoney() {
		System.out.println("enter amount:");
		
		Scanner ss=new Scanner(System.in);
		float amount= ss.nextFloat();
		if(amount>Balance) {
			System.out.println("infuliance balance");
		}
		else {
			Balance = Balance-amount;
			System.out.println("money has been debited");
			
			System.out.println("Available Balance:"+ Balance);
			
			
		}
		menu();
	}
	
	
	public void dipositemoney() {
		System.out.println("enter the amount:");
		Scanner sa=new Scanner(System.in);
		float amount =sa.nextFloat();
		Balance= Balance+amount;
		System.out.println("money add succesfully");
		
		menu();
	}
	
	

}
public class Atmproject {

	public static void main(String args[]) {
		System.out.println("welcome sbi atm");
		
		Scanner sc =new Scanner(System.in);
		System.out.println("enter your pin:");
		
		int Pin=sc.nextInt();
		Atm o=new Atm();
		o.checkbalance();
		
	}
}
