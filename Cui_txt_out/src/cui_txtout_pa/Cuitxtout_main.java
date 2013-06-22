package cui_txtout_pa;

import java.util.Scanner;

public class Cuitxtout_main {


	public static void main(String[] args) {
		try{
			System.out.println("行いたい処理を選択してください");
			System.out.println("新規作成:1 ファイルの編集:2 ファイルの閲覧:3");
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
				System.out.println("1から3を入力してください");
			}
			scan.close();
		}catch(Exception e){
			System.out.println("入力にエラーが発生しました。");
		}
	}
}


