package pekan7_2511533023;

public class Mahasiswa_2511533023 {

	
		private int nim;
		private String nama, nim2;
		
		public  void setNim (int nim) {
			this.nim=nim;
		}
		
		public  void setNim2 (String nim2) {
			this.nim2=nim2;
		}
		public  void setNama (String nama) {
			this.nama=nama;
		}
		public int getNim() {
			return nim;
		}
		public String getNim2() {
			return nim2;
		}
		public String getNama() {
			return nama;
		}
		public void cetak() {
			System.out.println("Nim : "+nim);
			System.out.println("Nama : "+nama);
		}
		public void cetak2() {
			System.out.println("Nim : "+nim2);
			System.out.println("Nama : "+nama);
		}

	

}
