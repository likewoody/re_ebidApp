package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.Color;

public class MyPage extends JDialog {

	private static final long serialVersionUID = 1L;
	private JButton btnHome;
	private JButton btnMy;
	private JButton btnAlarm;
	private JButton btnChat;
	private JButton btnWrite;
	private JLabel lblMyPurchase;
	private JLabel lblMyLike;
	private JLabel lblMyProduct;
	private JLabel lblNewLabel_1_1_1_1;
	private JLabel lblMyKeyword;
	private JLabel lblMyCutoff;
	private JSeparator separator;
	private JLabel lblUserImage;
	private JLabel lblUserNick;
	private JButton btnEdit;
	private JSeparator separator_1;
	private JSeparator separator_1_1;
	private JSeparator separator_1_1_1;
	private JSeparator separator_1_1_1_1;
	private JSeparator separator_1_1_1_2;
	private JSeparator separator_1_1_1_3;
	private JLabel lblMyBid;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyPage dialog = new MyPage();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public MyPage() {
		setTitle("개인");
		setBackground(SystemColor.window);
		setBounds(100, 100, 430, 732);
		getContentPane().setLayout(null);
		getContentPane().add(getBtnHome());
		getContentPane().add(getBtnMy());
		getContentPane().add(getBtnAlarm());
		getContentPane().add(getBtnChat());
		getContentPane().add(getBtnWrite());
		getContentPane().add(getLblUserImage());
		getContentPane().add(getLblUserNick());
		getContentPane().add(getBtnEdit());
		getContentPane().add(getSeparator_1());
		getContentPane().add(getLblMyProduct());
		getContentPane().add(getSeparator_1_1());
		getContentPane().add(getLblMyPurchase());
		getContentPane().add(getSeparator_1_1_1());
		getContentPane().add(getLblMyLike());
		getContentPane().add(getLblNewLabel_1_1_1_1());
		getContentPane().add(getLblMyCutoff());
		getContentPane().add(getLblMyKeyword());
		getContentPane().add(getSeparator_1_1_1_1());
		getContentPane().add(getSeparator_1_1_1_1_1());
		getContentPane().add(getSeparator_1_1_1_2());
		getContentPane().add(getSeparator_1_1_1_3());
		getContentPane().add(getLblMyBid());

	}
	private JButton getBtnHome() {
		if (btnHome == null) {
			btnHome = new JButton("홈");
			btnHome.setBounds(20, 55, 70, 34);
		}
		return btnHome;
	}
	private JButton getBtnMy() {
		if (btnMy == null) {
			btnMy = new JButton("개인");
			btnMy.setBounds(100, 55, 70, 34);
		}
		return btnMy;
	}
	private JButton getBtnAlarm() {
		if (btnAlarm == null) {
			btnAlarm = new JButton("알림");
			btnAlarm.setBounds(180, 55, 70, 34);
		}
		return btnAlarm;
	}
	private JButton getBtnChat() {
		if (btnChat == null) {
			btnChat = new JButton("채팅");
			btnChat.setBounds(260, 55, 70, 34);
		}
		return btnChat;
	}
	private JButton getBtnWrite() {
		if (btnWrite == null) {
			btnWrite = new JButton("글쓰기");
			btnWrite.setBounds(340, 55, 70, 34);
		}
		return btnWrite;
	}
	private JLabel getLblMyPurchase() {
		if (lblMyPurchase == null) {
			lblMyPurchase = new JLabel("- 나의 구매내역");
			lblMyPurchase.setBounds(20, 370, 400, 16);
		}
		return lblMyPurchase;
	}
	private JLabel getLblMyLike() {
		if (lblMyLike == null) {
			lblMyLike = new JLabel("- 나의 찜목록");
			lblMyLike.setBounds(20, 430, 400, 16);
		}
		return lblMyLike;
	}
	private JLabel getLblMyProduct() {
		if (lblMyProduct == null) {
			lblMyProduct = new JLabel("- 나의 게시글");
			lblMyProduct.setBounds(20, 310, 400, 16);
		}
		return lblMyProduct;
	}
	private JLabel getLblNewLabel_1_1_1_1() {
		if (lblNewLabel_1_1_1_1 == null) {
			lblNewLabel_1_1_1_1 = new JLabel("- 내가 입찰한 상품");
			lblNewLabel_1_1_1_1.setBounds(20, 490, 400, 16);
		}
		return lblNewLabel_1_1_1_1;
	}
	private JLabel getLblMyKeyword() {
		if (lblMyKeyword == null) {
			lblMyKeyword = new JLabel("- 키워드 알림");
			lblMyKeyword.setBounds(20, 610, 400, 16);
		}
		return lblMyKeyword;
	}
	private JLabel getLblMyCutoff() {
		if (lblMyCutoff == null) {
			lblMyCutoff = new JLabel("- 차단 목록");
			lblMyCutoff.setBounds(20, 550, 400, 16);
		}
		return lblMyCutoff;
	}
	private JSeparator getSeparator_1() {
		if (separator == null) {
			separator = new JSeparator();
			separator.setBounds(0, 280, 430, 12);
		}
		return separator;
	}
	private JLabel getLblUserImage() {
		if (lblUserImage == null) {
			lblUserImage = new JLabel("유저 이미지");
			lblUserImage.setBackground(Color.WHITE);
			lblUserImage.setBounds(89, 150, 100, 100);
		}
		return lblUserImage;
	}
	private JLabel getLblUserNick() {
		if (lblUserNick == null) {
			lblUserNick = new JLabel("유저 닉네임");
			lblUserNick.setBounds(211, 174, 61, 16);
		}
		return lblUserNick;
	}
	private JButton getBtnEdit() {
		if (btnEdit == null) {
			btnEdit = new JButton("개인정보 수정");
			btnEdit.setBounds(201, 211, 117, 29);
		}
		return btnEdit;
	}
	private JSeparator getSeparator_1_1() {
		if (separator_1 == null) {
			separator_1 = new JSeparator();
			separator_1.setBounds(0, 340, 430, 12);
		}
		return separator_1;
	}
	private JSeparator getSeparator_1_1_1() {
		if (separator_1_1 == null) {
			separator_1_1 = new JSeparator();
			separator_1_1.setBounds(0, 400, 430, 12);
		}
		return separator_1_1;
	}
	private JSeparator getSeparator_1_1_1_1() {
		if (separator_1_1_1 == null) {
			separator_1_1_1 = new JSeparator();
			separator_1_1_1.setBounds(0, 460, 430, 12);
		}
		return separator_1_1_1;
	}
	private JSeparator getSeparator_1_1_1_1_1() {
		if (separator_1_1_1_1 == null) {
			separator_1_1_1_1 = new JSeparator();
			separator_1_1_1_1.setBounds(0, 520, 430, 12);
		}
		return separator_1_1_1_1;
	}
	private JSeparator getSeparator_1_1_1_2() {
		if (separator_1_1_1_2 == null) {
			separator_1_1_1_2 = new JSeparator();
			separator_1_1_1_2.setBounds(0, 580, 430, 12);
		}
		return separator_1_1_1_2;
	}
	private JSeparator getSeparator_1_1_1_3() {
		if (separator_1_1_1_3 == null) {
			separator_1_1_1_3 = new JSeparator();
			separator_1_1_1_3.setBounds(0, 640, 430, 12);
		}
		return separator_1_1_1_3;
	}
	private JLabel getLblMyBid() {
		if (lblMyBid == null) {
			lblMyBid = new JLabel("");
			lblMyBid.setIcon(new ImageIcon(MyPage.class.getResource("/com/javalec/images/MyPageFrame.png")));
			lblMyBid.setBounds(0, 0, 430, 704);
		}
		return lblMyBid;
	}
}
