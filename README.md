# NesneLab10
Lab Çalışması :      13.12.2018
Polymorphism Uygulaması
 Kisi
		   |
	           Calisan
		   |
	          Yonetici
		  	  
	           Sirket

Kisi sinifinda isim adinda degisken olacak. Yapilandirici (String tipinde isim alir) ve kisinin ismini donduren getIsim() adinda bir fonksyon olacak.
Calisan Kisi den tureyecek. int tipinde maas adli degiskeni olacak. Isim ve maas parametreleri alip seteden bir yapilandiricisi olacak. getMaas() ve setMaas(int ms) adinda iki adet de fonksiyonlari olacak. getMaas calisanin maasini dondurur. setMaas calisanin maasini degistirir. 
Yonetici sinifi Calisan’dan tureyen bir siniftir. int tipinde bonus adli degiskeni var. Yonetici sinifinin isim ve maas parameter olarak alan yapilandiricisi var. Bu yapilandirici icinde bonus varsayilan degeri 0 verilecek. Ayrica bu sinif icinde setBonus(int bns), getBonus() ve getMaas() fonksiyonlari da olacak. setBonus yoneticinin bonusunu set eder. getBonus yoneticinin bonusunu dondurur. getMaas ise yoneticinin maasina bonusunu da ekleyerek dondurur. Calisandan turemesine ragmen getMaas fonksyonunu override etmesinin nedeni de budur.
Sirket sinifi icinde, 
Calisan[] calisanlar; seklinde bir dizi tanimliyorsunuz. Bu diziye sirket sinifinin yapilandiricisi icinde 1 adet yonetici ve 2 adet de calisan ekliyorsunuz. 
Sirket sinifi icersinde yazicaginiz main fonksyonu ve calisanlariGoster() fonksiyonu ile yapilandiricida set ettiginiz calisanlar dizisini gosteriyorsunuz. Asagida Sirket sinifinin taslagi verilmistir.
public class Sirket {
	private Calisan[] calisanlar;
	public Sirket() {
		//DOLDUR
	}
	public void calisanlariGoster( ) {
	  	//DOLDUR
	}
	public static void main(String[] args) {
		Sirket sirket = new Sirket( );
		sirket.calisanlariGoster( );
	}
}
