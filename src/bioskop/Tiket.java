/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bioskop;
/**
 *
 * @author rezkyaputriseptiani
 */
public class Tiket {
    private Petugas petugas;
    private Film film;
    private GedungStudio studio;
    private Kursi kursi;
    private String kode;
    private int harga;
    
   
    

    /**
     * @return the petugas
     */
    public Petugas getPetugas() {
        return petugas;
    }

    /**
     * @param petugas the petugas to set
     */
    public void setPetugas(Petugas petugas) {
        this.petugas = petugas;
    }

    /**
    
    /**
     * @return the kode
     */
    public String getKode() {
        return kode;
    }

    /**
     * @param kode the kode to set
     */
    public void setKode(String kode) {
        this.kode = kode;
    }

    /**
     * @return the film
     */
    public Film getFilm() {
        
        return film;
    }

    /**
     * @param film the film to set
     */
    public void setFilm(Film film) {
        this.film = film;
    }

    /**
     * @return the harga
     */
    public int getHarga() {
        return harga;
    }

    /**
     * @param harga the harga to set
     */
    public void setHarga(int harga) {
        this.harga = harga;
    }

    /**
     * @return the studio
     */
    public GedungStudio getStudio() {
        return studio;
    }

    /**
     * @param studio the studio to set
     */
    public void setStudio(GedungStudio studio) {
        this.studio = studio;
    }

    /**
     * @return the kursi
     */
    public Kursi getKursi() {
        return kursi;
    }

    /**
     * @param kursi the kursi to set
     */
    public void setKursi(Kursi kursi) {
        this.kursi = kursi;
    }

  
    
    
    
    
    
    
    
    
    
    
}
