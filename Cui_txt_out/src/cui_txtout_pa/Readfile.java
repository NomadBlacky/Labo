package cui_txtout_pa;

import java.io.*;
import java.util.*;

public class Readfile {
	String str;
	List<String> s_A_L = new ArrayList<String>();
	int num1 = 0;
	public Readfile(String f) {
		try{
			File file = new File(f);
			BufferedReader br = new BufferedReader(new FileReader(file));
			
			while((str = br.readLine()) != null){
				s_A_L.add(str);
				num1 = num1 + 1;
			}
			br.close();
		}catch(FileNotFoundException e1){
			System.out.println("指定されたファイルが見つかりません。");
		}catch(IOException e2){
			System.out.println("入出力エラーです。");
		}
	}

}
