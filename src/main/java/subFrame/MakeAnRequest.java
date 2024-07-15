package subFrame;

import java.awt.EventQueue;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Dao.CRUD;
import subFrame.MyRequests;

import java.awt.Color;
import java.awt.BorderLayout;
import javax.swing.JScrollPane;

public class MakeAnRequest extends JInternalFrame {

	private static final long serialVersionUID = 1L;
	private static MakeAnRequest instance;
	private JScrollPane scrollPane;
	private JTable table;
//	private MyRequest myRequest;
	public static MakeAnRequest getInstance()
	{
	    if (instance == null) {
	        instance = new MakeAnRequest();
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
					MakeAnRequest frame = new MakeAnRequest();
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
	public MakeAnRequest() {
		getContentPane().setBackground(new Color(255, 128, 0));
		getContentPane().setLayout(new BorderLayout());
		
		JPanel buttonPane = new JPanel();
		buttonPane.setLayout(new FlowLayout());
		
//		JButton addButton = new JButton("<html>\\r\\n\\r\\n<body>\\r\\n\\r\\n&#43;Add Request\\r\\n\\r\\n</body>\\r\\n</html>");
		JButton addButton = new JButton("add Request");
		addButton.addActionListener(e -> showAddRequest());
		JButton editButton = new JButton("edit Request");
//		editButton.addActionListener(e -> showEditRequestDialog());
		JButton deleteButton = new JButton("delete Request");
//		JButton deleteButton = new JButton("<html>\\r\\n\\r\\n<body>\\r\\n\\r\\n&#10060; Delete Request\\r\\n\\r\\n</body>\\r\\n</html>");
		
		buttonPane.add(addButton);
		buttonPane.add(editButton);
		buttonPane.add(deleteButton);
		
		getContentPane().add(buttonPane, BorderLayout.SOUTH);
		
		scrollPane = new JScrollPane();
		getContentPane().add(scrollPane, BorderLayout.CENTER);
		
		table = new JTable();
		loadLeaveRequest();
		scrollPane.setViewportView(table);
		scrollPane.setViewportView(table);
		setBounds(100, 100, 450, 300);
		setClosable(true);
		setIconifiable(true);
		setMaximizable(true);
		setResizable(true);
		setTitle("Make An Request");
		
	}
	public void loadLeaveRequest() {
		var model = new DefaultTableModel();
		model.addColumn("EmployeeID");
		model.addColumn("Name");
		model.addColumn("Email");
		model.addColumn("Password");
		model.addColumn("Role");
		
		CRUD dao = new CRUD();
		dao.getList().stream().forEach(
				emp -> model.addRow(new Object[] {
						
					emp.getEmployeeID(),emp.getName(),emp.getEmail(),emp.getPassword(),emp.getRole()
				})
				);
		
		table.setModel(model);
	}

	private void showAddRequest() {
		var myRequest = new MyRequests();
		if (!myRequest.isVisible()) {
			 getParent().add(myRequest);
			myRequest.setVisible(true);
			myRequest.setMakeAnRequest(this);
			this.setVisible(false);
		}
	}

	


	

}
