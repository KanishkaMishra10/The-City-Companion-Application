package smartcity;

import java.awt.Color;
//import java.awt.EventQueue;
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

public class HotelsMumbai extends JPanel {

	private static final long serialVersionUID = 1885661431264087281L;
	/**
	 * Create the panel.
	 */
	JButton ptv, hotels, b_l, goback, book_table;
	JLabel back1;

	public HotelsMumbai() {
		setLayout(null);
		String text = "Mia Cucina\nName: Mia Cucina\nFood type: Italian.\nBranches : Powai and Bandra\nReviews : 5 stars";
		setBackground(Color.PINK);
		setBounds(5, 50, 1440, 920);
		back1 = new JLabel("");
		back1.setBounds(0, 0, 1362, 739);
		back1.setVisible(true);

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
		scrollPane1.setBounds(300, 110, 250, 150);
		back1.add(scrollPane1);
		add(back1);

		JLabel sherton = new JLabel("");
		sherton.setBounds(100, 110, 200, 150);
		SetImageSize(sherton, new ImageIcon("/Users/kanishkamishra/Desktop/Hospitals/MiaCucina.png"));
		back1.add(sherton);

		String text2 = "The Table\nName: The Table\nFood Type: Global Cuisine\nLocation :  Colaba, Mumbai\nReviews : 4.8 stars ";
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
		SetImageSize(chinatown, new ImageIcon("/Users/kanishkamishra/Desktop/Hospitals/TheTable.jpg"));
		back1.add(chinatown);

		String text3 = "Masala Library\nName: Masala Library\nFood type: Indian Cuisine.\nBranches : Bandra East, Mumbai\nReviews : 4.5 stars";
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
		SetImageSize(bb, new ImageIcon("/Users/kanishkamishra/Desktop/Hospitals/MasalaLibrary.jpg"));
		back1.add(bb);

		String text4 = "Global Fusion\nName: Global Fusion\nFood type: Asian.\nBranches : Worli, Mumbai\nReviews : 4.6 star";
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
		SetImageSize(np, new ImageIcon("/Users/kanishkamishra/Desktop/Hospitals/GlobalFusion.jpg"));

		back1.add(np);

		JLabel ss = new JLabel("");
		ss.setBounds(100, 550, 200, 150);
		SetImageSize(ss, new ImageIcon("/Users/kanishkamishra/Desktop/Hospitals/IndigoDeli.jpg"));
		back1.add(ss);

		String text6 = " Indigo Deli\nName: Indigo Deli\nFood type: Western and European\nBranches : Juhu, Mumbai\nReviews : 4.5 stars";
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
		SetImageSize(bhagini, new ImageIcon("/Users/kanishkamishra/Desktop/Hospitals/WasabiByMorimoto.jpg"));
		back1.add(bhagini);

		String text7 = "Wasabi By Morimoto\nName:Wasabi By Morimoto\nFood type:  Japanese cuisine\nBranches : Colaba, Mumbai\nReviews : 4.8 stars";
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
