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

public class BLMang extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2719988857902454410L;
	/**
	 * Create the panel.
	 */
	JButton ptv, hotels, b_l, goback, book_hotel;
	JLabel back1;

	public BLMang() {
		setLayout(null);
		String text = "Ginger hotel\nAddress: NH77, Near Infosys, Kottara Chowki Junction, Mangaluru, Karnataka 575006\nPhone:0824 666 3333\nReviews:3.6 stars";

		setBackground(Color.BLUE);
		back1 = new JLabel("");
		back1.setBounds(0, 0, 1362, 739);
		back1.setVisible(true);

		ptv = new JButton("PLACES TO VISIT");

		ptv.setFont(new Font("TimesRoman BOLD", Font.BOLD, 15));
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

		back1.add(goback);
		goback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Mangalore b = new Mangalore();
				b.Slideshow_Mlore();
				b.show();
			}
		});
		hotels.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrameDisplayMangalore.frame.remove(FrameDisplayMangalore.panel);
				FrameDisplayMangalore.frame.setContentPane(new HotelsMang());
				FrameDisplayMangalore.frame.setVisible(true);
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
		b_l.setFont(new Font("Dialog", Font.BOLD, 15));
		b_l.setBackground(Color.CYAN);
		b_l.setBounds(397, 0, 250, 34);
		back1.add(b_l);

		JTextArea textArea_1 = new JTextArea();
		// back1.add(textArea_1);
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

		JLabel elanza = new JLabel("");
		elanza.setBounds(100, 100, 200, 150);
		SetImageSize(elanza,
				new ImageIcon("/Users/kanishkamishra/Desktop/SmartCity-Application/SmartCity/img/gingerhotel.jpg"));
		back1.add(elanza);

		String text2 = "The Saffron\nAddress: GHS Road, Hampankatta, Mangaluru, Karnataka 575001\nPhone:0824 425 5542\nRevies: 3.6 stars";
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
		JLabel oberoi = new JLabel("");
		oberoi.setBounds(800, 100, 200, 150);
		SetImageSize(oberoi,
				new ImageIcon("/Users/kanishkamishra/Desktop/SmartCity-Application/SmartCity/img/saffron.jpg"));
		back1.add(oberoi);

		String text3 = "Hotel Maya International\nAddress: Paramount West Gate, Opposite Mangalore Nursing Home, Balmatta - Kankanady Road, Mangaluru, Karnataka 575002\nPhone:0824 243 5111\nReviews:3.9 stars";
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
		JLabel ro = new JLabel("");
		ro.setBounds(100, 300, 200, 150);
		SetImageSize(ro, new ImageIcon("/Users/kanishkamishra/Desktop/SmartCity-Application/SmartCity/img/maya.jpg"));
		back1.add(ro);

		String text4 = "The Gateway Hotel\nAddress: Old Port Road, Opp. D C Office, Mangaluru, Karnataka 575001\nPhone:0824 666 0420\nReviews:3.9 stars";
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
		JLabel ts = new JLabel("");
		ts.setBounds(800, 300, 200, 150);
		SetImageSize(ts,
				new ImageIcon("/Users/kanishkamishra/Desktop/SmartCity-Application/SmartCity/img/gateway.jpg"));

		back1.add(ts);

		JLabel ll = new JLabel("");
		ll.setBounds(100, 500, 200, 150);
		SetImageSize(ll,
				new ImageIcon("/Users/kanishkamishra/Desktop/SmartCity-Application/SmartCity/img/goldfinch.jpg"));
		back1.add(ll);

		String text6 = "Goldfinch hotels\nAddress: Bunts Hostel Road, Near Jyoti Circle, Mangaluru, Karnataka 575003\nPhone:0824 424 5678\nReviews: 3.7 stars";
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

		JLabel jw = new JLabel("");
		jw.setBounds(800, 500, 200, 150);
		SetImageSize(jw,
				new ImageIcon("/Users/kanishkamishra/Desktop/SmartCity-Application/SmartCity/img/oceanpearl.jpg"));
		back1.add(jw);

		String text7 = "The Ocean Pearl\nAddress: Navabharath Circle, Kodialbail, Mangaluru, Karnataka 575003\nPhone:0824 241 3800\nReviews:4.3 stars";
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
