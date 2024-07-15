package components;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.table.DefaultTableModel;



import javax.swing.JTable;

public class FormtableEmp extends JPanel {

	private static final long serialVersionUID = 1L;
	private JPanel panel;
	private JLabel lblName;
	private JLabel lblLeaveType;
	private JLabel lblFromDate;
	private JLabel lblToDate;
	private JLabel lblReason;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JButton btnSubmit;
	private JButton btnCancel;
	private JScrollPane scrollPane;
	private JTable table;

	/**
	 * Create the panel.
	 */
	public FormtableEmp() {
		
		panel = new JPanel();
		
		lblName = new JLabel("Employee Name:");
		
		lblLeaveType = new JLabel("Leave Type:");
		
		lblFromDate = new JLabel("Start Date:");
		
		lblToDate = new JLabel("To Date:");
		
		lblReason = new JLabel("Reason:");
		
		textField = new JTextField(20);
		
		textField_1 = new JTextField(20);
		
		textField_2 = new JTextField(20);
		
		textField_3 = new JTextField(20);
		
		btnSubmit = new JButton("Submit");
		
		btnCancel = new JButton("Cancel");
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 584, Short.MAX_VALUE)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblName)
						.addComponent(lblLeaveType)
						.addComponent(lblFromDate)
						.addComponent(lblToDate)
						.addComponent(lblReason))
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(btnSubmit)
							.addComponent(btnCancel))
						.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
								.addComponent(textField_3, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 544, Short.MAX_VALUE)
								.addComponent(textField_2, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 544, Short.MAX_VALUE)
								.addComponent(textField_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 544, Short.MAX_VALUE)
								.addComponent(textField, GroupLayout.DEFAULT_SIZE, 544, Short.MAX_VALUE))
							.addContainerGap())))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 175, Short.MAX_VALUE)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblName)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addComponent(lblLeaveType)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblFromDate)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblToDate)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblReason)
						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnSubmit)
						.addComponent(btnCancel)))
		);
		gl_panel.setAutoCreateGaps(true);
		gl_panel.setAutoCreateContainerGaps(true);
		panel.setLayout(gl_panel);
		
		scrollPane = new JScrollPane();
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 648, Short.MAX_VALUE)
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, 648, Short.MAX_VALUE)
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE))
		);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		setLayout(groupLayout);
		
		
	}
	
	public void showHistory() {
		var model = new DefaultTableModel();
//		tạo cột
		model.addColumn("Name");
		model.addColumn("LeaveType");
		model.addColumn("StartDate");
		model.addColumn("EndDate");
		model.addColumn("Reason");
		model.addColumn("ApprovalStatus");
		model.addColumn("ApproverID");
		model.addColumn("SubmissionDate");
		model.addColumn("ApprovalDate");
		
//		add hang vao		
//		var dao = new LeaveRequestsDao();
//		dao.getListStu().stream().forEach(
//				lr -> model.addRow(new Object[] {
//						
//					lr.getRequestID(),lr.getEmployeeID(),lr.getLeaveType(),lr.getStartDate(),lr.getEndDate(),lr.getReason(),lr.getStatus(),lr.getApproverID(),lr.getSubmissionDatel()
//				})
//				);
////		
//		tableLR.setModel(model);
	}
}
