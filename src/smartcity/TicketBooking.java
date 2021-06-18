package smartcity;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.mysql.cj.jdbc.exceptions.MysqlDataTruncation;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

public class TicketBooking extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8249569637552991467L;
	private JPanel contentPane;
	private JTextField name;
	private JTextField guests;
	private JTextField password;
	private JTextField confirmpwd;
	Connection connect = null;
	password pwd;
	String store;

	/**
	 * Launch the application.
	 */

	String[] places = { "Fort St. George,Chennai", "Kishkinta,Chennai", "Golconda Fort,Hyderabad",
			"The Salar Jung Museum,Hyderabad ", "The Charminar,Hyderabad", "Panambur,Mangalore", "Kudroli,Mangalore",
			"Malpe,Mangalore", "Sanjay Gandhi National Park,Mumbai", "Taraporewala Aquarium,Mumbai",
			"The Global Vipassana Pagoda,Mumbai", "Lalbagh,Bangalore", "Cubbon Park,Bangalore",
			"Wonderla Holidays Limited,Bangalore", "Innovative Film City,Bangalore" };

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TicketBooking frame = new TicketBooking();
					frame.addlist();
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

	public void addlist() {
		contentPane.add(comboBox);

		setLayout(null);

	}

	private JComboBox comboBox;

	public TicketBooking() {
		setVisible(true);
		pwd = new password();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		connect = DbConnect.dataConnector();
		setBounds(0, 50, 1440, 920);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);

		setBackground(Color.orange);
		JLabel background = new JLabel("");
		background.setBounds(0, 50, 1500, 750);
		background.setIcon(
				new ImageIcon("/Users/kanishkamishra/Desktop/Hospitals/india-kerala-backwaters-sodha-travel.jpg"));
		contentPane.add(background);

		JLabel lblPassword = new JLabel("Time ");
		background.add(lblPassword);
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setBounds(324, 683, 63, 14);
		
		JLabel lbldate = new JLabel(
				"YY-MM-DD");
		background.add(lbldate);
		lbldate.setForeground(Color.WHITE);
		lbldate.setBounds(330, 660, 200, 14);
		
		JLabel lbltime = new JLabel(
				"HH-MM-SS");
		background.add(lbltime);
		lbltime.setForeground(Color.WHITE);
		lbltime.setBounds(330, 700, 200, 14);
		

		JLabel lblConfirmPassword = new JLabel("Date ");
		background.add(lblConfirmPassword);
		lblConfirmPassword.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblConfirmPassword.setForeground(Color.WHITE);
		lblConfirmPassword.setBounds(324, 643, 200, 14);

		JLabel lblNewLabel = new JLabel("TICKET BOOKING");
		lblNewLabel.setFont(new Font("TimesRoman BOLD", Font.BOLD, 40));
		background.add(lblNewLabel);
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setBounds(520, 25, 500, 35);
		JLabel lblPassword_cri = new JLabel("BE MESMERISEZED BY THE BEAUTY!");
		lblPassword_cri.setFont(new Font("Tahoma", Font.BOLD, 30));
		background.add(lblPassword_cri);
		lblPassword_cri.setForeground(Color.BLACK);
		lblPassword_cri.setBounds(455, 75, 2000, 104);

		comboBox = new JComboBox();
		background.add(comboBox);
		comboBox.setPreferredSize(new Dimension(250, 150));
		comboBox.setBounds(465, 520, 126, 25);

		name = new JTextField();
		background.add(name);
		name.setBounds(485, 560, 106, 25);
		name.setColumns(10);

		guests = new JTextField();
		background.add(guests);
		guests.setBounds(485, 600, 106, 20);
		guests.setColumns(10);

		confirmpwd = new JTextField();
		background.add(confirmpwd);
		confirmpwd.setBounds(485, 640, 106, 20);
		confirmpwd.setColumns(10);

		password = new JTextField();
		background.add(password);
		password.setBounds(485, 680, 106, 20);
		password.setColumns(10);

		JLabel lblUsername = new JLabel("Number of Visitors");
		background.add(lblUsername);
		lblUsername.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblUsername.setForeground(Color.WHITE);
		lblUsername.setBounds(324, 603, 363, 14);

		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 16));
		background.add(lblName);
		lblName.setForeground(Color.WHITE);
		lblName.setBounds(324, 563, 146, 14);

		JLabel lbl_Hotel_Name = new JLabel("Place Name");
		lbl_Hotel_Name.setFont(new Font("Tahoma", Font.BOLD, 16));
		background.add(lbl_Hotel_Name);
		lbl_Hotel_Name.setForeground(Color.WHITE);
		lbl_Hotel_Name.setBounds(324, 523, 206, 14);

		JButton General = new JButton("BACK");
		background.add(General);
		General.setBackground(Color.LIGHT_GRAY);
		General.setForeground(Color.BLACK);
		General.setBounds(150, 25, 100, 35);
		background.add(General);

		General.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				City c = new City();
				c.show();
			}
		});

		JButton btnSignUp = new JButton("BOOK !");
		btnSignUp.setBackground(Color.LIGHT_GRAY);
		btnSignUp.setForeground(Color.BLACK);
		btnSignUp.setBounds(725, 603, 150, 35);
		background.add(btnSignUp);
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String place = (String) comboBox.getSelectedItem();

				try {
					String query = "insert into ticket_booking (r_name,user_name,guests, date, time) values (?,?,?,?,?)";
					PreparedStatement pst = connect.prepareStatement(query);
					String date = confirmpwd.getText();
					String time = password.getText();
					String name1 = name.getText();
					String guests1=guests.getText();
					String confirm_date;
					confirm_date = new String(date);
					String time1 = new String(time);
					
					if(name1.length()==0) {
						JOptionPane.showMessageDialog(null, "Please Enter the name!");
					}

					if(guests1.length()==0) {
						JOptionPane.showMessageDialog(null, "Please Enter the number of Guests!");
					}
				
					pst.setString(1, place);
					pst.setString(2, name.getText());
					pst.setString(3, guests.getText());
					pst.setString(5, new String(time1));
					pst.setString(4, new String(confirm_date));
					pst.execute();
					pst.close();
					
					connect = null;
					JOptionPane.showMessageDialog(null, "BOOKED Succesfully!");
					City c = new City();
					c.show();

					pst.close();
				
				}
				catch (MysqlDataTruncation e) {
					JOptionPane.showMessageDialog(null,"Please Enter correct Format of Date and Time!");
				}
				catch (Exception e) {
					JOptionPane.showMessageDialog(null, e);
				}
			}
		});
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});

		comboBox.setBackground(Color.PINK);
		int count = 0;
		for (int i = 0; i < 16; i++)
			comboBox.addItem(places[count++]);

		add(comboBox);
		setLocationRelativeTo(null);
	}
}