package org.system;

public class Desktop extends Computer{
	public void desktopSize()
	{
		System.out.println("My desktop size is 43 inches");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer c=new Computer();
		System.out.println("--Computer Model--");
		c.computerModel();
		Desktop d=new Desktop();
		System.out.println("--Desktop Size--");
		d.desktopSize();
		System.out.println("--Inherited from Computer---");
		d.computerModel();

	}

}
