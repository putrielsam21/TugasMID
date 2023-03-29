//13020210190 Putri Elsa Musati. M

interface A { 
	void aaa();
}
 
interface B extends A {
	void aaa();
}
	
class Central0190 implements A, B {
	public void aaa() {
		System.out.println("aaa");
	}

	public static void main(String arg[]) {
		System.out.println("main");
		Central0190 obj = new Central0190();
		obj.aaa();
	}
}
