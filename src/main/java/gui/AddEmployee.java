package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.JButton;
import java.awt.Color;

public class AddEmployee extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblId;
	private JLabel lblName;
	private JLabel lblEmail;
	private JLabel lblPassword;
	private JLabel lblRole;
	private JComboBox comboBox;
	private JPasswordField passwordField;
	private JTextField textField;
	private JTextField textField_1;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		try {
//			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
//		} catch (Throwable e) {
//			e.printStackTrace();
//		}
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					AddEmployee frame = new AddEmployee();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public AddEmployee() {
		setResizable(false);
		setTitle("Add Employee");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 412, 312);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("Add Employee");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel.setBounds(111, 11, 169, 29);
		contentPane.add(lblNewLabel);
		
		lblId = new JLabel("Id :");
		lblId.setBounds(26, 49, 46, 14);
		contentPane.add(lblId);
		
		lblName = new JLabel("Name :");
		lblName.setBounds(26, 85, 46, 14);
		contentPane.add(lblName);
		
		lblEmail = new JLabel("Email :");
		lblEmail.setBounds(26, 117, 46, 14);
		contentPane.add(lblEmail);
		
		lblPassword = new JLabel("Password :");
		lblPassword.setBounds(26, 152, 65, 14);
		contentPane.add(lblPassword);
		
		lblRole = new JLabel("Role :");
		lblRole.setBounds(26, 188, 65, 14);
		contentPane.add(lblRole);
		
		comboBox = new JComboBox();
		comboBox.setBounds(119, 184, 213, 22);
		contentPane.add(comboBox);

		comboBox.addItem("Manager");
		comboBox.addItem("Employee");
		
		comboBox.setSelectedItem("Item 2");
		
		passwordField = new JPasswordField();
		passwordField.setBounds(118, 149, 214, 20);
		contentPane.add(passwordField);
		
		textField = new JTextField();
		textField.setBounds(119, 114, 213, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(119, 82, 213, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		btnNewButton = new JButton("Add");
		btnNewButton.setBounds(243, 226, 89, 23);
		contentPane.add(btnNewButton);
	}
}
