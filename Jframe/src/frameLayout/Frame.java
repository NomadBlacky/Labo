package frameLayout;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import net.miginfocom.swing.MigLayout;

class Frame extends JFrame {

	private static final long serialVersionUID = 1L;
	
	private static String[][] data = new String[10][2];
	private static String[] column = {"名前","メッセージ"};
	private static DefaultTableModel model = new DefaultTableModel(data,column);
	private static JTable table = new JTable(model);
	//JTableのパーツ構成
	
	private static JPanel p = new JPanel(new MigLayout(
			"wrap 2",
			"[grow][grow][grow][grow][grow]"));
	//JPanel作成
	
	private static JScrollPane scrollp = new JScrollPane(table);
	//JTableをスクロールバーにセット
	
	public Frame(){
		p.add(new JLabel("名前:"),"RIGHT");
		p.add(new JTextField(""),"span,grow");
		p.add(new JLabel("メッセージ:"),"RIGHT");
		p.add(new JTextField(""),"span,grow");
		p.add(new JButton("送信"),"span,grow");
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

}
