package smartcity;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class HotelsMang extends JPanel {

	private static final long serialVersionUID = 4305729762566118253L;
	/**
	 * Create the panel.
	 */
	JButton ptv, hotels, b_l, goback, book_table;
	JLabel back1;

	public HotelsMang() {
		setLayout(null);
		String text = "Chefs\nAddress: Surathkal, Opp Surathkal Post Office, Mangalore, Karnataka 575019\nPhone:0824 247 7606\nReviews:4 stars";
		setBackground(Color.BLUE);
		back1 = new JLabel("");
		back1.setBounds(5, 50, 1440, 920);
		back1.setVisible(true);
		ptv = new JButton("PLACES TO VISIT");

		ptv.setFont(new Font("Dialog", Font.BOLD, 15));
		ptv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrameDisplayMangalore.frame.remove(FrameDisplayMangalore.panel);
				FrameDisplayMangalore.frame.setContentPane(new PlacesMangalore());
				FrameDisplayMangalore.frame.setVisible(true);
			}
		});
		ptv.setForeground(Color.BLACK);
		ptv.setBackground(Color.WHITE);
		ptv.setBounds(0, 0, 200, 34);
		back1.add(ptv);

		hotels = new JButton("RESTAURANTS");
		hotels.setForeground(Color.BLACK);
		hotels.setFont(new Font("Dialog", Font.BOLD, 15));
		hotels.setBackground(Color.WHITE);
		hotels.setBounds(199, 0, 200, 34);
		back1.add(hotels);

		goback = new JButton("BACK");
		goback.setFont(new Font("Dialog", Font.BOLD, 15));
		goback.setForeground(Color.BLACK);
		goback.setBackground(Color.WHITE);
		goback.setBounds(1150, 0, 200, 34);
		back1.add(goback);
		goback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Mangalore b = new Mangalore();
				b.Slideshow_Mlore();
				b.show();
			}
		});

		b_l = new JButton("HOTELS");
		b_l.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrameDisplayMangalore.frame.remove(FrameDisplayMangalore.panel);
				FrameDisplayMangalore.frame.setContentPane(new BLMang());
				FrameDisplayMangalore.frame.setVisible(true);
			}
		});
		b_l.setForeground(Color.BLACK);
		b_l.setFont(new Font("Dialog", Font.BOLD, 15));
		b_l.setBackground(Color.WHITE);
		b_l.setBounds(397, 0, 250, 34);
		back1.add(b_l);

		book_table = new JButton("Table Booking");
		book_table.setFont(new Font("Tahoma", Font.ITALIC, 20));
		book_table.setForeground(Color.BLACK);
		book_table.setBackground(Color.WHITE);
		book_table.setMargin(new Insets(20, 20, 20, 20));
		book_table.setBorderPainted(true);
		book_table.setBounds(730, 5, 270, 35);
		back1.add(book_table);
		book_table.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TableBooking tb = new TableBooking();
				tb.show();
			}
		});

		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBackground(Color.WHITE);
		textArea_1.setText(text);
		textArea_1.setLineWrap(true);
		textArea_1.setWrapStyleWord(true);
		textArea_1.setEditable(false);
		textArea_1.setCaretPosition(0);
		JScrollPane scrollPane1 = new JScrollPane(textArea_1, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPane1.setBounds(300, 100, 250, 150);
		back1.add(scrollPane1);
		add(back1);

		JLabel sherton = new JLabel("");
		sherton.setBounds(100, 100, 200, 150);
		SetImageSize(sherton,
				new ImageIcon("/Users/kanishkamishra/Desktop/SmartCity-Application/SmartCity/img/chefs.jpeg"));
		back1.add(sherton);

		String text2 = "Hao Ming\nAddress: Yenepoya Chambers, KMC Mercara Trunk Road, Balmatta, Upper Bendoar, Mangaluru, Karnataka 575001\nPhone:0824 221 8693\nReviews: 4.0 stars";
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setBackground(Color.WHITE);
		textArea_2.setText(text2);
		textArea_2.setLineWrap(true);
		textArea_2.setWrapStyleWord(true);
		textArea_2.setEditable(false);
		textArea_2.setCaretPosition(0);
		JScrollPane scrollPane2 = new JScrollPane(textArea_2, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPane2.setBounds(1000, 100, 250, 150);
		back1.add(scrollPane2);
		JLabel chinatown = new JLabel("");
		chinatown.setBounds(800, 100, 200, 150);
		SetImageSize(chinatown,
				new ImageIcon("/Users/kanishkamishra/Desktop/SmartCity-Application/SmartCity/img/haoming.jpeg"));
		back1.add(chinatown);

		String text3 = "Pallkhi\nAddress: 3rd Floor, Tej Towers, Balmatta Road, Opp. Jyothi Cinema, Mangaluru, Karnataka 575001\nPhone:090190 21553\nReviews:4.2 stars";
		JTextArea textArea_3 = new JTextArea();
		textArea_3.setBackground(Color.WHITE);
		textArea_3.setText(text3);
		textArea_3.setLineWrap(true);
		textArea_3.setWrapStyleWord(true);
		textArea_3.setEditable(false);
		textArea_3.setCaretPosition(0);
		JScrollPane scrollPane3 = new JScrollPane(textArea_3, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPane3.setBounds(300, 300, 250, 150);
		back1.add(scrollPane3);

		JLabel bb = new JLabel("");
		bb.setBounds(100, 300, 200, 150);
		SetImageSize(bb,
				new ImageIcon("/Users/kanishkamishra/Desktop/SmartCity-Application/SmartCity/img/pallkhi.jpg"));
		back1.add(bb);

		String text4 = ".Gajalee\nAddress: Circuit House Compound, Kadri Hills, Mangaluru, Karnataka 575004\nPhone:0824 222 1900\nReviews: 3.7 stars";
		JTextArea textArea_4 = new JTextArea();
		textArea_4.setBackground(Color.WHITE);
		textArea_4.setText(text4);
		textArea_4.setLineWrap(true);
		textArea_4.setWrapStyleWord(true);
		textArea_4.setEditable(false);
		textArea_4.setCaretPosition(0);
		JScrollPane scrollPane4 = new JScrollPane(textArea_4, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPane4.setBounds(1000, 300, 250, 150);
		back1.add(scrollPane4);

		JLabel np = new JLabel("");
		np.setBounds(800, 300, 200, 150);
		SetImageSize(np,
				new ImageIcon("/Users/kanishkamishra/Desktop/SmartCity-Application/SmartCity/img/gajalee.jpeg"));

		back1.add(np);

		JLabel ss = new JLabel("");
		ss.setBounds(100, 500, 200, 150);
		SetImageSize(ss,
				new ImageIcon("/Users/kanishkamishra/Desktop/SmartCity-Application/SmartCity/img/girimanja.jpeg"));
		back1.add(ss);

		String text6 = "Girimanja's\nAddress: Near Kalikamba Temple, Gopalkrishna Temple Road & Car St, Mangaluru, Karnataka 575001\nPhone:099000 00080\nReviews:4.8 stars";
		JTextArea textArea_6 = new JTextArea();
		textArea_6.setBackground(Color.WHITE);
		textArea_6.setText(text6);
		textArea_6.setLineWrap(true);
		textArea_6.setWrapStyleWord(true);
		textArea_6.setEditable(false);
		textArea_6.setCaretPosition(0);
		JScrollPane scrollPane6 = new JScrollPane(textArea_6, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPane6.setBounds(300, 500, 250, 150);
		back1.add(scrollPane6);

		JLabel bhagini = new JLabel("");
		bhagini.setBounds(800, 500, 200, 150);
		SetImageSize(bhagini,
				new ImageIcon("/Users/kanishkamishra/Desktop/SmartCity-Application/SmartCity/img/village.jpeg"));
		back1.add(bhagini);

		String text7 = "Village Restaurant\nAddress: Airport Rd, Yeyyadi, Mangaluru, Karnataka 575008\nPhone:0824 221 4158\nReviews:4.5 stars";
		JTextArea textArea_7 = new JTextArea();
		textArea_7.setBackground(Color.WHITE);
		textArea_7.setText(text7);
		textArea_7.setLineWrap(true);
		textArea_7.setWrapStyleWord(true);
		textArea_7.setEditable(false);
		textArea_7.setCaretPosition(0);
		JScrollPane scrollPane7 = new JScrollPane(textArea_7, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPane7.setBounds(1000, 500, 250, 150);
		back1.add(scrollPane7);

	}

	public void SetImageSize(JLabel label, ImageIcon im) {
		ImageIcon icon = im;
		Image img = icon.getImage();
		Image newImg = img.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon newImc = new ImageIcon(newImg);
		label.setIcon(newImc);

	}

}
