package gui;

import javax.swing.*;
import java.awt.event.*;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.border.EmptyBorder;
import com.toedter.calendar.JDateChooser;

import gui.AddEmployee;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;

public class JFrameManageForm extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JMenuBar menuBar;
	private JButton btnlManagerEmployee;
	private JButton btnLeaveRequests;
	private JButton btnLeaveHistory; // Added button reference
	private JPanel panelManagerEmployee;
	private JPanel panelLeaveRequests;
	private JPanel panelLeaveHistory; // Added reference to LeaveHistory panel
	private JLabel lblNewLabel;
	private JLabel lblEmployeeid;
	private JLabel lblLeavetype;
	private JLabel lblStartdate;
	private JLabel lblEndDate;
	private JLabel lblReason;
	private JScrollPane scrollPane;
	private JPanel panel;
	private JButton btnCreate;
	private JButton btnEdit;
	private JButton btnDelete;
	private JLabel lblId;
	private JTextField txtId;
	private JLabel lblName;
	private JLabel lblEmail;
	private JLabel lblRole;
	private JTextField txtName;
	private JTextField txtEmail;
	private JTextField txtRole;
	private JComboBox<String> comboBox;
	private JTextPane textPane;
	private JScrollPane scrollLeaveHistory;
	private JPanel panelHistory;
	private JDateChooser dateStart;
	private JDateChooser dateEnd;
	private JButton btnSubmit;
	private JMenu mnNewMenu;
	private JMenuItem mntmInformation;
	private JMenuItem mntmNewMenuItem;
	private JTextField textId;
	private JTextField textEmail;
	private JTextField textName;
	private JTextField textRole;
	private JTextField textSearch;
	private JButton btnAccept;
	private JButton btnReject;
	private JTextField textSearchHistory;
	private JTextField txtNameRequest;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch (Throwable e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrameManageForm frame = new JFrameManageForm();
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
	public JFrameManageForm() {
		setResizable(false);
		setTitle("ManagerForm");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 600);

		menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		btnlManagerEmployee = new JButton("Manager Employee");
		btnlManagerEmployee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showPanel("ManagerEmployee");
			}
		});

		mnNewMenu = new JMenu("hiện tên người đăng nhập");
		menuBar.add(mnNewMenu);

		mntmInformation = new JMenuItem("Information");
		mntmInformation.setAccelerator(
				KeyStroke.getKeyStroke(KeyEvent.VK_I, InputEvent.CTRL_DOWN_MASK | InputEvent.SHIFT_DOWN_MASK));
		mnNewMenu.add(mntmInformation);
		mntmInformation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showPanel("Information"); // Show the Information panel
			}
		});

		mntmNewMenuItem = new JMenuItem("Logout");
		mntmNewMenuItem.setAccelerator(
				KeyStroke.getKeyStroke(KeyEvent.VK_P, InputEvent.CTRL_DOWN_MASK | InputEvent.SHIFT_DOWN_MASK));
		mnNewMenu.add(mntmNewMenuItem);

		btnLeaveRequests = new JButton("Leave Requests");
		btnLeaveRequests.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showPanel("LeaveRequests");
			}
		});
		menuBar.add(btnLeaveRequests);
		menuBar.add(btnlManagerEmployee);

		btnLeaveHistory = new JButton("Leave History"); // Initialize Leave History button
		btnLeaveHistory.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showPanel("LeaveHistory");
			}
		});
		menuBar.add(btnLeaveHistory);

		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));

		panelLeaveHistory = new JPanel();
		panelLeaveHistory.setBackground(new Color(192, 192, 192));
		contentPane.add(panelLeaveHistory, "LeaveHistory"); // Add panel to contentPane
		panelLeaveHistory.setLayout(null);

		scrollLeaveHistory = new JScrollPane();
		scrollLeaveHistory.setBackground(new Color(255, 255, 255));
		scrollLeaveHistory.setBounds(10, 11, 854, 373);
		panelLeaveHistory.add(scrollLeaveHistory);

		panelHistory = new JPanel();
		scrollLeaveHistory.setViewportView(panelHistory);
		panelHistory.setBackground(new Color(255, 255, 255));

		btnAccept = new JButton("Accept");
		btnAccept.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnAccept.setBounds(10, 452, 89, 33);
		panelLeaveHistory.add(btnAccept);

		btnReject = new JButton("Reject");
		btnReject.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnReject.setBounds(129, 452, 97, 33);
		panelLeaveHistory.add(btnReject);

		textSearchHistory = new JTextField();
		textSearchHistory
				.setBorder(new TitledBorder(null, "Search :", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		textSearchHistory.setBounds(610, 453, 237, 32);
		panelLeaveHistory.add(textSearchHistory);
		textSearchHistory.setColumns(10);

		panelLeaveRequests = new JPanel();
		panelLeaveRequests.setBackground(new Color(192, 192, 192));
		contentPane.add(panelLeaveRequests, "LeaveRequests");
		panelLeaveRequests.setLayout(null);

		lblNewLabel = new JLabel("Leave Request");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 24));
		lblNewLabel.setBounds(351, 11, 187, 32);
		panelLeaveRequests.add(lblNewLabel);

		lblEmployeeid = new JLabel("Employee Name :");
		lblEmployeeid.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblEmployeeid.setBounds(25, 81, 120, 14);
		panelLeaveRequests.add(lblEmployeeid);

		lblLeavetype = new JLabel("LeaveType  :");
		lblLeavetype.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblLeavetype.setBounds(25, 163, 109, 18);
		panelLeaveRequests.add(lblLeavetype);

		lblStartdate = new JLabel("StartDate :");
		lblStartdate.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblStartdate.setBounds(25, 106, 84, 14);
		panelLeaveRequests.add(lblStartdate);

		lblEndDate = new JLabel("EndDate :");
		lblEndDate.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblEndDate.setBounds(25, 138, 84, 14);
		panelLeaveRequests.add(lblEndDate);

		lblReason = new JLabel("Reason :");
		lblReason.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblReason.setBounds(25, 236, 84, 14);
		panelLeaveRequests.add(lblReason);

		comboBox = new JComboBox<>();
		comboBox.setBounds(176, 159, 596, 22);
		panelLeaveRequests.add(comboBox);

		comboBox.addItem("Employee");
		comboBox.addItem("TeamLeader");
		comboBox.addItem("Manager");

		comboBox.setSelectedItem("Item 2");

		textPane = new JTextPane();
		textPane.setBounds(176, 188, 596, 149);
		panelLeaveRequests.add(textPane);

		dateStart = new JDateChooser();
		dateStart.setBounds(176, 103, 590, 20);
		panelLeaveRequests.add(dateStart);

		dateEnd = new JDateChooser();
		dateEnd.setBounds(176, 134, 596, 20);
		panelLeaveRequests.add(dateEnd);

		btnSubmit = new JButton("Submit");
		btnSubmit.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnSubmit.setBounds(361, 385, 109, 22);
		panelLeaveRequests.add(btnSubmit);

		txtNameRequest = new JTextField();
		txtNameRequest.setBounds(176, 78, 590, 20);
		panelLeaveRequests.add(txtNameRequest);
		txtNameRequest.setColumns(10);

		// Tạo panelManagerEmployee
		panelManagerEmployee = new JPanel();
		panelManagerEmployee.setBackground(new Color(192, 192, 192));
		contentPane.add(panelManagerEmployee, "ManagerEmployee");
		panelManagerEmployee.setLayout(null);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 854, 352);
		panelManagerEmployee.add(scrollPane);

		panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		scrollPane.setViewportView(panel);

		btnCreate = new JButton("Create");
		btnCreate.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnCreate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCreateActionPerformed(e);
			}
		});
		btnCreate.setBackground(new Color(255, 255, 255));
		btnCreate.setBounds(723, 411, 89, 23);
		panelManagerEmployee.add(btnCreate);

		btnEdit = new JButton("Update");
		btnEdit.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnEdit.setBounds(723, 445, 89, 23);
		panelManagerEmployee.add(btnEdit);

		btnDelete = new JButton("Delete");
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnDelete.setBackground(new Color(255, 255, 255));
		btnDelete.setBounds(723, 479, 89, 23);
		panelManagerEmployee.add(btnDelete);

		textId = new JTextField();
		textId.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Id :",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		textId.setBounds(12, 411, 73, 36);
		panelManagerEmployee.add(textId);
		textId.setColumns(10);

		textEmail = new JTextField();
		textEmail.setColumns(10);
		textEmail.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Email :",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		textEmail.setBounds(349, 411, 255, 36);
		panelManagerEmployee.add(textEmail);

		textName = new JTextField();
		textName.setColumns(10);
		textName.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Name :",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		textName.setBounds(95, 411, 244, 36);
		panelManagerEmployee.add(textName);

		textRole = new JTextField();
		textRole.setColumns(10);
		textRole.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Role :",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		textRole.setBounds(70, 479, 113, 36);
		panelManagerEmployee.add(textRole);

		textSearch = new JTextField();
		textSearch.setColumns(10);
		textSearch.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Search :",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		textSearch.setBounds(251, 479, 264, 36);
		panelManagerEmployee.add(textSearch);

		// Example Information Panel
		JPanel panelInformation = new JPanel();
		panelInformation.setBackground(new Color(192, 192, 192));
		contentPane.add(panelInformation, "Information");
		panelInformation.setLayout(null);

		JLabel lblInfo = new JLabel("Information Panel");
		lblInfo.setFont(new Font("Dialog", Font.BOLD, 26));
		lblInfo.setBounds(321, 24, 241, 32);
		panelInformation.add(lblInfo);

		lblId = new JLabel("Id :");
		lblId.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblId.setBounds(62, 89, 46, 14);
		panelInformation.add(lblId);

		txtId = new JTextField();
		txtId.setBounds(173, 82, 490, 32);
		panelInformation.add(txtId);
		txtId.setColumns(10);

		lblName = new JLabel("Name :");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblName.setBounds(62, 147, 82, 14);
		panelInformation.add(lblName);

		lblEmail = new JLabel("Email :");
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblEmail.setBounds(62, 201, 82, 14);
		panelInformation.add(lblEmail);

		lblRole = new JLabel("Role :");
		lblRole.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblRole.setBounds(62, 267, 46, 14);
		panelInformation.add(lblRole);

		txtName = new JTextField();
		txtName.setColumns(10);
		txtName.setBounds(173, 140, 490, 32);
		panelInformation.add(txtName);

		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(173, 194, 490, 32);
		panelInformation.add(txtEmail);

		txtRole = new JTextField();
		txtRole.setColumns(10);
		txtRole.setBounds(173, 260, 490, 32);
		panelInformation.add(txtRole);

	}

	private void showPanel(String panelName) {
		CardLayout cl = (CardLayout) (contentPane.getLayout());
		cl.show(contentPane, panelName);
	}

	protected void btnCreateActionPerformed(ActionEvent e) {
		AddEmployee addEmployeeFrame = new AddEmployee();
		addEmployeeFrame.setVisible(true);
	}
}