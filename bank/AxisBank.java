package bank;

public class AxisBank extends BankInfo {
	public void deposit()
	{
		System.out.println("deposit in Axis bank");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankInfo bi=new BankInfo();
		bi.saving();
		bi.fixed();
		bi.deposit();
		AxisBank AB=new AxisBank();
		AB.deposit();
		

	}

}
