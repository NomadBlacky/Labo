package cui_txtout_pa;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Text_edit {
	public void main() {
		try{
			System.out.println("�ҏW����t�@�C��������͂��Ă�������");
			Scanner scan = new Scanner(System.in);
			String txt_E = scan.next();
			File file = new File(txt_E + ".txt");
			BufferedWriter bw = new BufferedWriter(new FileWriter(file));
			Readfile readf = new Readfile(txt_E + ".txt");
			String f_edit = null;
			while(!f_edit.equals("EndEdit")){
				for(int i=0; i<readf.num1; i++){
					System.out.println(i+1 + "--" + readf.s_A_L.get(i));
				}
				System.out.println("�ҏW�������s�ԍ�����͂��Ă��������B");
				System.out.println("�ҏW���I���������ꍇ\"EndEdit\"����͂��Ă�������");
				f_edit = scan.next();
				if(f_edit.matches("[0-9]")){
					int line_n = Integer.parseInt(f_edit);
					if(line_n < readf.num1){
					String edit = scan.next();
					readf.s_A_L.set(line_n-1,edit);
					}else{
						System.out.println("���݂���s�ԍ�����͂��Ă�������");
					}
				}else if(f_edit.equals("EndEdit")){
					for(int i=0; i<readf.num1; i++){
						bw.write(readf.s_A_L.get(i));
						bw.newLine();
					}
				}else{
					System.out.println("�s�ԍ���EndEdit����͂��Ă��������B");
				}
			}
			scan.close();
			bw.close();
		}catch(Exception e){
			System.out.println(e);
			System.out.println("���͂��ꂽ�����ɃG���[������܂��B���݂���s�ԍ�����͂��Ă��������B");
			System.out.println("�ҏW�������I�����܂�");
		}
	}

}
