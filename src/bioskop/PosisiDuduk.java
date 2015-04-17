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
public class PosisiDuduk {
    private int nomorKursi;
    private int nomorStudio;

    /**
     * @return the nomorKursi
     */
    public int getNomorKursi() {
        return nomorKursi;
    }

    /**
     * @param nomorKursi the nomorKursi to set
     * @throws java.lang.Exception
     */
    public void setNomorKursi(int nomorKursi) throws Exception {
        
        try { 
        this.nomorKursi=nomorKursi;
        
        
        }
         catch (Exception e) {
         throw new Exception ("nomor kursi harus berupa angka");}
        
        
    }

    /**
     * @return the nomorStudio
     */
    public int getNomorStudio() {
        return nomorStudio;
    }

    /**
     * @param nomorStudio the nomorStudio to set
     * @throws java.lang.Exception
     */
    public void setNomorStudio(int nomorStudio) throws Exception { 
        try {
            this.nomorStudio = nomorStudio;}
        catch (Exception e){
        throw new Exception ("nomor studio harus berupa angka");
        }
    
           
        }
        
    }
    
    

