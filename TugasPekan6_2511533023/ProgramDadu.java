package TugasPekan6_2511533023;

import java.util.Random; 

public class ProgramDadu { 
 
 public static void main(String[] args) { 
  Random rand = new Random(); 
  int dadu1, dadu2, jumlah; 
  int hitung = 0; 
  System.out.println("=== PERULANGAN WHILE ==="); 
  jumlah = 0; 
  while (jumlah != 7) { 
   dadu1 = rand.nextInt(6) + 1; 
   dadu2 = rand.nextInt(6) + 1; 
   jumlah = dadu1 + dadu2; 
   hitung++; 
   System.out.println("dadu1: " + dadu1 + " | dadu2: " + dadu2 + " || jumlah: " + jumlah);
 
  } 
  System.out.println("jumlah 7 muncul!"); 
  System.out.println("total perulangan: " + hitung + "kali."); 
   
 
 }
}
