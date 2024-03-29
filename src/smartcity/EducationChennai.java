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

public class EducationChennai extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1076379298183676823L;
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
					EducationChennai frame = new EducationChennai();
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
	public EducationChennai() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(5, 50, 1440, 920);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		contentPane.setBackground(Color.PINK);
		JLabel title = new JLabel("EDUCATION");
		contentPane.add(title);
		title.setFont(new Font("Tahoma", Font.BOLD, 25));
		title.setForeground(Color.BLACK);
		title.setBounds(10, 10, 200, 40);

		goback = new JButton("BACK");
		goback.setFont(new Font("Dialog", Font.BOLD, 15));
		goback.setForeground(Color.BLACK);
		goback.setBackground(Color.pink);
		goback.setBounds(1150, 0, 200, 34);
		contentPane.add(goback);
		goback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Chennai b = new Chennai();
				b.show();
			}
		});

		JLabel bc = new JLabel("");
		bc.setBounds(50, 151, 300, 180);
		SetImageSize(bc,
				new ImageIcon("/Users/kanishkamishra/Desktop/SmartCity-Application/SmartCity/img/IIT_Madras.jpg"));
		contentPane.add(bc);

		JLabel lblBishopCottonBoys = new JLabel("IIT MADRAS");
		lblBishopCottonBoys.setForeground(Color.WHITE);
		lblBishopCottonBoys.setBounds(50, 112, 250, 37);
		lblBishopCottonBoys.setFont(new Font("Dialog", Font.BOLD, 20));
		contentPane.add(lblBishopCottonBoys);

		JLabel lblIndusInternationalSchool = new JLabel("ANNA UNIVERSITY");
		lblIndusInternationalSchool.setForeground(Color.WHITE);
		lblIndusInternationalSchool.setBounds(520, 112, 250, 37);
		lblIndusInternationalSchool.setFont(new Font("Dialog", Font.BOLD, 20));
		contentPane.add(lblIndusInternationalSchool);

		JLabel label_1 = new JLabel("");
		label_1.setBounds(520, 151, 300, 180);
		SetImageSize(label_1,
				new ImageIcon("/Users/kanishkamishra/Desktop/SmartCity-Application/SmartCity/img/Anna_niversity.jpg"));
		contentPane.add(label_1);

		JLabel lblMountCarmelSchool = new JLabel("MADRAS CHRISTIAN COLLEGE");
		lblMountCarmelSchool.setForeground(Color.WHITE);
		lblMountCarmelSchool.setBounds(900, 112, 400, 37);
		lblMountCarmelSchool.setFont(new Font("Dialog", Font.BOLD, 20));

		contentPane.add(lblMountCarmelSchool);

		JLabel label1 = new JLabel("");
		label1.setBounds(900, 151, 300, 180);
		SetImageSize(label1,
				new ImageIcon("/Users/kanishkamishra/Desktop/SmartCity-Application/SmartCity/img/Chennai/MCC.jpeg"));
		contentPane.add(label1);

		JLabel label_2 = new JLabel("");
		label_2.setBounds(900, 491, 300, 180);
		SetImageSize(label_2,
				new ImageIcon("/Users/kanishkamishra/Desktop/SmartCity-Application/SmartCity/img/SRM.png"));
		contentPane.add(label_2);

		JLabel lblDeeksha = new JLabel("VELS UNIVERSITY");
		lblDeeksha.setForeground(Color.WHITE);
		lblDeeksha.setBounds(50, 450, 300, 37);
		lblDeeksha.setFont(new Font("Dialog", Font.BOLD, 20));
		contentPane.add(lblDeeksha);

		JLabel label_4 = new JLabel("");
		label_4.setBounds(50, 491, 250, 180);
		SetImageSize(label_4,
				new ImageIcon("/Users/kanishkamishra/Desktop/SmartCity-Application/SmartCity/img/Vels_University.png"));
		contentPane.add(label_4);

		JLabel lblJain = new JLabel("UNIVERSITY OF MADRAS");
		lblJain.setForeground(Color.WHITE);
		lblJain.setBounds(520, 450, 450, 37);
		lblJain.setFont(new Font("Dialog", Font.BOLD, 20));
		contentPane.add(lblJain);

		JLabel label_5 = new JLabel("");
		label_5.setBounds(520, 491, 300, 180);
		SetImageSize(label_5, new ImageIcon(
				"/Users/kanishkamishra/Desktop/SmartCity-Application/SmartCity/img/University_madras.jpg"));
		contentPane.add(label_5);

		JLabel lblSophiasHighSchool = new JLabel("SRM UNIVERSITY");
		lblSophiasHighSchool.setForeground(Color.WHITE);
		lblSophiasHighSchool.setBounds(900, 450, 450, 37);
		lblSophiasHighSchool.setFont(new Font("Dialog", Font.BOLD, 20));
		contentPane.add(lblSophiasHighSchool);
	}

	public void SetImageSize(JLabel label, ImageIcon im) {
		ImageIcon icon = im;
		Image img = icon.getImage();
		Image newImg = img.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon newImc = new ImageIcon(newImg);
		label.setIcon(newImc);

	}
}
