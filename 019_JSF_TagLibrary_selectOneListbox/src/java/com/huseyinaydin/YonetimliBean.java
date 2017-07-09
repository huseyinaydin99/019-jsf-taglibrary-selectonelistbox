/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.huseyinaydin;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author husey
 */
@ManagedBean
@RequestScoped
public class YonetimliBean {
    
    private String seciliDeger;

    public String getSeciliDeger() {
        return seciliDeger;
    }

    public void setSeciliDeger(String seciliDeger) {
        this.seciliDeger = seciliDeger;
    }
    
    
    
    private Egitmen[] egitmenDizi;
    
    public YonetimliBean(){
        
    }
    
    public static class Egitmen{
        public String egitmenAdi,dersAdi;

        public Egitmen(String egitmenAdi, String dersAdi) {
            this.egitmenAdi = egitmenAdi;
            this.dersAdi = dersAdi;
        }
        
        public String getEgitmenAdi() {
            return egitmenAdi;
        }

        public void setEgitmenAdi(String egitmenAdi) {
            this.egitmenAdi = egitmenAdi;
        }

        public String getDersAdi() {
            return dersAdi;
        }

        public void setDersAdi(String dersAdi) {
            this.dersAdi = dersAdi;
        }
        
    }


    public Egitmen[] getEgitmenDizi() {
        egitmenDizi = new Egitmen[3];
        egitmenDizi[0] = new Egitmen("Onur Salkın", "Donanım");
        egitmenDizi[1] = new Egitmen("Özgür Yılman", "PHP");
        egitmenDizi[2] = new Egitmen("Uğur Dokucu", "Herşeye");
        return egitmenDizi;
    }

    public void setEgitmenDizi(Egitmen[] egitmenDizi) {
        this.egitmenDizi = egitmenDizi;
    }
    
    
    
}
