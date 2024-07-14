package gui;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.KeyStroke;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import com.toedter.calendar.JDateChooser;
import javax.swing.UIManager;

public class JFrameEmployeeForm extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JMenuBar menuBar;
    private JMenu mnNewMenu;
    private JMenuItem mntmInformation;
    private JMenuItem mntmLogout;
    private JButton btnLeaveRequests;
    private JButton btnLeaveHistory;
    private JPanel panelLeaveHistory;
    private JScrollPane scrollLeaveHistory;
    private JButton btnCancel;
    private JTextField txtSearch;
    private JPanel panelLeaveRequests;
    private JLabel lblNewLabel;
    private JLabel lblEmployeeid;
    private JLabel lblLeavetype;
    private JLabel lblStartdate;
    private JLabel lblEndDate;
    private JLabel lblReason;
    private JComboBox<String> comboBox;
    private JTextPane textPane;
    private JDateChooser dateStart;
    private JDateChooser dateEnd;
    private JButton btnSubmit;
    private JTextField txtName;
    private JPanel panelInformation;
    private JLabel lblInfo;
    private JLabel lblId;
    private JTextField textField_2;
    private JLabel lblName;
    private JLabel lblEmail;
    private JLabel lblRole;
    private JTextField textField_3;
    private JTextField textField_4;
    private JTextField textField_5;
    private JPanel panel;

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
                    JFrameEmployeeForm frame = new JFrameEmployeeForm();
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
    public JFrameEmployeeForm() {
        setResizable(false);
        setTitle("EmployeeForm");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 900, 600);
        
        menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        
        mnNewMenu = new JMenu("Hiện tên thằng dăng nhập");
        menuBar.add(mnNewMenu);
        
        mntmInformation = new JMenuItem("Information");
        mntmInformation.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_I, InputEvent.CTRL_DOWN_MASK | InputEvent.SHIFT_DOWN_MASK));
        mnNewMenu.add(mntmInformation);
        
        mntmLogout = new JMenuItem("Logout");
        mntmLogout.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, InputEvent.CTRL_DOWN_MASK | InputEvent.SHIFT_DOWN_MASK));
        mnNewMenu.add(mntmLogout);
        
        btnLeaveRequests = new JButton("Leave Requests");
        menuBar.add(btnLeaveRequests);
        
        btnLeaveHistory = new JButton("Leave History");
        menuBar.add(btnLeaveHistory);
        
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(new CardLayout(0, 0));

        // Define CardLayout
        CardLayout cardLayout = (CardLayout) contentPane.getLayout();
        
        panelLeaveHistory = new JPanel();
        panelLeaveHistory.setBackground(new Color(192, 192, 192));
        panelLeaveHistory.setLayout(null);
        contentPane.add(panelLeaveHistory, "leaveHistory");
        
        scrollLeaveHistory = new JScrollPane();
        scrollLeaveHistory.setBackground(Color.WHITE);
        scrollLeaveHistory.setBounds(10, 11, 854, 417);
        panelLeaveHistory.add(scrollLeaveHistory);
        
        panel = new JPanel();
        scrollLeaveHistory.setViewportView(panel);
        
        btnCancel = new JButton("Cancel Order");
        btnCancel.setFont(new Font("Tahoma", Font.BOLD, 14));
        btnCancel.setBounds(82, 482, 155, 33);
        panelLeaveHistory.add(btnCancel);
        
        txtSearch = new JTextField();
        txtSearch.setFont(new Font("Tahoma", Font.BOLD, 12));
        txtSearch.setColumns(10);
        txtSearch.setBorder(new TitledBorder(null, "Search :", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        txtSearch.setBounds(263, 483, 237, 32);
        panelLeaveHistory.add(txtSearch);
        
        panelLeaveRequests = new JPanel();
        panelLeaveRequests.setLayout(null);
        panelLeaveRequests.setBackground(Color.LIGHT_GRAY);
        contentPane.add(panelLeaveRequests, "leaveRequests");
        
        lblNewLabel = new JLabel("Leave Request");
        lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 24));
        lblNewLabel.setBounds(351, 11, 187, 32);
        panelLeaveRequests.add(lblNewLabel);
        
        lblEmployeeid = new JLabel("Employee Name :");
        lblEmployeeid.setFont(new Font("Tahoma", Font.BOLD, 13));
        lblEmployeeid.setBounds(27, 94, 120, 14);
        panelLeaveRequests.add(lblEmployeeid);
        
        lblLeavetype = new JLabel("LeaveType  :");
        lblLeavetype.setFont(new Font("Tahoma", Font.BOLD, 13));
        lblLeavetype.setBounds(25, 173, 84, 14);
        panelLeaveRequests.add(lblLeavetype);
        
        lblStartdate = new JLabel("StartDate :");
        lblStartdate.setFont(new Font("Tahoma", Font.BOLD, 13));
        lblStartdate.setBounds(25, 123, 84, 14);
        panelLeaveRequests.add(lblStartdate);
        
        lblEndDate = new JLabel("EndDate :");
        lblEndDate.setFont(new Font("Tahoma", Font.BOLD, 13));
        lblEndDate.setBounds(25, 148, 84, 14);
        panelLeaveRequests.add(lblEndDate);
        
        lblReason = new JLabel("Reason :");
        lblReason.setFont(new Font("Tahoma", Font.BOLD, 13));
        lblReason.setBounds(25, 206, 84, 14);
        panelLeaveRequests.add(lblReason);
        
        comboBox = new JComboBox<String>();
        comboBox.setBounds(176, 170, 559, 22);
        panelLeaveRequests.add(comboBox);
        
		comboBox.addItem("On leave");
		comboBox.addItem("Sick leave");
		comboBox.addItem("Maternity leave");
        
        textPane = new JTextPane();
        textPane.setBounds(176, 206, 559, 149);
        panelLeaveRequests.add(textPane);
        
        dateStart = new JDateChooser();
        dateStart.setBounds(176, 117, 559, 20);
        panelLeaveRequests.add(dateStart);
        
        dateEnd = new JDateChooser();
        dateEnd.setBounds(176, 142, 559, 20);
        panelLeaveRequests.add(dateEnd);
        
        btnSubmit = new JButton("Submit");
        btnSubmit.setFont(new Font("Tahoma", Font.BOLD, 15));
        btnSubmit.setBounds(363, 418, 109, 22);
        panelLeaveRequests.add(btnSubmit);
        
        txtName = new JTextField();
        txtName.setColumns(10);
        txtName.setBounds(176, 92, 559, 20);
        panelLeaveRequests.add(txtName);
        
        panelInformation = new JPanel();
        panelInformation.setBackground(new Color(192, 192, 192));
        panelInformation.setLayout(null);
        contentPane.add(panelInformation, "information");
        
        lblInfo = new JLabel("Information Panel");
        lblInfo.setFont(new Font("Dialog", Font.BOLD, 26));
        lblInfo.setBounds(316, 21, 241, 32);
        panelInformation.add(lblInfo);
        
        lblId = new JLabel("Id :");
        lblId.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblId.setBounds(85, 89, 46, 14);
        panelInformation.add(lblId);
        
        textField_2 = new JTextField();
        textField_2.setColumns(10);
        textField_2.setBounds(173, 82, 533, 32);
        panelInformation.add(textField_2);
        
        lblName = new JLabel("Name :");
        lblName.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblName.setBounds(85, 147, 78, 14);
        panelInformation.add(lblName);
        
        lblEmail = new JLabel("Email :");
        lblEmail.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblEmail.setBounds(85, 201, 78, 14);
        panelInformation.add(lblEmail);
        
        lblRole = new JLabel("Role :");
        lblRole.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblRole.setBounds(85, 267, 78, 14);
        panelInformation.add(lblRole);
        
        textField_3 = new JTextField();
        textField_3.setColumns(10);
        textField_3.setBounds(173, 140, 533, 32);
        panelInformation.add(textField_3);
        
        textField_4 = new JTextField();
        textField_4.setColumns(10);
        textField_4.setBounds(173, 194, 533, 32);
        panelInformation.add(textField_4);
        
        textField_5 = new JTextField();
        textField_5.setColumns(10);
        textField_5.setBounds(173, 260, 533, 32);
        panelInformation.add(textField_5);
        
        // Add action listener to Information menu item
        mntmInformation.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(contentPane, "information");
            }
        });

        // Add action listener to Leave Requests button
        btnLeaveRequests.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(contentPane, "leaveRequests");
            }
        });
        
        // Add action listener to Leave History button
        btnLeaveHistory.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(contentPane, "leaveHistory");
            }
        });
    }
}
