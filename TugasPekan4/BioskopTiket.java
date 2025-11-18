package TugasPekan4;

import java.util.Scanner;

public class BioskopTiket {



			public static void main(String[] args) {
				Scanner input = new Scanner(System.in);
				
				System.out.println("====== PEMBELIAN TICKET BIOSKOP ======");
				
				// Input data
				System.out.print("Nama Pembeli     : ");
				String namaPembeli = input.nextLine();
				
				System.out.print("Jumlah Tiket     : ");
				int jumlahTicket = input.nextInt();
				
				System.out.print("Hari (1=Senin-Kamis, 2=Jumat, 3=Sabtu-Minggu): ");
				int hari = input.nextInt();
				
				System.out.print("Waktu Tayang (1=Pagi, 2=Siang, 3=Malam): ");
				int waktu = input.nextInt();
				
				System.out.print("Jenis Studio (1=Reguler, 2=Deluxe, 3=Premium): ");
				int studio = input.nextInt();
				
				// Aturan harga
				double hargaDasar = 50000;
				double biayaHari = 0;
				double biayaWaktu = 0;
				double diskon = 0;
				
				// Hitung biaya tambahan berdasarkan hari
				if (hari == 1) {
					biayaHari = 0; // Senin-Kamis
				} else if (waktu == 2) {
					biayaHari = 0.15; // Jumat +15%
				} else if (hari == 3) {
					biayaHari = 0.30; // Sabtu-Minggu +30%
				}
				
				// Hitung biaya tambahan berdasarkan waktu
				if (waktu == 1) {
					biayaWaktu = 0; // Pagi
				} else if (waktu == 2) {
					biayaWaktu = 0.10; // Siang +10%
				} else if (waktu == 3) {
					biayaWaktu = 0.20; // Malam +20%
				}
				
				// Hitung harga per ticket
				double hargaPerTicket = hargaDasar * (1 + biayaHari + biayaWaktu);
				
				// Hitung subtotal
				double subtotal = hargaPerTicket * jumlahTicket;
				
				// Diskon 25% jika beli ≥ 5 ticket
				if (jumlahTicket >= 5) {
					diskon = 0.25 * subtotal;
				}
				
				double totalBayar = subtotal - diskon;
				
				// Konversi angka ke nama hari/waktu/studio
				String namaHari = "";
				if (hari == 1) namaHari = "Senin-Kamis";
				else if (hari == 2) namaHari = "Jumat";
				else if (hari == 3) namaHari = "Sabtu-Minggu";
				
				String namaWaktu = "";
				if (waktu == 1) namaWaktu = "Pagi";
				else if (waktu == 2) namaWaktu = "Siang";
				else if (waktu == 3) namaWaktu = "Malam";
				
				String namaStudio = "";
				if (studio == 1) namaStudio = "Reguler";
				else if (studio == 2) namaStudio = "Deluxe";
				else if (studio == 3) namaStudio = "Premium";
				
				// Output hasil
				System.out.println("\n==============================");
				System.out.println("Nama Pembeli     : " + namaPembeli);
				System.out.println("Jumlah Ticket    : " + jumlahTicket);
				System.out.println("Hari             : " + namaHari);
				System.out.println("Waktu Tayang     : " + namaWaktu);
				System.out.println("Jenis Studio     : " + namaStudio);
				System.out.println("-----------------------------");
				System.out.printf("Harga Dasar       : Rp %.0f/ticket%n", hargaDasar);
				System.out.printf("Biaya Hari        : +%d%%%n", (int)(biayaHari * 100));
				System.out.printf("Biaya Waktu       : +%d%%%n", (int)(biayaWaktu * 100));
				System.out.printf("Harga per Ticket  : Rp %.0f%n", hargaPerTicket);
				System.out.printf("Subtotal          : Rp %.0f%n", subtotal);
				System.out.printf("Diskon (25%%)      : Rp %.0f%n", diskon);
				System.out.println("-----------------------------");
				System.out.printf("TOTAL BAYAR       : Rp %.0f%n", totalBayar);
				System.out.println("==============================");
				
				input.close();
			}
		}

	


