package smartcity;

import java.awt.Color;
import java.awt.EventQueue;
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

public class PlacesHyderabad extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8439846357100738819L;
	JButton ptv, hotels, b_l, goback,book_ticket;
	JLabel back1;

	/**
	 * Create the panel.
	 */
	public PlacesHyderabad() {

		setLayout(null);

		setBackground(Color.PINK);
		setBounds(5, 50, 1440, 920);

		back1 = new JLabel("");
		back1.setEnabled(false);
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
				Hyderabad b = new Hyderabad();
				b.Slideshow_Hybd();
				b.show();
			}
		});
		
		book_ticket = new JButton("Ticket Booking");
		book_ticket.setFont(new Font("Tahoma", Font.ITALIC, 20));
		book_ticket.setForeground(Color.BLACK);
		book_ticket.setBackground(Color.WHITE);
		book_ticket.setMargin(new Insets(20, 20, 20, 20));
		book_ticket.setBorderPainted(true);
		book_ticket.setBounds(730, 5, 270, 35);
		back1.add(book_ticket);
		book_ticket.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TicketBooking tb = new TicketBooking();
				tb.show();
			}
		});


		String text1 = " Birla Mandir is a Hindu temple, built on a 280 feet (85 m) high hillock called Naubath Pahad on a 13 acres (53,000 m2) plot. The construction took 10 years and was constructed in 1976 by Swami Ranganathananda of Ramakrishna Mission. The temple was constructed by Birla Foundation, which has also constructed several similar temples across India, all of which are known as Birla Mandir.";

		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBackground(Color.WHITE);
		textArea_1.setText(text1);
		textArea_1.setLineWrap(true);
		textArea_1.setWrapStyleWord(true);
		textArea_1.setEditable(false);
		textArea_1.setCaretPosition(0);
		JScrollPane scrollPane1 = new JScrollPane(textArea_1, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPane1.setBounds(300, 110, 250, 150);
		back1.add(scrollPane1);

		JLabel lalbagh = new JLabel("");
		lalbagh.setBounds(100, 110, 200, 150);
		SetImageSize(lalbagh, new ImageIcon(
				"/Users/kanishkamishra/Desktop/SmartCity-Application/SmartCity/img/Hyderabad/tourism/birlamandir.jpg"));

		back1.add(lalbagh);

		JLabel title1 = new JLabel("WORSHIP PLACES");
		title1.setFont(new Font("Tahoma", Font.BOLD, 25));
		title1.setBounds(601, 68, 405, 34);
		back1.add(title1);

		JLabel title2 = new JLabel("HISTORIC PLACES");
		title2.setFont(new Font("Tahoma", Font.BOLD, 25));
		title2.setBounds(561, 278, 305, 34);
		back1.add(title2);

		String text2 = "Makkah Masjid, is one of the oldest mosques in Hyderabad, Telangana in India, and it is one of the largest masajids in India. Makkah Masjid is a listed heritage building in the old city of Hyderabad, close to the historic landmarks of Chowmahalla Palace, Laad Bazaar, and Charminar. ";
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

		JLabel cubbonpark = new JLabel("");
		cubbonpark.setBounds(800, 110, 200, 150);
		SetImageSize(cubbonpark, new ImageIcon(
				"/Users/kanishkamishra/Desktop/SmartCity-Application/SmartCity/img/temple-MeccaMasjid.jpg"));

		back1.add(cubbonpark);

		String text3 = "Hussain Sagar is a lake in Hyderabad, Telangana, India, built by Hazrat Hussain Shah Wali in 1562, during the rule of Ibrahim Quli Qutub Shah. It is spread across an area of 5.7 square kilometers and is fed by River Musi. A large monolithic statue of the Gautama Buddha, erected in 1992, stands on an island in the middle of the lake. It also separates Hyderabad from its twin city Secunderabad.The maximum depth of the lake is 32 feet.";
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

		JLabel wonderla = new JLabel("");
		wonderla.setBounds(100, 330, 200, 150);
		SetImageSize(wonderla, new ImageIcon(
				"/Users/kanishkamishra/Desktop/SmartCity-Application/SmartCity/img/Hyderabad/tourism/hussainsagar.jpg"));

		back1.add(wonderla);

		String text4 = "Golconda, also known as Golkonda or Golla konda, is a citadel and fort in Southern India and was the capital of the medieval sultanate of the Qutb Shahi dynasty (c.1518–1687), is situated 11 kilometres (6.8 mi) west of Hyderabad. It is also atehsil of Hyderabad district, Telangana, India. The region is known for the mines that have produced some of the world's most famous gems, including the Koh-i-Noor, the Hope Diamond and the Nassak Diamond.";
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

		JLabel ifc = new JLabel("");
		ifc.setBounds(800, 330, 200, 150);
		SetImageSize(ifc,
				new ImageIcon("/Users/kanishkamishra/Desktop/SmartCity-Application/SmartCity/img/Golcondafort.jpg"));

		back1.add(ifc);

		JLabel title3 = new JLabel("A MUST VISIT");
		title3.setFont(new Font("Tahoma", Font.BOLD, 25));
		title3.setBounds(601, 508, 450, 34);
		back1.add(title3);

		JLabel dg = new JLabel("");
		dg.setBounds(100, 550, 200, 150);
		SetImageSize(dg, new ImageIcon(
				"/Users/kanishkamishra/Desktop/SmartCity-Application/SmartCity/img/SalarjungMuseum.jpeg"));
		back1.add(dg);

		String text6 = " The Salar Jung Museum is an art museum located at Darushifa, on the southern bank of the Musi river in the city of Hyderabad,Telangana, India. It is one of the three National Museums of India.[2] It has a collection of sculptures, paintings, carvings, textiles, manuscripts, ceramics, metallic artefacts, carpets, clocks, and furniture from Japan, China, Burma, Nepal, India, Persia, Egypt,Europe, and North America. The museum's collection was sourced from the property of the Salar Jung family. It is one of the largestmuseums in the country.";
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

		JLabel iskcon = new JLabel("");
		iskcon.setBounds(800, 550, 200, 150);
		SetImageSize(iskcon, new ImageIcon(
				"/Users/kanishkamishra/Desktop/SmartCity-Application/SmartCity/img/Hyderabad/tourism/charminar.jpg"));

		back1.add(iskcon);

		String text7 = "The Charminar, constructed in 1591 CE, is a monument and mosque located in Hyderabad, Telangana, India. The landmark has become a global icon of Hyderabad, listed among the most recognized structures of India.The Charminar is situated on the east bank of Musi river. To the west lies the Laad Bazaar, and to the southwest lies the richly ornamented granite Makkah Masjid. It is listed as an archaeological and architectural treasure on the official prepared by the Archaeological Survey of India under the The Ancient Monuments and Archaeological Sites and Remains Act.";
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

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PlacesHyderabad frame = new PlacesHyderabad();
					frame.setVisible(true);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
