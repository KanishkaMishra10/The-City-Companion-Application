package smartcity;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import java.awt.Insets;

public class Login extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3644920063731361662L;
	private JPanel contentPane;
	private JTextField usernametext;
	private JPasswordField passwordtext;
	Connection connect = null;
	JButton goback;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setTitle("Login");
		DbConnect db = new DbConnect();
		connect = db.dataConnector();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(5, 50, 1440, 920);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);

		JLabel background = new JLabel("");
		background.setIcon(
				new ImageIcon("/Users/kanishkamishra/Desktop/Hospitals/Photoshop-Replace-Background-Featured.jpg"));
		background.setSize(1240, 720);
		background.setBounds(0, -25, 1440, 920);
		contentPane.add(background);

		JLabel usernamelabel = new JLabel("Username");
		background.add(usernamelabel);
		usernamelabel.setForeground(Color.BLACK);
		usernamelabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		usernamelabel.setBounds(514, 360, 200, 50);

		JLabel Passwordlabel = new JLabel("Password");
		background.add(Passwordlabel);
		Passwordlabel.setForeground(Color.BLACK);
		Passwordlabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		Passwordlabel.setBounds(514, 430, 200, 50);
		;

		JButton btnLogin = new JButton("User Login");
		background.add(btnLogin);
		background.setForeground(Color.BLACK);
		background.setBackground(Color.WHITE);
		background.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnLogin.setBounds(900, 405, 120, 50);

		usernametext = new JTextField();
		background.add(usernametext);
		usernametext.setBounds(681, 370, 136, 30);
		usernametext.setColumns(10);

		passwordtext = new JPasswordField();
		background.add(passwordtext);
		passwordtext.setBounds(681, 440, 136, 30);
		passwordtext.setColumns(10);

		JLabel lblPleaseLogin = new JLabel("PLEASE LOGIN");
		background.add(lblPleaseLogin);
		lblPleaseLogin.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblPleaseLogin.setForeground(Color.BLACK);
		lblPleaseLogin.setBounds(580, 200, 500, 100);

		goback = new JButton("BACK");
		goback.setFont(new Font("Tahoma", Font.ITALIC, 20));
		goback.setForeground(Color.BLACK);
		goback.setBackground(Color.WHITE);
		goback.setMargin(new Insets(20, 20, 20, 20));
		goback.setBorderPainted(true);
		goback.setBounds(1150, 80, 250, 35);
		background.add(goback);
		goback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Welcome w = new Welcome();
				w.show();
			}
		});

		btnLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					String query = "select Username,Password from User where Username=? and Password=?";
					PreparedStatement pst = connect.prepareStatement(query);
					pst.setString(1, usernametext.getText());
					pst.setString(2, passwordtext.getText());
					passwordtext.setEchoChar('*');
					ResultSet rs = pst.executeQuery();
					int count = 0;
					while (rs.next()) {
						count++;
					}
					if (count == 1) {
						dispose();
						JOptionPane.showMessageDialog(null, "Login Successful!");
						City c = new City();
						c.show();

					} else
						JOptionPane.showMessageDialog(null, "Wrong Username/Password");
					rs.close();
					pst.close();
				} catch (Exception f) {
					JOptionPane.showMessageDialog(null, f);

				}
			}
		});

		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
	}
}