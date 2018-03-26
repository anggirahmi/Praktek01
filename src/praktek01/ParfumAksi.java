/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktek01;

/**
 *
 * @author Acer
 */
public class ParfumAksi {
    public static void main(String[] args) {
        Parfum A = new Parfum();
        Parfum B = new Parfum();
        Parfum C = new Parfum();
        
        
       A.jenis_parfum="cologne";
       A.merk_parfum="eskulin";
       A.kadar_alkohol="0.1 persen";
       A.harga_parfum="15.000";
       A.ukuran_botol="sedang";

       B.jenis_parfum="body mist";
       B.merk_parfum="vitalis";
       B.kadar_alkohol="0.5 persen";
       B.harga_parfum="20.000";
       B.ukuran_botol="kecil";
       
       C.jenis_parfum="Toillette";
       C.merk_parfum="casablanca";
       C.kadar_alkohol="0.5 persen";
       C.harga_parfum="22.000";
       C.ukuran_botol="besar";
    }
    
}
