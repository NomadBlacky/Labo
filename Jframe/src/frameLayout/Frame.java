package frameLayout;

import javax.swing.JFrame;
import net.miginfocom.swing.MigLayout;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;

class Frame extends JFrame {

	private static final long serialVersionUID = 1L;
	
	private static String[][] data = new String[10][2];
	static String[] column = {"名前","メッセージ"};
	static DefaultTableModel model = new DefaultTableModel(data,column);
	static JTable table = new JTable(model);//JTableのインスタンス作成
	
	static JPanel p = new JPanel(new MigLayout(//JPanelインスタンス作成
			"wrap 2",
			"[grow][grow][grow][grow][grow]"));
	
	
	public Frame(){//パネルコンポーネント配置
		p.add(new JLabel("名前:"),"RIGHT");
		p.add(new JTextField(""),"span,grow");
		p.add(new JLabel("メッセージ:"),"RIGHT");
		p.add(new JTextField(""),"span,grow");
		p.add(new JButton("送信"),"span,grow");
		p.add(table,"span,grow");
	}
	public static Frame mainFrame() {//フレーム作成　完成したフレームを戻り値に
		Frame f = new Frame();
		f.setTitle("MigLayoutTest");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(360,240);
		f.setLocationRelativeTo(null);
		return f;
	}
	public static void main(String[] args) {
		Frame f = mainFrame();
		f.add(p);//初期化したパネルをフレームに配置
		f.setVisible(true);

	}

}
