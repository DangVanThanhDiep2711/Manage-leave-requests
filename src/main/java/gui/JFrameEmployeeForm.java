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

import subFrame.MakeAnRequest;
import subFrame.MyRequests;

import javax.swing.UIManager;
import components.FormtableEmp;

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
    private JPanel panel_1;
    private FormtableEmp formtableEmp;

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
        setBounds(100, 100, 900, 598);
        
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
        
        panel_1 = new JPanel();
        panel_1.setBounds(0, 0, 874, 524);
        panelLeaveRequests.add(panel_1);
        panel_1.setLayout(null);
        
        formtableEmp = new FormtableEmp();
        formtableEmp.setBounds(32, 11, 797, 485);
        panel_1.add(formtableEmp);
        
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
