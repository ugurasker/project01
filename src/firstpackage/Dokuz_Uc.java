package firstpackage;

public class Dokuz_Uc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long elapseTime = 10000;
		while (elapseTime < 1000000000000L) {
       java.util.Date date = new java.util.Date(elapseTime);
       System.out.println(date.toString());
          elapseTime *=10;
		}
	}

}
