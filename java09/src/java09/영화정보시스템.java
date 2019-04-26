package java09;
//이미지파일은 반드시 프로젝트 바로아래 위치

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.io.File;
import java.sql.PreparedStatement;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 영화정보시스템 {

	public static void main(String[] args) {
		String[] movies = {"m1.png","m2.png","m3.png","m4.png","m5.png"};
		
		//자바는 필요한 부분의 부품을 복사, 조립해서 코딩하는 방식을 가진다.
		//부품(객체, 대상)
		//객체지향형 프로그램 > OOP
		
//		Color.red : static (정적)
//		new button : instance (카피해서 사용)
		
		JFrame f = new JFrame();
		f.setTitle("나의 영화 정보 시스템");
		f.setSize(255, 579);
		f.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		//순서대로 붙여주는 클래스
		
		JButton img = new JButton();
		f.getContentPane().add(img);
		
		ImageIcon icon = new ImageIcon("m1.png");
//		URL url = new URL("www.naver.com");
//		File file = new File("D:\\JKI\\JAVA_src");
//		SQL sql = new SQL("select*from member");
//		>> 객채화를 해주어야 String을 의미있게 인식한다.
		
		img.setIcon(icon);
		
		JButton b1 = new JButton("<<<생일>>>");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon(movies[0]);
				img.setIcon(icon);
			}
		});
		b1.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		f.getContentPane().add(b1);
		
		JButton b2 = new JButton("<<<헬보이>>>");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon(movies[1]);
				img.setIcon(icon);
			}
		});
		b2.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		f.getContentPane().add(b2);
		
		JButton b3 = new JButton("<돈(money)>");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon(movies[2]);
				img.setIcon(icon);
			}
		});
		b3.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		f.getContentPane().add(b3);
		
		JButton b4 = new JButton("<<파이브피트>>");
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon(movies[3]);
				img.setIcon(icon);
			}
		});
		b4.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		f.getContentPane().add(b4);
		
		JButton b5 = new JButton("<<<어스>>>");
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon(movies[4]);
				img.setIcon(icon);
			}
		});
		b5.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		f.getContentPane().add(b5);
		
		f.setVisible(true);
	}

}
