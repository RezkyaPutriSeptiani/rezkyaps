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
public class GedungStudio {
   
    
    private int nomorStudio;
    
    

    /**
    
   
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
    public void setNomorStudio(int nomorStudio) throws Exception{
        
        try { 
            if (nomorStudio==1){
        
                this.nomorStudio=nomorStudio;
        
                      }
            else if (nomorStudio==2){
            this.nomorStudio=nomorStudio;
            
            
            }
            else if (nomorStudio==3){
            this.nomorStudio=nomorStudio;
            
            }
            
            else if (nomorStudio==4){
            
            this.nomorStudio=nomorStudio;
            }
            
            else {System.out.println("Jumlah Studio Hanya 4");}
      
        
        }
        
        
        
        catch (Exception e){throw e;
        
        
        
        }
        this.nomorStudio = nomorStudio;
    }
    
}
