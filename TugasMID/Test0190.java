public class Test0190 {
	public static void main(String[] args) {

		Balok balok1 = new Balok();

		Balok balok2 = new Balok(20, 35, 15);

		balok1.setL(5);

		balok1.setP(25);
		
		balok2.setT(10);

		balok1.info();

		balok2.info();
	}
}