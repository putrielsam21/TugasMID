//13020210190 Putri Elsa Musati. M

class Balok extends PersegiPanjang {
int t;
public Balok() {
	
    super();
    this.t = 15;}

public Balok(int p, int l, int t) {
    super(p, l);
    this.t = t;}

public int getT() {
    return t;}

public void setT(int t) {
    this.t = t;}

public int volume() {
    return super.luas() * this.t;}

public void info() {
    System.out.println("Panjang: " + super.getP() + ", Lebar: " + super.getL() + ", Tinggi: " + this.t + ", Luas: " + super.luas() + ", Volume: " + this.volume());
		}
		public static void main(String[] args) {
        Balok b1 = new Balok();
        b1.info();

        Balok b2 = new Balok(5, 10, 20);
        b2.info();
		}
	}