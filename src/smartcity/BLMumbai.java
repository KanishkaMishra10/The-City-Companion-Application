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

public class BLMumbai extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5246383880081130130L;
	/**
	 * Create the panel.
	 */
	JButton ptv, hotels, b_l, goback, book_hotel;
	JLabel back1;

	public BLMumbai() {
		setLayout(null);
		String text = "Name: Grand Hyatt Mumbai Hotel & Residences\nLocation : Grand Hyatt Mumbai Hotel and Residences Bandra Kurla Complex Vicinity, Off, Western Express Hwy, Santacruz East, Mumbai, Maharashtra 400055\nPhone:022 6676 1234\nReviews : 4.5 stars";

		setBackground(Color.PINK);
		setBounds(5, 50, 1440, 920);

		back1 = new JLabel("");
		back1.setBounds(0, 0, 1362, 739);
		back1.setVisible(true);

		add(back1);

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
				Mumbai b = new Mumbai();
				b.Slideshow_Mum();
				b.show();
			}
		});

		book_hotel = new JButton("Hotel Booking");
		book_hotel.setFont(new Font("Tahoma", Font.ITALIC, 20));
		book_hotel.setForeground(Color.BLACK);
		book_hotel.setBackground(Color.WHITE);
		book_hotel.setMargin(new Insets(20, 20, 20, 20));
		book_hotel.setBorderPainted(true);
		book_hotel.setBounds(730, 5, 270, 35);
		back1.add(book_hotel);
		book_hotel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HotelBooking hb = new HotelBooking();
				hb.show();
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

		JLabel elanza = new JLabel("");
		elanza.setBounds(100, 110, 250, 150);
		SetImageSize(elanza, new ImageIcon(
				"/Users/kanishkamishra/Desktop/SmartCity-Application/SmartCity/img/Bangalore/lodging1-elanza.jpg"));
		back1.add(elanza);

		String text2 = " Name: Taj Lands End\nLocation : Band Stand, BJ Road, Mount Mary, Bandra West, Mumbai, Maharashtra 400050\nPhone:022 6668 1234\nReviews : 4.6 stars ";
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
		JLabel oberoi = new JLabel("");
		oberoi.setBounds(800, 110, 200, 150);
		SetImageSize(oberoi, new ImageIcon(
				"/Users/kanishkamishra/Desktop/SmartCity-Application/SmartCity/img/Bangalore/lodging1-oberoi.jpg"));
		back1.add(oberoi);

		String text3 = "Name: Holiday Inn\nLocation :Sakinaka Junction, Andheri - Kurla Rd, Andheri East, Mumbai, Maharashtra 400072\nPhone: 022 4085 1800\nReviews : 4.4 stars";
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

		JLabel ro = new JLabel("");
		ro.setBounds(100, 330, 200, 150);
		SetImageSize(ro, new ImageIcon(
				"/Users/kanishkamishra/Desktop/SmartCity-Application/SmartCity/img/Bangalore/lodging4-royalorchid.jpg"));

		back1.add(ro);

		String text4 = "Name: ITC Maratha, a Luxury Collection Hotel\nLocation :Sahar Airport Rd, near International Airport, Ashok Nagar, Andheri East, Andheri, Maharashtra 400099\nPhone:022 2830 3030\nReviews : 4.7 stars";
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

		JLabel ts = new JLabel("");
		ts.setBounds(800, 330, 200, 150);
		SetImageSize(ts, new ImageIcon(
				"/Users/kanishkamishra/Desktop/SmartCity-Application/SmartCity/img/Bangalore/lodging5-trinitysuites.jpg"));

		back1.add(ts);

		JLabel ll = new JLabel("");
		ll.setBounds(100, 550, 200, 150);
		SetImageSize(ll, new ImageIcon(
				"/Users/kanishkamishra/Desktop/SmartCity-Application/SmartCity/img/Bangalore/lodging3-leelapalace.jpg"));

		back1.add(ll);

		String text6 = "Name: Leela Mumbai\nLocation :Sahar Airport Road, Andheri - Kurla Rd, near Mumbai International Airport, Andheri East, Mumbai, Maharashtra 400059\nPhone:022 6691 1234\nReviews : 4.5 stars";
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

		JLabel jw = new JLabel("");
		jw.setBounds(800, 550, 200, 150);
		SetImageSize(jw, new ImageIcon(
				"/Users/kanishkamishra/Desktop/SmartCity-Application/SmartCity/img/Bangalore/lodging6-JWmarriot.jpg"));
		back1.add(jw);

		String text7 = " Name: JWmarriot\nLocation :Juhu Rd, Juhu Tara, Juhu, Mumbai, Maharashtra 400049\nPhone: 022 6693 3000\nReviews : 4.7 stars";
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
	}

	public void SetImageSize(JLabel label, ImageIcon im) {
		ImageIcon icon = im;
		Image img = icon.getImage();
		Image newImg = img.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon newImc = new ImageIcon(newImg);
		label.setIcon(newImc);

	}

}
