public class AutoNim{
	
	public static void main(String[]args){
		// NIM : Tahum Masuk + Kode Prodi + Nomor Urut registrasi
		String ta = "2015"; 
		String kd_prodi = "153";
		String no_reg = "0001";
		String nim;

		nim = ta.substring(2, 4) + kd_prodi+no_reg;// angaka 2 menunjukan index awal dan 4 menunjukan sampai karakter berapa/karakter stop

		System.out.println("NIM : "+nim);
	}
}