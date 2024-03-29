package smartcity;

import java.awt.Color;
//import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class HotelsBlore extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4467298194817435546L;
	/**
	 * Create the panel.
	 */
	JButton ptv, hotels, b_l, goback, book_table;
	JLabel back1;

	public HotelsBlore() {
		setLayout(null);
		String text = "Sheraton\nName: Sheraton\nFood type: vegetarian and non-vegetarian.\nBranches : Rajajinagar\nReviews : 5 stars";
		setBackground(Color.LIGHT_GRAY);
		setBounds(5, 50, 1440, 920);
		back1 = new JLabel("");
		back1.setBounds(0, 0, 1362, 739);
		back1.setVisible(true);
		
		ptv = new JButton("PLACES TO VISIT");

		ptv.setFont(new Font("Dialog", Font.BOLD, 15));
		ptv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrameDisplayTest.frame.remove(FrameDisplayChennai.panel);
				FrameDisplayTest.frame.setContentPane(new PlacesBLore());
				FrameDisplayTest.frame.setVisible(true);
			}
		});
		ptv.setForeground(Color.BLACK);
		ptv.setBackground(Color.CYAN);
		ptv.setBounds(0, 5, 250, 34);
		back1.add(ptv);
		
		hotels = new JButton("RESTAURANTS");
		hotels.setForeground(Color.BLACK);
		hotels.setFont(new Font("Dialog", Font.BOLD, 15));
		hotels.setBackground(Color.WHITE);
		hotels.setBounds(265, 5, 250, 35);
		back1.add(hotels);
		hotels.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrameDisplayTest.frame.remove(FrameDisplayTest.panel);
				FrameDisplayTest.frame.setContentPane(new HotelsBlore());
				FrameDisplayTest.frame.setVisible(true);
			}
		});
		hotels.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

			}
		});

		b_l = new JButton("HOTELS");
		b_l.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrameDisplayTest.frame.remove(FrameDisplayTest.panel);
				FrameDisplayTest.frame.setContentPane(new B_LBlore());
				FrameDisplayTest.frame.setVisible(true);
			}
		});
		b_l.setForeground(Color.BLACK);
		b_l.setFont(new Font("Dialog", Font.BOLD, 15));
		b_l.setBackground(Color.WHITE);
		b_l.setBounds(557, 5, 250, 35);
		back1.add(b_l);

		goback = new JButton("BACK");
		goback.setFont(new Font("Tahoma", Font.ITALIC, 20));
		goback.setForeground(Color.BLACK);
		goback.setBackground(Color.WHITE);
		goback.setMargin(new Insets(20, 20, 20, 20));
		goback.setBorderPainted(true);
		goback.setBounds(1150, 5, 250, 35);
		back1.add(goback);
		goback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Bangalore b = new Bangalore();
				b.Slideshow();
				b.show();
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
		scrollPane1.setBounds(300, 110, 250, 150);
		back1.add(scrollPane1);
		add(back1);

		JLabel sherton = new JLabel("");
		sherton.setBounds(100, 110, 200, 150);
		SetImageSize(sherton, new ImageIcon(
				"/Users/kanishkamishra/Desktop/SmartCity-Application/SmartCity/img/Bangalore/hotel1-sherton.jpg"));

		back1.add(sherton);

		String text2 = " 37 China Town\nName: China TownFood \nType: Chinese veg and non-veg\nLocation :  37, Crescent Road, Near Race Course, Opp Mallige Hospital, High Grounds, Bengaluru, Karnataka 560001\nPhone: 080 4037 3737\nReviews : 3.4 stars ";
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setBackground(Color.WHITE);
		textArea_2.setText(text2);
		textArea_2.setLineWrap(true);
		textArea_2.setWrapStyleWord(true);
		textArea_2.setEditable(false);
		textArea_2.setCaretPosition(0);
		JScrollPane scrollPane2 = new JScrollPane(textArea_2, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPane2.setBounds(1000, 110, 250, 150);
		back1.add(scrollPane2);

		JLabel chinatown = new JLabel("");
		chinatown.setBounds(800, 110, 250, 150);
		SetImageSize(chinatown, new ImageIcon(
				"/Users/kanishkamishra/Desktop/SmartCity-Application/SmartCity/img/Bangalore/hotel2-37chinatown.jpg"));

		back1.add(chinatown);

		String text3 = "Beijing bites\nName: Beijing Bites\nFood type: Chinese, vegetarian and non-vegetarian.\nBranches : Bannerghatta main road, Frazer town, Sahakarnagar, Sajjapur main road, Begur Hobli, Kammanahalli.\nReviews : 3.5 stars";
		JTextArea textArea_3 = new JTextArea();
		textArea_3.setBackground(Color.WHITE);
		textArea_3.setText(text3);
		textArea_3.setLineWrap(true);
		textArea_3.setWrapStyleWord(true);
		textArea_3.setEditable(false);
		textArea_3.setCaretPosition(0);
		JScrollPane scrollPane3 = new JScrollPane(textArea_3, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPane3.setBounds(300, 330, 250, 150);
		back1.add(scrollPane3);

		JLabel bb = new JLabel("");
		bb.setBounds(100, 330, 250, 150);
		SetImageSize(bb, new ImageIcon(
				"/Users/kanishkamishra/git/SmartCity-Application/SmartCity/img/Bangalore/hotel3-Beijingbites.jpg"));
		back1.add(bb);

		String text4 = " Nandini Palace\nName: Nandini Palace\nFood type: vegetarian and non-vegetarian.\nBranches : St Marks road, Bannerghatta main road\nReviews : 3.0 star";
		JTextArea textArea_4 = new JTextArea();
		textArea_4.setBackground(Color.WHITE);
		textArea_4.setText(text4);
		textArea_4.setLineWrap(true);
		textArea_4.setWrapStyleWord(true);
		textArea_4.setEditable(false);
		textArea_4.setCaretPosition(0);
		JScrollPane scrollPane4 = new JScrollPane(textArea_4, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPane4.setBounds(1000, 330, 250, 150);
		back1.add(scrollPane4);

		JLabel np = new JLabel("");
		np.setBounds(800, 330, 200, 150);
		SetImageSize(np, new ImageIcon(
				"/Users/kanishkamishra/Desktop/SmartCity-Application/SmartCity/img/Bangalore/hotel4-nandinipalace.jpg"));

		back1.add(np);

		JLabel ss = new JLabel("");
		ss.setBounds(100, 550, 200, 150);
		SetImageSize(ss, new ImageIcon(
				"/Users/kanishkamishra/git/SmartCity-Application/SmartCity/img/Bangalore/hotel4-shantisagar.jpg"));
		back1.add(ss);

		String text6 = " Shanti Sagar\nName: Shanti Sagar\nFood type: vegetarian\nBranches : Airport road, Rajajingar, Hoysala road, Sahakarnagar\nReviews : 3.5 stars";
		JTextArea textArea_6 = new JTextArea();
		textArea_6.setBackground(Color.WHITE);
		textArea_6.setText(text6);
		textArea_6.setLineWrap(true);
		textArea_6.setWrapStyleWord(true);
		textArea_6.setEditable(false);
		textArea_6.setCaretPosition(0);
		JScrollPane scrollPane6 = new JScrollPane(textArea_6, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPane6.setBounds(300, 550, 250, 150);
		back1.add(scrollPane6);

		JLabel bhagini = new JLabel("");
		bhagini.setBounds(800, 550, 200, 150);
		SetImageSize(bhagini, new ImageIcon(
				"/Users/kanishkamishra/git/SmartCity-Application/SmartCity/img/Bangalore/hotel6-bhagini.jpg"));

		back1.add(bhagini);

		String text7 = " Bhagini\nName: Bhagini\nFood type: vegetarian and non-vegetarian.\nBranches : Domlur, Chandra Layout, Mahadevapura, Marathalli\nReviews : 3.0 stars";
		JTextArea textArea_7 = new JTextArea();
		textArea_7.setBackground(Color.WHITE);
		textArea_7.setText(text7);
		textArea_7.setLineWrap(true);
		textArea_7.setWrapStyleWord(true);
		textArea_7.setEditable(false);
		textArea_7.setCaretPosition(0);
		JScrollPane scrollPane7 = new JScrollPane(textArea_7, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPane7.setBounds(1000, 550, 250, 150);
		back1.add(scrollPane7);

		book_table = new JButton("Table Booking");
		book_table.setFont(new Font("Tahoma", Font.ITALIC, 20));
		book_table.setForeground(Color.BLACK);
		book_table.setBackground(Color.WHITE);
		book_table.setMargin(new Insets(20, 20, 20, 20));
		book_table.setBorderPainted(true);
		book_table.setBounds(820, 5, 270, 35);
		back1.add(book_table);
		book_table.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TableBooking tb = new TableBooking();
				tb.show();
			}
		});

	}

	public void SetImageSize(JLabel label, ImageIcon im) {
		ImageIcon icon = im;
		Image img = icon.getImage();
		Image newImg = img.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon newImc = new ImageIcon(newImg);
		label.setIcon(newImc);

	}

}
