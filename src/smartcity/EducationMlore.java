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

public class EducationMlore extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5690032609540144707L;
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
					EducationMlore frame = new EducationMlore();
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
	public EducationMlore() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(5, 50, 1440, 920);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		contentPane.setBackground(Color.PINK);
		JLabel title = new JLabel("EDUCATION");
		contentPane.add(title);
		title.setFont(new Font("TimesRoman BOLD", Font.BOLD, 35));
		title.setForeground(Color.BLUE);
		title.setBounds(600, 20, 400, 40);

		goback = new JButton("BACK");
		goback.setFont(new Font("Dialog", Font.BOLD, 15));
		goback.setForeground(Color.BLACK);
		goback.setBackground(Color.PINK);
		goback.setBounds(1150, 0, 200, 34);
		contentPane.add(goback);
		goback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				dispose();
				Mangalore b = new Mangalore();
				b.Slideshow_Mlore();
				b.show();
			}
		});

		JLabel bc = new JLabel("");
		bc.setBounds(150, 151, 200, 160);
		SetImageSize(bc,
				new ImageIcon("/Users/kanishkamishra/Desktop/SmartCity-Application/SmartCity/img/Mangalore/nitk.jpg"));
		contentPane.add(bc);

		JLabel lblBishopCottonBoys = new JLabel("NITK");
		lblBishopCottonBoys.setForeground(Color.WHITE);
		lblBishopCottonBoys.setBounds(150, 112, 200, 37);
		lblBishopCottonBoys.setFont(new Font("Dialog", Font.BOLD, 20));
		contentPane.add(lblBishopCottonBoys);

		JLabel lblIndusInternationalSchool = new JLabel("KMC");
		lblIndusInternationalSchool.setForeground(Color.WHITE);
		lblIndusInternationalSchool.setBounds(580, 112, 250, 37);
		lblIndusInternationalSchool.setFont(new Font("Dialog", Font.BOLD, 20));
		contentPane.add(lblIndusInternationalSchool);

		JLabel label_1 = new JLabel("");
		label_1.setBounds(580, 151, 200, 160);
		SetImageSize(label_1,
				new ImageIcon("/Users/kanishkamishra/Desktop/SmartCity-Application/SmartCity/img/Mangalore/KMC.jpg"));
		contentPane.add(label_1);

		JLabel lblMountCarmelSchool = new JLabel("St. ALOYSIUS COLLEGE");
		lblMountCarmelSchool.setForeground(Color.WHITE);
		lblMountCarmelSchool.setBounds(1020, 112, 400, 37);
		lblMountCarmelSchool.setFont(new Font("Dialog", Font.BOLD, 20));
		contentPane.add(lblMountCarmelSchool);

		JLabel label = new JLabel("");
		label.setBounds(1020, 151, 200, 150);
		SetImageSize(label, new ImageIcon(
				"/Users/kanishkamishra/Desktop/SmartCity-Application/SmartCity/img/Mangalore/aloysiuscollege.jpg"));
		contentPane.add(label);

		JLabel lblSophiasHighSchool = new JLabel("SRINIVAS COLLEGE");
		lblSophiasHighSchool.setForeground(Color.WHITE);
		lblSophiasHighSchool.setBounds(1020, 388, 400, 37);
		lblSophiasHighSchool.setFont(new Font("Dialog", Font.BOLD, 20));
		contentPane.add(lblSophiasHighSchool);

		JLabel label_2 = new JLabel("");
		label_2.setBounds(1020, 426, 200, 250);
		SetImageSize(label_2, new ImageIcon(
				"/Users/kanishkamishra/Desktop/SmartCity-Application/SmartCity/img/Mangalore/srinivas.jpg"));
		contentPane.add(label_2);

		JLabel label_4 = new JLabel("");
		label_4.setBounds(580, 426, 200, 250);
		SetImageSize(label_4, new ImageIcon(
				"/Users/kanishkamishra/Desktop/SmartCity-Application/SmartCity/img/Mangalore/mlore-university.jpg"));
		contentPane.add(label_4);

		JLabel lblJain = new JLabel("YENEPOYA UNIVERSITY");
		lblJain.setForeground(Color.WHITE);
		lblJain.setBounds(150, 388, 250, 37);
		lblJain.setFont(new Font("Dialog", Font.BOLD, 20));
		contentPane.add(lblJain);

		JLabel label_5 = new JLabel("");
		label_5.setBounds(150, 426, 200, 250);
		SetImageSize(label_5, new ImageIcon(
				"/Users/kanishkamishra/Desktop/SmartCity-Application/SmartCity/img/Mangalore/yenepoya-university.jpg"));
		contentPane.add(label_5);

		JLabel lblDeeksha = new JLabel("MANGALORE UNIVERSITY");
		lblDeeksha.setForeground(Color.WHITE);
		lblDeeksha.setBounds(580, 388, 300, 37);
		lblDeeksha.setFont(new Font("Dialog", Font.BOLD, 20));
		contentPane.add(lblDeeksha);
	}

	public void SetImageSize(JLabel label, ImageIcon im) {
		ImageIcon icon = im;
		Image img = icon.getImage();
		Image newImg = img.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon newImc = new ImageIcon(newImg);
		label.setIcon(newImc);

	}
}
