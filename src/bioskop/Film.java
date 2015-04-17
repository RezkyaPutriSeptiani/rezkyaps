/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bioskop;
import java.util.Date;
/**
 *
 * @author rezkyaputriseptiani
 */
public class Film {
    private String judul;
    private Date waktuTayang;

    /**
     * @return the judul
     */
    public String getJudul() {
        return judul;
    }

    /**
     * @param judul the judul to set
     */
    public void setJudul(String judul) {
        this.judul = judul;
    }

    /**
     * @return the waktuTayang
     */
    public Date getWaktuTayang() {
        return waktuTayang;
    }

    /**
     * 
     * @param waktuTayang
     */
    public void setWaktuTayang(Date waktuTayang) {
        
       
        this.waktuTayang = waktuTayang ;
    }
    
}
