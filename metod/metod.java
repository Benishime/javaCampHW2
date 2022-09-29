package metod;

public class metod {

	public static void main(String[] args) {
		sayıVarmı(0);
	}
	public static void sayıVarmı(int aranacak ) {
		int[] sayılar = new int [] {1,2,3,4,5,6,7,8,0};
		boolean varMı=false;
		for (int sayı : sayılar) {
			if(aranacak==sayı) {
				varMı = true;	
			}
	}
		if(varMı==true) {
			System.out.println("sayı mevcuttur");
			
		}
		else {
			System.out.println("sayı mevcut değildir");
			
		}
	}
}