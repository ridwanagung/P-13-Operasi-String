public class Demo1{
	
	public static void main (String[] args){
		String S = "Pemrogaman Java";
		String HurufKapital = S.toUpperCase();
		String HurufKecil = S.toLowerCase();

		int IndexAwal = 12;
		int IndexAkhir = 16;
		char[] Karakter = new char [IndexAkhir-IndexAwal];
		S.getChars (IndexAwal, IndexAkhir, Karakter, 0);

		byte[] temp = new byte [S.length()];
		temp = S.getBytes();

		String Trim = S.trim();
		String Sub = S.substring(5 ,9);
		String Replace = S.replace("Pemrogaman", "Program");
		String Replace2 = "Java".replace('v', 'w');

		System.out.println("Penggunaan toUpperCase() \t:" +HurufKapital);
		System.out.println("Penggunaan method toLowerCase() \t:" +HurufKecil);
		System.out.println("Penggunaan method charAt() \t:" +S.charAt(0));
		System.out.println("Penggunaan method getChars() \t:" +Karakter[0]);
		System.out.println("Penggunaan method getBytes() \t:" +temp[0]);
		System.out.println("Penggunaan method trim() \t:" +Trim);
		System.out.println("Penggunaan method substring() \t:" +Sub);
		System.out.println("Penggunaan method replace() \t:" +Replace+""+Replace2);

	}
}

// Integer merpakan tipe daata dan juga class pada java
//int tipe data murni
//Doubel dengan D yanng besar itu merupakan sebuah class tersendiri pada java
// Sedangkan penulisan dengan huruf kecil doubel itu merupakan tipe data murni