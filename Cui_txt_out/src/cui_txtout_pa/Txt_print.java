package cui_txtout_pa;

import java.util.Scanner;

public class Txt_print {
	public void main(){
		System.out.println("�J�������t�@�C�������w�肵�Ă��������B(�g���q�s�v)");
		Scanner scan = new Scanner(System.in);
		String s_DP = scan.next();
		Readfile readf = new Readfile(s_DP + ".txt");
		for(int i=0; i<readf.num1; i++){
			System.out.println(readf.s_A_L.get(i));
		}
		scan.close();
	}

}
