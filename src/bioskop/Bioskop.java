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
public class Bioskop {

    /**
     * @param args the command line arguments
     
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
     Petugas petugas1=new Petugas ();
     
            petugas1.setId("270810");
               try {
                   petugas1.setNama("Rezkya");}
            catch (Exception e){ System.out.println(e.getMessage());
            }

        
     
     Film film1 = new Film ();
            film1.setJudul("Two Constables");
            film1.setWaktuTayang(new Date ());
     
    
            Kursi kursi1=new Kursi ();
                kursi1.setNomorKursi(13);
                try{
                kursi1.setTingkatanKursi("B");}
                catch (Exception e){ System.out.println(e.getMessage());

                }
                
                
            GedungStudio studio1=new GedungStudio ();
            
            try {
            studio1.setNomorStudio(4);}
            catch (Exception e){ System.out.println(e.getMessage());
            
            }
            
            

     Tiket tiket1=new Tiket ();
            tiket1.setFilm(film1);
            tiket1.setKode("a23r");
            tiket1.setPetugas(petugas1);
            tiket1.setStudio(studio1);
            tiket1.setKursi(kursi1);
            tiket1.setHarga(50000);
     
     Transaksi transaksi1=new Transaksi ();
              transaksi1.setJumlahTiket(5);
            transaksi1.setBiaya();
            transaksi1.setPetugas(petugas1);
            transaksi1.setWaktuTransaksi(new Date ());
            transaksi1.setTiket(tiket1);
            transaksi1.setStudio(studio1);
            transaksi1.setKapasitas(100);
            
               System.out.println ("_____________________________________________________");
            System.out.println("MEGADUPLEX MOVIE TICKET");
             System.out.println("         ");
            System.out.println("MOVIE TITLE : TWO CONSTABLES");
             System.out.println ("_____________________________________________________");
            cetakTiket (tiket1);
            System.out.println("         ");
            System.out.println("         ");
            System.out.println(" ");
            System.out.println ("_____________________________________________________");
            System.out.println("BUKTI TRANSAKSI PEMBELIAN TIKET BIOSKOP");
            System.out.println ("_____________________________________________________");
            cetakTransaksi(transaksi1);
  
    }
    
    
     public static void  cetakTiket (Tiket tiket){
        System.out.println("Kode Tiket :" +" " + tiket.getKode());
         System.out.println("ID Petugas :" + " "+ tiket.getPetugas().getId());
         System.out.println("Nama Petugas :" +" " + tiket.getPetugas().getNama());
          System.out.println("Judul Film :" +" "+ tiket.getFilm().getJudul());
         System.out.println("Waktu Tayang Film :" +" " + tiket.getFilm().getWaktuTayang());
         System.out.println("Nomor Studio/Teater :"+ " " + tiket.getStudio().getNomorStudio());
         System.out.println("Nomor Kursi :"+ " " + tiket.getKursi().getTingkatanKursi()+ " " + tiket.getKursi().getNomorKursi());
         System.out.println ("Harga Tiket(per orang) :"+ " "+ tiket.getHarga());
        
      }
     
     public static void cetakTransaksi(Transaksi transaksi){
     
     System.out.println("Waktu Transaksi :" + " " + transaksi.getWaktuTransaksi());
     System.out.println("Judul Film :"+ " " +transaksi.getTiket().getFilm().getJudul()+ " di "+"Studio/teater "+transaksi.getStudio().getNomorStudio());
     
     System.out.println ("Jumlah Tiket yang Dibeli :"+" " + transaksi.getJumlahTiket());
     System.out.println("Total Harga(Jumlah Tiket x 50000(per orang) :"+" "+ transaksi.getBiaya());
     System.out.println("Jumlah Kursi yang Masih Tersisa :"+ " " +transaksi.getKapasitas());
     System.out.println("Nama Petugas :"+ " " + transaksi.getPetugas().getNama());
     System.out.println("ENJOY YOUR WATCHING !!!");
     System.out.println("THANKS FOR BUYING MEGADUPLEX MOVIE TICKET !!!");
     
     
     
     
     
     }
     
     
          
    
    
    
  
    
}




