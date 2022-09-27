package reCapDemo_Classes;

public class Main {

	public static void main(String[] args) {
		DortIslem dortIslem = new DortIslem();
		int sonuc = dortIslem.Topla(3, 4);
		System.out.println(sonuc);
		int sonuc2 = dortIslem.Cıkar(4, 3);
		System.out.println(sonuc2);
		int sonuc3 = dortIslem.Carpma(3, 4);
		System.out.println(sonuc3);
		int sonuc4 = dortIslem.Bolme(6, 2);
		System.out.println(sonuc4);

	}

}
