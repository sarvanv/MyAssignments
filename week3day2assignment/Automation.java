package week3day2assignment;

public class Automation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleLangauge mlang=new MultipleLangauge();
		mlang.java();
		mlang.javascript();
		mlang.ruby();
		mlang.python();
		mlang.selenium();
		
		System.out.println("--Calling Language Interface--");
		Language Lang = new MultipleLangauge();
		Lang.java();
		Lang.javascript();
		Lang.ruby();
		
		System.out.println("--Calling TestTool Interface--");
		TestTool TT= new MultipleLangauge();
		TT.selenium();

	}

}
