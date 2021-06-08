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

public class HotelsChennai extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -71233330584089009L;
	/**
	 * Create the panel.
	 */
	JButton ptv, hotels, b_l, goback, book_table;
	JLabel back1;

	public HotelsChennai() {
		setLayout(null);
		String text = "Barbeque Nation\nName: Barbeque nation\nAddress: Ground Floor, Shri Devi Park Hotel, No.1,, Hanumantha Rd, T Nagar, Chennai, Tamil Nadu 600017\nPhone:044 6060 0000\nReviews: 4.4 stars";

		setBackground(Color.BLUE);

		back1 = new JLabel("");
		back1.setBounds(5, 50, 1440, 920);
		back1.setVisible(true);
		ptv = new JButton("PLACES TO VISIT");

		ptv.setFont(new Font("Dialog", Font.BOLD, 15));
		ptv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrameDisplayChennai.frame.remove(FrameDisplayChennai.panel);
				FrameDisplayChennai.frame.setContentPane(new PlacesChennai());
				FrameDisplayChennai.frame.setVisible(true);
			}
		});
		ptv.setForeground(Color.BLACK);
		ptv.setBackground(Color.CYAN);
		ptv.setBounds(0, 0, 200, 34);
		back1.add(ptv);

		hotels = new JButton("RESTAURANTS");
		hotels.setForeground(Color.BLACK);
		hotels.setFont(new Font("Dialog", Font.BOLD, 15));
		hotels.setBackground(Color.PINK);
		hotels.setBounds(200, 0, 200, 34);
		back1.add(hotels);

		goback = new JButton("BACK");
		goback.setFont(new Font("Dialog", Font.BOLD, 15));
		goback.setForeground(Color.BLACK);
		goback.setBackground(Color.CYAN);
		goback.setBounds(1150, 0, 200, 34);
		back1.add(goback);
		goback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Chennai b = new Chennai();
				b.Slideshow_Chen();
				b.show();
			}
		});

		b_l = new JButton("HOTELS");
		b_l.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrameDisplayChennai.frame.remove(FrameDisplayChennai.panel);
				FrameDisplayChennai.frame.setContentPane(new BLChennai());
				FrameDisplayChennai.frame.setVisible(true);
			}
		});
		b_l.setForeground(Color.BLACK);
		b_l.setFont(new Font("Dialog", Font.BOLD, 15));
		b_l.setBackground(Color.CYAN);
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
				new ImageIcon("/Users/kanishkamishra/Desktop/SmartCity-Application/SmartCity/img/barbequenation.jpg"));

		back1.add(sherton);
		String text2 = "Faruuzi\nName:Faruuzi\nAddress: 407/7, Chennai Theni Hwy, Chromepet, Chennai, Tamil Nadu 600044\nPhone:044 4304 2644\nReviews: 4.2";

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
				new ImageIcon("/Users/kanishkamishra/Desktop/SmartCity-Application/SmartCity/img/faruuzi.jpg"));
		back1.add(chinatown);

		String text3 = "The Flying Elephant\nName: The Flying Elephant\nFood: Veg and Non veg\nAddress: PARK HYATT CHENNAI, 39, Velachery Main Road, Guindy, Raj Bhavan, Chennai, Tamil Nadu 600032\nPhone:044 7177 1655\nReviews: 3.9";
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
		SetImageSize(bb, new ImageIcon(
				"/Users/kanishkamishra/Desktop/SmartCity-Application/SmartCity/img/theflyingelephant.jpg"));
		back1.add(bb);

		String text4 = "Daalchini\nName:Daalchini\nFood : Vegetarian\nAddress: No. Near New Saravana Store, 130, Chennai Theni Hwy, Guindy Industrial Estate, Chakrapani Colony, Chromepet, Chennai, Tamil Nadu 600044\nPhone:074010 22232\nReviews: 3.6 stars";
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
				new ImageIcon("/Users/kanishkamishra/Desktop/SmartCity-Application/SmartCity/img/daalchini.jpg"));

		back1.add(np);

		JLabel ss = new JLabel("");
		ss.setBounds(100, 500, 200, 150);
		SetImageSize(ss, new ImageIcon("/Users/kanishkamishra/Desktop/SmartCity-Application/SmartCity/img/alreef.jpg"));
		back1.add(ss);

		String text6 = "Alreef\nName: Alreef\nFood: Indian\nAddress: 703, Mosque Building, Pallavaram 200 Feet Road, Near Chennai 1 EIFFEL Tower, Okkiyam Thuraipakkam, Chennai, Tamil Nadu 600100\nPhone:044 2978 0567\nReviews: 3.6 stars";
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
				new ImageIcon("/Users/kanishkamishra/Desktop/SmartCity-Application/SmartCity/img/benjarong.jpg"));
		back1.add(bhagini);

		String text7 = "Benjarong\nName: Benjarong\nAddress: 146, TT Krishnamachari Road, Alwarpet, Chennai, Tamil Nadu 600018\nPhone:044 2432 2640\nReviews:4.2 stars";
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
