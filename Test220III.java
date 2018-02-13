package programs;

interface Transaction_service3{
	void deposit(String acc_No, int dep_Amt);
	void withdraw(String acc_No, int withdraw_Amt);
	void transfer_Amount(String from_Account, String to_Account, int transfer_amount);
}

class Bank3{
	public void doTransaction(Transaction_service3 tx){
		tx.deposit("abc123", 10000);
		tx.withdraw("xyz123", 500);
		tx.transfer_Amount("abc123", "xyz123", 700);
	}	
}

public class Test220III {
	public static void main(String[] args) {
		Bank3 b = new Bank3();
		Transaction_service txn = new Transaction_service_implementation();
		  b.doTransaction(new Transaction_service3(){
				public void deposit(String acc_No, int dep_Amt){
					System.out.println(dep_Amt+" deposited in the " +acc_No+" account number");
				}
				public void withdraw(String acc_No, int withdraw_Amt){
					System.out.println(withdraw_Amt+" withdrawn from the " +acc_No+" account number");
				}
				public void transfer_Amount(String from_Account, String to_Account, int transfer_amount){
					System.out.println(transfer_amount+" is tranfered from " +from_Account+" to "+to_Account);
				}
			});
	}
}