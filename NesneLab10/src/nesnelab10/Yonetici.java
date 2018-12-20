/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nesnelab10;

/**
 *
 * @author cmp
 */
public class Yonetici extends Calisan{
    
    int bonus;
    
    public Yonetici(String ad, int maas) {
        super(ad, maas);
        
    }
    
    public void setBonus(int bonus){
        
        this.bonus = bonus;
        
    }
    
    public int getBonus(){
        
        return bonus;
        
    }

    @Override
    public int getMaas() {
        return maas+bonus;
    }

    
    
}
