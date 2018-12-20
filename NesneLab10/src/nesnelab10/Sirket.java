

package nesnelab10;

import java.util.ArrayList;



public class Sirket {
    
    private ArrayList<Calisan> calisanlar = new ArrayList<>();
    
    public Sirket(){
        
        calisanlar.add(new Calisan("ali" ,3000));
        calisanlar.add(new Calisan("veli" ,3000));
        calisanlar.add(new Yonetici("hikmet",2000));
            
            
        
        
    }
    
    public void calisanlarGoster(){
        
        System.out.println("Çalışan isimi: " + calisanlar.get(0).isim + "\nÇalışanın maaşı: " + calisanlar.get(0).maas);
        System.out.println("Çalışan isimi: " + calisanlar.get(1).isim + "\nÇalışanın maaşı: " + calisanlar.get(1).maas);
        System.out.println("Yonetici isimi: " + calisanlar.get(2).isim + "\nYonetici maaşı: " + calisanlar.get(2).getMaas());
        
    }
    
    public static void main(String[] args){
        
        Sirket sirket = new Sirket();
        ((Yonetici)sirket.calisanlar.get(2)).setBonus(200);
        sirket.calisanlarGoster();
        
    }
    
    
}
