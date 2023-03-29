class PersegiPanjang{
	 public static void main(String[] args) {
        PersegiPanjang pp1 = new PersegiPanjang();
        System.out.println("Panjang: " + pp1.getP() + ", Lebar: " + pp1.getL() + ", Luas: " + pp1.luas() + ", Keliling: " + pp1.keliling());

        PersegiPanjang pp2 = new PersegiPanjang(10, 15);
        System.out.println("Panjang: " + pp2.getP() + ", Lebar: " + pp2.getL() + ", Luas: " + pp2.luas() + ", Keliling: " + pp2.keliling());
    }
	int p, l;
	public PersegiPanjang() {
		p = 30;
		l = 20;
	}

	public PersegiPanjang(int p, int l) {
		this.p = p;
		this.l = l;
	}

	public void setP(int p) {
		this.p = p;
	}


	public int getP() {
		return p;
	}

	public void setL(int l) {
		this.l = l;
	}

	public int getL() {
		return l;
	}

	public int luas(){
		return p * l;
	}

	public int keliling(){
		return 2 * (p + l);
	}
}