package frameLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import net.miginfocom.swing.MigLayout;

class Frame extends JFrame implements ActionListener{

	private static final long serialVersionUID = 2L;
	
	private static String[][] data = new String[10][2];
	private static String[] column = {"名前","メッセージ"};
	private static DefaultTableModel model = new DefaultTableModel(data,column);
	private static JTable table = new JTable(model);
	//JTableのパーツ構成
	
	private static JButton Button1 = new JButton("送信");
	private static JTextField txt1 = new JTextField("");
	private static JTextField txt2 = new JTextField("");
	//ボタン、テキストフィールドの作成
	
	private static JPanel p = new JPanel(new MigLayout(
			"wrap 2",
			"[grow][grow][grow][grow][grow]"));
	//JPanel作成
	
	private static JScrollPane scrollp = new JScrollPane(table);
	//JTableをスクロールバーにセット
	
	public Frame(){
		Button1.addActionListener(this);
		p.add(new JLabel("名前:"),"RIGHT");
		p.add(txt1,"span,grow");
		p.add(new JLabel("メッセージ:"),"RIGHT");
		p.add(txt2,"span,grow");
		p.add(Button1,"span,grow");
		p.add(scrollp,"span,grow");
		//JPanelにコンポーネント配置
	}
	public static void main(String[] args) {
		Frame f = new Frame();
		f.setTitle("MigLayoutTest");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(360,240);
		f.setLocationRelativeTo(null);
		//JFrameの設定

		f.add(p);
		//JPanelをJFrameにのっける
		f.setVisible(true);

	}
	public void actionPerformed(ActionEvent x){
		//アクション処理
		model.moveRow(0, 8, 1);
		String[] tempdata = {txt1.getText(),txt2.getText()};
		model.insertRow(0, tempdata);
		model.removeRow(1);
		//1列ずらし、データ挿入→余計なセルの削除
	}

}
