package subFrame;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;

import javax.swing.*;
import java.awt.BorderLayout;
//import javax.swing.GroupLayout.Alignment;

public class MyRequests extends JInternalFrame {

	private static final long serialVersionUID = 1L;
	private static MyRequests instance;
	private JPanel panel;
	private JScrollPane scrollPane;
	private MakeAnRequest makeAnRequest;
	
	public MakeAnRequest getMakeAnRequest() {
		return makeAnRequest;
	}

	public void setMakeAnRequest(MakeAnRequest makeAnRequest) {
		this.makeAnRequest = makeAnRequest;
	}

	public static MyRequests getInstance()
	{
	    if (instance == null) {
	        instance = new MyRequests();
	    }
	    return instance;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyRequests frame = new MyRequests();
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
	public MyRequests() {
		setResizable(true);
		setIconifiable(true);
		setMaximizable(true);
		setClosable(true);
        setTitle("My Request");
        setBounds(100, 100, 600, 400);
        getContentPane().setLayout(new BorderLayout(0, 0));

        panel = new JPanel();
        getContentPane().add(panel, BorderLayout.NORTH);
        
      
        JLabel lblName = new JLabel("Employee Name:");
        JTextField nameField = new JTextField(20);

        JLabel lblLeaveType = new JLabel("Leave Type:");
        JComboBox<String> leaveTypeComboBox = new JComboBox<>(new String[]{
                "Sick Leave", "Casual Leave", "Maternity Leave", "Other Leave"
        });

        JLabel lblFromDate = new JLabel("Start Date:");
        JTextField fromDateField = new JTextField(20);

        JLabel lblToDate = new JLabel("To Date:");
        JTextField toDateField = new JTextField(20);

        JLabel lblReason = new JLabel("Reason:");
        JTextField reasonField = new JTextField(20);

        JButton btnSubmit = new JButton("Submit");
        JButton btnCancel = new JButton("Cancel");
        btnCancel.addActionListener(e ->btnBackActionPerformed());

        GroupLayout layout = new GroupLayout(panel);
        panel.setLayout(layout);
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        layout.setHorizontalGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(lblName)
                        .addComponent(lblLeaveType)
                        .addComponent(lblFromDate)
                        .addComponent(lblToDate)
                        .addComponent(lblReason))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(nameField)
                        .addComponent(leaveTypeComboBox)
                        .addComponent(fromDateField)
                        .addComponent(toDateField)
                        .addComponent(reasonField)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSubmit)
                                .addComponent(btnCancel)))
        );

        layout.setVerticalGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(lblName)
                        .addComponent(nameField))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(lblLeaveType)
                        .addComponent(leaveTypeComboBox))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(lblFromDate)
                        .addComponent(fromDateField))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(lblToDate)
                        .addComponent(toDateField))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(lblReason)
                        .addComponent(reasonField))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSubmit)
                        .addComponent(btnCancel))
           
        );
		scrollPane = new JScrollPane();
		getContentPane().add(scrollPane, BorderLayout.CENTER);
		
        String[] columnNames = {"No", "Employee Name", "Leave Type", "Start Date", "To Date", "Reason" , "status"};
        Object[][] data = {
                {"0", "Tran Van A", "Sick Leave", "2023-07-10", "2023-07-15", "Fever", "pending"},
                {"1", "Tran Van B", "Casual Leave", "2023-07-11", "2023-07-13", "Personal", "pending"},
                {"2", "Tran Van C", "Maternity Leave", "2023-07-01", "2023-12-31", "Maternity", "pending"},
                {"3", "Tran Van D", "Other Leave", "2023-07-20", "2023-07-25", "Travel", "pending"},
                {"4", "Tran Van E", "Sick Leave", "2023-07-22", "2023-07-28", "Surgery","pending"}
        };
        JTable table = new JTable(data, columnNames);
        scrollPane.setViewportView(table);
}
	protected void btnBackActionPerformed() {
		this.setVisible(false);
		MakeAnRequest makeAnRequest2 = new MakeAnRequest();
		makeAnRequest2.setVisible(true);
	}
}
