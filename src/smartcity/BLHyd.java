package smartcity;

import java.awt.Color;
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

public class BLHyd extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 398558560400795847L;
	/**
	 * Create the panel.
	 */
	JButton ptv, hotels, b_l, goback,book_hotel;
	JLabel back1;

	public BLHyd() {
		setLayout(null);
		String text = "Name:City Park\nLocation -  5-8-450/1, Chirag Ali Ln, Abids, Hyderabad, Telangana 500001\nPhone - 040 6610 5510\nReview - 3.8";

		setBackground(Color.PINK);
		setBounds(5, 50, 1440, 920);
		back1 = new JLabel("");
		back1.setBounds(0, 0, 1362, 739);
		back1.setVisible(true);
		ptv = new JButton("PLACES TO VISIT");

		ptv.setFont(new Font("Liberation Serif", Font.ITALIC, 15));
		ptv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrameDisplayHyd.frame.remove(FrameDisplayHyd.panel);
				FrameDisplayHyd.frame.setContentPane(new PlacesHyderabad());
				FrameDisplayHyd.frame.setVisible(true);
			}
		});
		ptv.setForeground(Color.BLACK);
		ptv.setBackground(Color.WHITE);
		ptv.setBounds(0, 0, 200, 34);
		back1.add(ptv);
		hotels = new JButton("RESTAURANTS");
		hotels.setForeground(Color.BLACK);
		hotels.setFont(new Font("Dialog", Font.ITALIC, 15));
		hotels.setBackground(Color.WHITE);
		hotels.setBounds(199, 0, 200, 34);
		back1.add(hotels);

		goback = new JButton("BACK");
		goback.setFont(new Font("Tahoma", Font.ITALIC, 20));
		goback.setForeground(Color.WHITE);
		goback.setBackground(Color.BLACK);
		goback.setMargin(new Insets(20, 20, 20, 20));
		goback.setBorderPainted(true);
		goback.setBounds(1150, 5, 250, 35);
		back1.add(goback);
		goback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Hyderabad b = new Hyderabad();
				b.Slideshow_Hybd();
				b.show();
			}
		});
		hotels.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrameDisplayHyd.frame.remove(FrameDisplayHyd.panel);
				FrameDisplayHyd.frame.setContentPane(new HotelsHyd());
				FrameDisplayHyd.frame.setVisible(true);
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
			}
		});
		b_l.setForeground(Color.BLACK);
		b_l.setFont(new Font("Dialog", Font.ITALIC, 15));
		b_l.setBackground(Color.WHITE);
		b_l.setBounds(397, 0, 250, 34);
		back1.add(b_l);
		
		book_hotel = new JButton("Hotel Booking");
		book_hotel.setFont(new Font("Tahoma", Font.ITALIC, 20));
		book_hotel.setForeground(Color.BLACK);
		book_hotel.setBackground(Color.WHITE);
		book_hotel.setMargin(new Insets(20, 20, 20, 20));
		book_hotel.setBorderPainted(true);
		book_hotel.setBounds(850, 5, 270, 35);
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
		add(back1);

		JLabel elanza = new JLabel("");
		elanza.setBounds(100, 110, 250, 150);
		SetImageSize(elanza,
				new ImageIcon("/Users/kanishkamishra/Desktop/SmartCity-Application/SmartCity/img/lodge-citypark.jpg"));
		back1.add(elanza);

		String text2 = "Name:Grand Elite\nLocation: 5-4-790/2, Gowardhan Chambers , Abids, Lane Adj. Metro Foot Wear, Nampally Station Road, Hyderabad, Telangana 500001\nPhone: 040 6590 5510\nReview - 4.2";
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
				"/Users/kanishkamishra/Desktop/SmartCity-Application/SmartCity/img/lodge-grandelite.jpg"));
		back1.add(oberoi);

		String text3 = "Name: Oakwood Residence\nLocation: Survey No. 115/1, Kapil Towers, IT Park, Nanakramguda, Financial District, Gachibowli, Hyderabad, Telangana 500032\nPhone: 040 6635 9999\nReview: 4.2";
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
				"/Users/kanishkamishra/Desktop/SmartCity-Application/SmartCity/img/lodge-oakwoodresidence.jpg"));

		back1.add(ro);

		String text4 = "Name: Lotus Grand\nLocation: Survey No. 115/1, Kapil Towers, IT Park, Nanakramguda, Financial District, Gachibowli, Hyderabad, Telangana 500032\nPhone:080 5522 6100\nReviews : 4.5 stars";
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
				"/Users/kanishkamishra/Desktop/SmartCity-Application/SmartCity/img/lodge-lotusgrand.jpg"));

		back1.add(ts);

		JLabel ll = new JLabel("");
		ll.setBounds(100, 550, 200, 150);
		SetImageSize(ll,
				new ImageIcon("/Users/kanishkamishra/Desktop/SmartCity-Application/SmartCity/img/lodge-redfox.jpg"));
		back1.add(ll);

		String text6 = "Name: Red Fox\nLocation: Plot No. 2, Survey No. 64, Hitech City, Madhapur, Hyderabad, Telangana 500081\nPhone: 080 2521 9934\nReviews : 4.7 stars";
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
				"/Users/kanishkamishra/Desktop/SmartCity-Application/SmartCity/img/lodge-thegolkonda.jpg"));
		back1.add(jw);

		String text7 = " Name: The Golkonda\nLocation: 10-1-124, Opp. Jntu, Masab Tank, Banjara Hills, Hyderabad, Telangana 500028\nPhone: 080671 83399\nReviews : 4.5 stars";
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
