package cui_txtout_pa;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class New_Text {
	public void main() {
		try {
			System.out.println("作成するファイル名を入力してください");
			Scanner scan = new Scanner(System.in);
			String s_NT = scan.next();
			File file = new File(s_NT + ".txt");
			file.createNewFile();
			BufferedWriter bw = new BufferedWriter(new FileWriter(file));

			System.out.println("文字を入力してください。");
			System.out.println("終了する場合\"EndEdit\"と入力してください");
			String txtW = null;
			boolean flag = true;
			while(flag==true){
				txtW = scan.next();
				if(!txtW.equals("EndEdit")){
					bw.write(txtW);
					bw.newLine();
				}else{
					flag = false;
				}
			}

			scan.close();
			bw.close();
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}