/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117118.latihan20.targetsaldo;

public class PBO210116058Latihan20Targetsaldo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double saldoAwal = 3500000;
        double bunga = 0.08;
        double target = 6000000;
        
        int i = 1;
        
        do{
            saldoAwal = saldoAwal * bunga + saldoAwal;
            System.out.println("Saldo di bulan ke-" + i + " Rp " +
                    saldoAwal);i++;
                    
        }while(saldoAwal <= target);
        
    }
    
}