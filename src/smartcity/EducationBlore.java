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

public class EducationBlore extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7562772333595099560L;
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
					EducationBlore frame = new EducationBlore();
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
	public EducationBlore() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(5, 50, 1440, 920);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		contentPane.setBackground(Color.LIGHT_GRAY);
		JLabel title = new JLabel("EDUCATION");
		contentPane.add(title);
		title.setFont(new Font("Tahoma", Font.BOLD, 22));
		title.setForeground(Color.YELLOW);
		title.setBounds(10, 10, 200, 40);

		goback = new JButton("BACK");
		goback.setFont(new Font("Dialog", Font.ITALIC, 22));
		goback.setForeground(Color.BLACK);
		goback.setBackground(Color.WHITE);
		goback.setBounds(1150, 0, 200, 34);
		contentPane.add(goback);
		goback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Bangalore b = new Bangalore();
				b.Slideshow();
				b.show();
			}
		});
		JLabel schools = new JLabel("SCHOOLS");
		schools.setFont(new Font("Tahoma", Font.ITALIC, 20));
		contentPane.add(schools);
		schools.setForeground(Color.YELLOW);
		schools.setBounds(20, 61, 200, 60);

		JLabel bc = new JLabel("");
		bc.setBounds(10, 171, 200, 150);
		SetImageSize(bc, new ImageIcon(
				"/Users/kanishkamishra/Desktop/SmartCity-Application/SmartCity/img/Bangalore/edu-bishopscottonboysschool.jpg"));
		contentPane.add(bc);

		JLabel lblBishopCottonBoys = new JLabel("BISHOP COTTON BOY'S SCHOOL");
		lblBishopCottonBoys.setFont(new Font("Tahoma", Font.ITALIC, 17));
		lblBishopCottonBoys.setForeground(Color.YELLOW);
		lblBishopCottonBoys.setBounds(20, 112, 270, 57);
		contentPane.add(lblBishopCottonBoys);

		JLabel lblIndusInternationalSchool = new JLabel("INDUS INTERNATIONAL SCHOOL");
		lblIndusInternationalSchool.setFont(new Font("Tahoma", Font.ITALIC, 17));
		lblIndusInternationalSchool.setForeground(Color.YELLOW);
		lblIndusInternationalSchool.setBounds(337, 112, 270, 57);
		contentPane.add(lblIndusInternationalSchool);

		JLabel label_1 = new JLabel("");
		label_1.setBounds(337, 171, 200, 150);
		SetImageSize(label_1, new ImageIcon(
				"/Users/kanishkamishra/Desktop/SmartCity-Application/SmartCity/img/Bangalore/edu-indusinternationalschool.jpg"));
		contentPane.add(label_1);

		JLabel lblMountCarmelSchool = new JLabel("  MOUNT CARMEL SCHOOL");
		lblMountCarmelSchool.setFont(new Font("Tahoma", Font.ITALIC, 17));
		lblMountCarmelSchool.setForeground(Color.YELLOW);
		lblMountCarmelSchool.setBounds(640, 112, 220, 57);
		contentPane.add(lblMountCarmelSchool);

		JLabel label = new JLabel("");
		label.setBounds(640, 171, 200, 150);
		SetImageSize(label, new ImageIcon(
				"/Users/kanishkamishra/Desktop/SmartCity-Application/SmartCity/img/Bangalore/edu-mountcarmelschool.png"));
		contentPane.add(label);

		JLabel lblSophiasHighSchool = new JLabel("SOPHIAS HIGH SCHOOL");
		lblSophiasHighSchool.setFont(new Font("Tahoma", Font.ITALIC, 17));
		lblSophiasHighSchool.setForeground(Color.YELLOW);
		lblSophiasHighSchool.setBounds(950, 112, 220, 57);
		contentPane.add(lblSophiasHighSchool);

		JLabel label_2 = new JLabel("");
		label_2.setBounds(950, 171, 200, 180);
		SetImageSize(label_2, new ImageIcon(
				"/Users/kanishkamishra/Desktop/SmartCity-Application/SmartCity/img/Bangalore/edu-sophiashighschool.jpg"));
		contentPane.add(label_2);

		JLabel colleges = new JLabel("COLLEGES");
		colleges.setFont(new Font("Tahoma", Font.ITALIC, 20));
		contentPane.add(colleges);
		colleges.setForeground(Color.RED);
		colleges.setBounds(20, 356, 200, 40);

		JLabel lblDeeksha = new JLabel("DEEKSHA COLLEGE");
		lblDeeksha.setFont(new Font("Tahoma", Font.ITALIC, 17));
		lblDeeksha.setForeground(Color.RED);
		lblDeeksha.setBounds(20, 408, 220, 57);
		contentPane.add(lblDeeksha);

		JLabel label_4 = new JLabel("");
		label_4.setBounds(20, 486, 200, 180);
		SetImageSize(label_4, new ImageIcon(
				"/Users/kanishkamishra/Desktop/SmartCity-Application/SmartCity/img/Bangalore/edu-deeksha.png"));
		contentPane.add(label_4);

		JLabel lblJain = new JLabel("JAIN COLLEGE");
		lblJain.setFont(new Font("Tahoma", Font.ITALIC, 17));
		lblJain.setForeground(Color.RED);
		lblJain.setBounds(310, 408, 220, 57);
		contentPane.add(lblJain);

		JLabel label_5 = new JLabel("");
		label_5.setBounds(310, 486, 200, 180);
		SetImageSize(label_5, new ImageIcon(
				"/Users/kanishkamishra/Desktop/SmartCity-Application/SmartCity/img/Bangalore/edu-Jaincollege.png"));
		contentPane.add(label_5);

		JLabel lblUniversities = new JLabel("UNIVERSITIES");
		lblUniversities.setForeground(Color.RED);
		lblUniversities.setFont(new Font("Tahoma", Font.ITALIC, 25));
		lblUniversities.setBounds(608, 356, 200, 40);
		contentPane.add(lblUniversities);

		JLabel lblIisc = new JLabel("INDIAN INSTITUTE OF SCIENCE");
		lblIisc.setFont(new Font("Tahoma", Font.ITALIC, 17));
		lblIisc.setForeground(Color.RED);
		lblIisc.setBounds(608, 408, 320, 57);
		contentPane.add(lblIisc);

		JLabel label_3 = new JLabel("");
		label_3.setBounds(608, 486, 200, 180);
		SetImageSize(label_3, new ImageIcon(
				"/Users/kanishkamishra/Desktop/SmartCity-Application/SmartCity/img/Bangalore/edu-iiscbanguniv.jpg"));
		contentPane.add(label_3);

		JLabel lblInternationalInstituteOf = new JLabel("IIIT ");
		lblInternationalInstituteOf.setFont(new Font("Tahoma", Font.ITALIC, 17));
		lblInternationalInstituteOf.setForeground(Color.RED);
		lblInternationalInstituteOf.setBounds(906, 408, 100, 57);
		contentPane.add(lblInternationalInstituteOf);

		JLabel label_6 = new JLabel("");
		label_6.setBounds(866, 486, 200, 180);
		SetImageSize(label_6, new ImageIcon(
				"/Users/kanishkamishra/Desktop/SmartCity-Application/SmartCity/img/Bangalore/edu-IIITbanguniv.jpg"));
		contentPane.add(label_6);

		JLabel lblBangaloreUniversity = new JLabel("BANGALORE UNIVERSITY");
		lblBangaloreUniversity.setFont(new Font("Tahoma", Font.ITALIC, 17));
		lblBangaloreUniversity.setForeground(Color.RED);
		lblBangaloreUniversity.setBounds(1096, 408, 209, 57);
		contentPane.add(lblBangaloreUniversity);

		JLabel label_7 = new JLabel("");
		label_7.setBounds(1096, 486, 200, 180);
		SetImageSize(label_7, new ImageIcon(
				"/Users/kanishkamishra/Desktop/SmartCity-Application/SmartCity/img/Bangalore/edu-banguniv.jpg"));
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
