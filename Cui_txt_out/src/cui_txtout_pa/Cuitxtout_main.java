package cui_txtout_pa;

import java.util.Scanner;

public class Cuitxtout_main {


	public static void main(String[] args) {
		try{
			System.out.println("�s������������I�����Ă�������");
			System.out.println("�V�K�쐬:1 �t�@�C���̕ҏW:2 �t�@�C���̉{��:3");
			Scanner scan = new Scanner(System.in);
			String s_P_i = scan.next();
			if(s_P_i.equals("1")){
				New_Text n_txt = new New_Text();
				n_txt.main();
			}else if(s_P_i.equals("2")){
				Text_edit e_txt = new Text_edit();
				e_txt.main();
			}else if(s_P_i.equals("3")){
				Txt_print print = new Txt_print();
				print.main();
			}else{
				System.out.println("1����3����͂��Ă�������");
			}
			scan.close();
		}catch(Exception e){
			System.out.println("���͂ɃG���[���������܂����B");
		}
	}
}


