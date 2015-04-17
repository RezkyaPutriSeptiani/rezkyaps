/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bioskop;

/**
 *
 * @author rezkyaputriseptiani
 */import java.util.Date;
public class Transaksi {
    private Tiket tiket ;
    private Petugas petugas;
    private Date waktuTransaksi;
    private int biaya;
    private int jumlahTiket;
    private GedungStudio studio;
    private int kapasitas;

    /**
     * @return the tiket
     */
    

    
    
     public int getKapasitas() {
        return kapasitas;
    }

    /**
     * @param kapasitas the kapasitas to set
     */
    public void setKapasitas(int kapasitas) {
    
     System.out.println("_____________________________________________________");
        System.out.println(" ");
     
    
      
       if (kapasitas-1==0) {
          System.out.println("Hanya bersisa satu kursi penonton");
      } 
      
      else if (kapasitas-1==-1){
      
          System.out.println("kursi sudah full semua");
      }
      
      
      
      else { this.kapasitas=kapasitas-jumlahTiket; 
      System.out.println("KETERANGAN BAGI PETUGAS/KASIR!!!!!");
      System.out.println(" ");
      System.out.println("JUMLAH KURSI YANG MASIH TERSEDIA = "+this.kapasitas);
      System.out.println("_____________________________________________________");
      System.out.println(" ");
      System.out.println(" ");
      System.out.println(" ");
      }
    }

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
     * @return the waktuTransaksi
     */
    public Date getWaktuTransaksi() {
        return waktuTransaksi;
    }

    /**
     * @param waktuTransaksi the waktuTransaksi to set
     */
    public void setWaktuTransaksi(Date waktuTransaksi) {
        
        this.waktuTransaksi = waktuTransaksi;
        
    }

    /**
     * @return the biaya
     */
    public int getBiaya() {
        return biaya;
    }

    
    public void setBiaya() {
       if (this.jumlahTiket!=1){
           biaya=this.jumlahTiket*50000;
       }
       
       else {
           biaya=50000;
       }
    }

    /**
     * @return the tiket
     */
    public Tiket getTiket() {
        return tiket;
    }

    /**
     * @param tiket the tiket to set
     */
    public void setTiket(Tiket tiket) {
        this.tiket=tiket;
       
    
    
   
    }

    /**
     * @return the jumlahTiket
     */
    public int getJumlahTiket() {
        return jumlahTiket;
    }

    /**
     * @param jumlahTiket the jumlahTiket to set
     */
    public void setJumlahTiket(int jumlahTiket) {
        this.jumlahTiket = jumlahTiket;
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

    
    
    
    
    
}
