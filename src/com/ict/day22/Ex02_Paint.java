package com.ict.day22;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex02_Paint extends JFrame {
	JPanel jp; // 프로그램 창의 바탕이되는 창
	JButton jb1, jb2, jb3, jb4, jb5, jb6, jb7; // 프로그램의 버튼
	String[] items = {"5","10","15","20","25","30"}; // 목록에 들어갈 표시들
	JComboBox<String> jcom; // 프로그램의 목록 표시 버튼
	int x=-5, y=-5, wh=5; // 좌표와 점의 넓이
	Color color;
	
	// 맴버 내부 클래스
	// ct가 그림판 바탕이 된다.
	CanvasTest ct = new CanvasTest(); 
	public Ex02_Paint() {
		super("미니그림판");
		
		
		// 버튼 지정하기
		jp = new JPanel();
		jb1 = new JButton(" ");
		jb1.setBackground(Color.RED); // 버튼 색깔
		jb2 = new JButton(" ");
		jb2.setBackground(Color.GREEN);
		jb3 = new JButton(" ");
		jb3.setBackground(Color.BLUE);
		jb4 = new JButton(" ");
		jb4.setBackground(Color.CYAN);
		jb5 = new JButton(" ");
		jb5.setBackground(Color.MAGENTA);
		jb6 = new JButton(" ");
		jb6.setBackground(Color.YELLOW);
		
		
		jb7 = new JButton("clear");
		
		// 목록 버튼 만들기
		jcom = new JComboBox<String>(items);
		
		jp.add(jb1);
		jp.add(jb2);
		jp.add(jb3);
		jp.add(jb4);
		jp.add(jb5);
		jp.add(jb6);
		jp.add(jb7);
		jp.add(jcom);
		
		add(jp, BorderLayout.NORTH);
		add(ct, BorderLayout.CENTER);
		
		
		// 화면 크기 구함
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		// 위치를 지정(화면 중간에 창을 보이게 하자)
		// java에서는 (0,0)을 기준으로 x축 오른쪽이 + y축 아래가 +
		setBounds(ds.width/2-300, ds.height/2-300, 600,600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
		
		// Listener란 특정 동작을 감지하고 있는 메서드이다
		// 버튼을 누르면 포인터 색깔이 바뀌는 메서드
		jb1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				color = Color.RED;
			}
		});
		jb2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				color = Color.GREEN;
			}
		});
		jb3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				color = Color.BLUE;
			}
		});
		jb4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				color = Color.CYAN;
			}
		});
		jb5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				color = Color.MAGENTA;
			}
		});
		jb1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				color = Color.YELLOW;
			}
		});
		jb6.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				color = Color.RED;
			}
		});
		// clear메서드
		jb7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ct.removeNotify();
				ct.addNotify();
				// 초기값 지정
				x = -5;
				y= -5;
				wh = 5;
				// 크기 지정
				jcom.setSelectedIndex(0); // items배열에 있는 위치값 사용
			}
		});
		jcom.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == e.SELECTED) {
					switch ((String)e.getItem()) {
					case "5": wh = 5 ; break;
					case "10": wh = 10 ; break;
					case "15": wh = 15 ; break;
					case "20": wh = 20 ; break;
					case "25": wh = 25 ; break;
					case "30": wh = 30 ; break;
					}
				}
			}
		});
		ct.addMouseMotionListener(new MouseAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				x = e.getX();
				y = e.getY();
				ct.repaint();
			}
		});
	}
	
	
	private class CanvasTest extends Canvas{
		@Override
		public void paint(Graphics g) {
			g.setColor(color);
			g.fillOval(x, y, wh, wh);
		}
		@Override
		public void update(Graphics g) {
			paint(g);
		}
	}
	
	public static void main(String[] args) {
		new Ex02_Paint();
	}
}
