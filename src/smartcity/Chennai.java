package smartcity;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class Chennai extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2419370764189777006L;
	ImageIcon i1 = new ImageIcon(
			"/Users/kanishkamishra/Desktop/SmartCity-Application/SmartCity/img/slide/chennai3.jpg");
	ImageIcon i5 = new ImageIcon(
			"/Users/kanishkamishra/Desktop/SmartCity-Application/SmartCity/img/slide/chennai4.jpg");
	ImageIcon i4 = new ImageIcon(
			"/Users/kanishkamishra/Desktop/SmartCity-Application/SmartCity/img/Bangalore/chennai2.jpg");
	ImageIcon i3 = new ImageIcon("/Users/kanishkamishra/Desktop/SmartCity-Application/SmartCity/img/Chennai/city3.jpg");
	ImageIcon i2 = new ImageIcon("/Users/kanishkamishra/Desktop/bang_flow.jpg");

	String[] list = { "/Users/kanishkamishra/Desktop/SmartCity-Application/SmartCity/img/slide/chennai3.jpg",
			"/Users/kanishkamishra/Desktop/SmartCity-Application/SmartCity/img/slide/chennai4.jpg",
			"/Users/kanishkamishra/Desktop/SmartCity-Application/SmartCity/img/Bangalore/chennai2.jpg",
			"/Users/kanishkamishra/Desktop/SmartCity-Application/SmartCity/img/Chennai/city3.jpg",
			"/Users/kanishkamishra/Desktop/SmartCity-Application/SmartCity/img/church1-st.francis.jpg ",

	};

	private JPanel contentPane;
	static JScrollPane scroll;
	JLabel bslide1, bslide2;
	int x = 0;
	Timer tm;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Chennai frame = new Chennai();
					frame.setVisible(true);
					frame.Slideshow_Chen();
					frame.getContentPane().add(scroll);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	JLabel back;
	public Chennai() {
		Slideshow_Chen();
		setTitle("Home Page");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(5, 50, 1440, 920);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		setBackground(Color.BLACK);
		setBounds(5, 50, 1440, 920);

		back = new JLabel("");
		back.setBounds(0, 0, 1500, 750);
		contentPane.add(back);

		JLabel title = new JLabel("CHENNAI");
		getContentPane().setBackground(Color.PINK);
		back.add(title);
		title.setFont(new Font("Tahoma", Font.BOLD, 30));
		title.setForeground(Color.BLUE);
		title.setBounds(580, 20, 300, 40);

		bslide1 = new JLabel("");
		back.add(bslide1);
		bslide1.setBounds(0, 140, 840, 500);

		bslide2 = new JLabel("");
		bslide2.setBounds(840, 140, 840, 500);
		back.add(bslide2);

		JButton Tourism = new JButton("Tourism");
		back.add(Tourism);
		Tourism.setBackground(Color.WHITE);
		Tourism.setForeground(Color.BLACK);
		Tourism.setFont(new Font("Tahoma", Font.BOLD, 20));
		Tourism.setBounds(954, 30, 110, 33);

		JButton Education = new JButton("Education");
		back.add(Education);
		Education.setBackground(Color.WHITE);
		Education.setForeground(Color.BLACK);
		Education.setFont(new Font("Tahoma", Font.BOLD, 20));
		Education.setBounds(1140, 30, 110, 33);
		JButton General = new JButton("BACK");
		back.add(General);
		General.setBackground(Color.WHITE);
		General.setFont(new Font("Dialog", Font.BOLD, 20));
		General.setBounds(1313, 30, 110, 33);

		General.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				City c = new City();
				c.show();
			}
		});

		Education.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				EducationChennai t = new EducationChennai();
				t.show();
			}
		});
		Education.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		Tourism.addMouseListener(new MouseAdapter() {
			@SuppressWarnings("deprecation")
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				FrameDisplayChennai t = new FrameDisplayChennai();
			}
		});
		Tourism.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});

		JButton Hospitals = new JButton("Hospitals");
		back.add(Hospitals);
		Hospitals.setBackground(Color.WHITE);
		Hospitals.setFont(new Font("Dialog", Font.BOLD, 20));
		Hospitals.setBounds(1140, 95, 110, 33);

		Hospitals.addMouseListener(new MouseAdapter() {
			@SuppressWarnings("deprecation")
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				Hospital_Chennai hb = new Hospital_Chennai();
				hb.show();

			}
		});
		Hospitals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				Hospital_Chennai hb = new Hospital_Chennai();

				hb.show();
			}
		});

		bslide1.setVisible(true);
		bslide2.setVisible(true);
	}

	public void SetImageSize(JLabel label, ImageIcon im) {
		ImageIcon icon = im;
		Image img = icon.getImage();
		Image newImg = img.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon newImc = new ImageIcon(newImg);
		label.setIcon(newImc);

	}

	public void Slideshow_Chen() {
		new Thread() {
			int count = 0;

			@Override
			public void run() {
				try {
					while (true) {
						switch (count) {
						case 0:
							bslide1.setVisible(true);
							Thread.sleep(1000);
							bslide1.setBounds(7, 140, 770, 550);
							SetImageSize(bslide1, i1);
							bslide2.setBounds(770, 140, 660, 550);
							SetImageSize(bslide2, i2);
							count = 1;
							break;
						case 1:
							bslide2.setVisible(true);
							Thread.sleep(2000);
							bslide2.setBounds(770, 140, 660, 550);
							SetImageSize(bslide2, i3);
							bslide1.setBounds(7, 140, 770, 550);
							SetImageSize(bslide1, i4);
							count = 2;
							break;
						case 2:
							bslide1.setVisible(true);
							Thread.sleep(2000);
							bslide1.setBounds(7, 140, 770, 550);
							SetImageSize(bslide1, i5);
							bslide2.setBounds(770, 140, 660, 550);
							SetImageSize(bslide2, i1);
							count = 3;
							break;
						case 3:
							bslide2.setVisible(true);
							Thread.sleep(2000);
							bslide2.setBounds(770, 140, 660, 550);
							SetImageSize(bslide2, i2);
							bslide1.setBounds(7, 140, 770, 550);
							SetImageSize(bslide1, i3);
							count = 4;
							break;
						case 4:
							bslide1.setVisible(true);
							Thread.sleep(2000);
							bslide1.setBounds(7, 140, 770, 550);
							SetImageSize(bslide1, i4);
							bslide2.setBounds(770, 140, 660, 550);
							SetImageSize(bslide2, i5);
							count = 0;
							break;
						}
					}

				} catch (Exception e) {

				}
			}
		}.start();
	}
}
