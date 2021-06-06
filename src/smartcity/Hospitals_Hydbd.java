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

public class Hospitals_Hydbd extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6087708269472594814L;
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
					Hospitals_Blore frame = new Hospitals_Blore();
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
	public Hospitals_Hydbd() {

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
				Hyderabad b = new Hyderabad();
				b.Slideshow_Hybd();
				b.show();
			}
		});

		JLabel bc = new JLabel("");
		bc.setBounds(60, 171, 550, 150);
		SetImageSize(bc, new ImageIcon("/Users/kanishkamishra/Desktop/Hospitals/apollo_hyd.jpeg"));
		contentPane.add(bc);

		JLabel lblBishopCottonBoys = new JLabel("APOLLO HOSPITALS");
		lblBishopCottonBoys.setFont(new Font("Tahoma", Font.ITALIC, 22));
		lblBishopCottonBoys.setForeground(Color.BLUE);
		lblBishopCottonBoys.setBounds(60, 112, 270, 57);
		contentPane.add(lblBishopCottonBoys);

		JLabel lblIndusInternationalSchool = new JLabel("ASIAN INSTITUE OF NEPHROLOGY AND UROLOGY");
		lblIndusInternationalSchool.setFont(new Font("Tahoma", Font.ITALIC, 22));
		lblIndusInternationalSchool.setForeground(Color.BLUE);
		lblIndusInternationalSchool.setBounds(806, 112, 670, 57);
		contentPane.add(lblIndusInternationalSchool);

		JLabel label_1 = new JLabel("");
		label_1.setBounds(806, 171, 550, 150);
		SetImageSize(label_1, new ImageIcon("/Users/kanishkamishra/Desktop/Hospitals/asia_hyd.jpeg"));
		contentPane.add(label_1);

		JLabel lblDeeksha = new JLabel("BASAVATARAKAM CANCER HOSPITAL AND RESEARCH INSTITUTE");
		lblDeeksha.setFont(new Font("Tahoma", Font.ITALIC, 22));
		lblDeeksha.setForeground(Color.BLACK);
		lblDeeksha.setBounds(60, 408, 820, 57);
		contentPane.add(lblDeeksha);

		JLabel label_4 = new JLabel("");
		label_4.setBounds(60, 486, 550, 180);
		SetImageSize(label_4, new ImageIcon("/Users/kanishkamishra/Desktop/Hospitals/basa_hyd.jpeg"));
		contentPane.add(label_4);

		JLabel lblIisc = new JLabel("AWARE GLOBAL HOSPITALS");
		lblIisc.setFont(new Font("Tahoma", Font.ITALIC, 22));
		lblIisc.setForeground(Color.BLACK);
		lblIisc.setBounds(806, 408, 320, 57);
		contentPane.add(lblIisc);

		JLabel label_3 = new JLabel("");
		label_3.setBounds(806, 486, 550, 180);
		SetImageSize(label_3, new ImageIcon("/Users/kanishkamishra/Desktop/Hospitals/aware_hyd.jpeg"));
		contentPane.add(label_3);

	}

	public void SetImageSize(JLabel label, ImageIcon im) {
		ImageIcon icon = im;
		Image img = icon.getImage();
		Image newImg = img.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon newImc = new ImageIcon(newImg);
		label.setIcon(newImc);

	}
}