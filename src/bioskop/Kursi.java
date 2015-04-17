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
public class Kursi {
    private int nomorKursi;
    private String tingkatanKursi;
    

    
   
    /**
     * @return the nomorKursi
     */
    public int getNomorKursi() {
        return nomorKursi;
    }

    /**
     * @param nomorKursi the nomorKursi to set
     */
    public void setNomorKursi(int nomorKursi) {
        try{
                if (nomorKursi==0){ System.out.println("Tidak boleh nomor kursi =0");

                 }

                else if (nomorKursi>100){
                System.out.println("kapasitas maksimal penonton dalam 1 studio adalah 100");

                }
         }
        
        catch (Exception e){System.out.println("Nomor Kursi Harus Berupa Angka");
        
        
                             }
        this.nomorKursi = nomorKursi;
    }

    /**
     * @return the tingkatanKursi
     */
    public String getTingkatanKursi() {
        return tingkatanKursi;
    }

    /**
     * @param tingkatanKursi the tingkatanKursi to set
     * @throws java.lang.Exception
     */
    public void setTingkatanKursi(String tingkatanKursi) throws Exception{
        String A = null,B = null,C=null,D=null,E=null,F=null;
        try{        
                    if (tingkatanKursi.equals(A)){ tingkatanKursi=A;
                   }

                    else if (tingkatanKursi.equals(B)){ tingkatanKursi=B;
                   }

                    else if (tingkatanKursi.equals(C)){ tingkatanKursi=C;
                   }

                    else if (tingkatanKursi.equals(D)){ tingkatanKursi=D;
                   }


                    else if (tingkatanKursi.equals(E)){ tingkatanKursi=E;
                   }

                    else if (tingkatanKursi.equals(F)){ tingkatanKursi=F;
                   }
                    
                    
        }
        
        
        catch (Exception e)
                { throw new Exception ("Tingkatan Kursi Penonton Hanya dari A hingga F dan berupa Huruf");
        
                 }
        
        
        
        this.tingkatanKursi = tingkatanKursi;
    }
    
}
