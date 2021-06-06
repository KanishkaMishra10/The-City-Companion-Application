package smartcity;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Hospital_Chennai extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9117588726336345181L;
	private JPanel contentPane;
	JLabel back;
	JButton goback;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Hospital_Chennai frame = new Hospital_Chennai();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Hospital_Chennai() {

		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(5, 50, 1440, 920);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		contentPane.setBackground(Color.ORANGE);
		JLabel title = new JLabel("HOSPITALS");
		contentPane.add(title);
		title.setFont(new Font("Tahoma", Font.BOLD, 40));
		title.setForeground(Color.BLUE);
		title.setBounds(580, 10, 400, 40);

		goback = new JButton("BACK");
		goback.setFont(new Font("Dialog", Font.ITALIC, 22));
		goback.setForeground(Color.BLACK);
		goback.setBackground(Color.WHITE);
		goback.setBounds(1150, 0, 200, 34);
		contentPane.add(goback);
		goback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Chennai b = new Chennai();
				b.Slideshow_Chen();
				b.show();
			}
		});

		JLabel bc = new JLabel("");
		bc.setBounds(60, 171, 550, 150);
		SetImageSize(bc, new ImageIcon("/Users/kanishkamishra/Desktop/Hospitals/kauvery_chen.jpeg"));
		contentPane.add(bc);

		JLabel lblBishopCottonBoys = new JLabel("KAUVERY HOSPITAL");
		lblBishopCottonBoys.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblBishopCottonBoys.setForeground(Color.BLUE);
		lblBishopCottonBoys.setBounds(60, 112, 500, 57);
		contentPane.add(lblBishopCottonBoys);

		JLabel lblIndusInternationalSchool = new JLabel("FORTIS MALAR HOSPITAL");
		lblIndusInternationalSchool.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblIndusInternationalSchool.setForeground(Color.BLUE);
		lblIndusInternationalSchool.setBounds(697, 112, 470, 57);
		contentPane.add(lblIndusInternationalSchool);

		JLabel label_1 = new JLabel("");
		label_1.setBounds(697, 171, 550, 150);
		SetImageSize(label_1, new ImageIcon("//Users/kanishkamishra/Desktop/Hospitals/fortis_chennai.jpeg"));
		contentPane.add(label_1);

		JLabel lblDeeksha = new JLabel("APOLLO HOSPITAL CHENNAI");
		lblDeeksha.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblDeeksha.setForeground(Color.BLUE);
		lblDeeksha.setBounds(60, 408, 400, 57);
		contentPane.add(lblDeeksha);

		JLabel label_4 = new JLabel("");
		label_4.setBounds(60, 486, 550, 180);
		SetImageSize(label_4, new ImageIcon("/Users/kanishkamishra/Desktop/Hospitals/apollo_chen.jpeg"));
		contentPane.add(label_4);

		JLabel lblIisc = new JLabel("KAMAKSHI MEMORIAL HOSPITAL");
		lblIisc.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblIisc.setForeground(Color.BLUE);
		lblIisc.setBounds(690, 408, 520, 57);
		contentPane.add(lblIisc);

		JLabel label_7 = new JLabel("");
		label_7.setBounds(690, 486, 550, 180);
		SetImageSize(label_7, new ImageIcon("/Users/kanishkamishra/Desktop/Hospitals/kamkashi_chen.jpeg"));
		contentPane.add(label_7);

	}

	public void SetImageSize(JLabel label, ImageIcon im) {
		ImageIcon icon = im;
		Image img = icon.getImage();
		Image newImg = img.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon newImc = new ImageIcon(newImg);
		label.setIcon(newImc);

	}
}
