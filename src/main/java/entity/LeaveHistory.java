package entity;

import java.util.Date;

public class LeaveHistory {
	private int HistoryID; 
	private int EmployeeID; 
	private String LeaveType;
	private Date StartDate;
	private Date EndDate; 
	private String Reason; 
	private String ApprovalStatus;
	private int ApproverID;
	private int SubmissionDate;
	private Date ApprovalDate;
	
	public LeaveHistory() {}
	
	public LeaveHistory(int historyID, int employeeID, String leaveType, Date startDate, Date endDate, String reason,
			String approvalStatus, int approverID, int submissionDate, Date approvalDate) {
		super();
		HistoryID = historyID;
		EmployeeID = employeeID;
		LeaveType = leaveType;
		StartDate = startDate;
		EndDate = endDate;
		Reason = reason;
		ApprovalStatus = approvalStatus;
		ApproverID = approverID;
		SubmissionDate = submissionDate;
		ApprovalDate = approvalDate;
	}

	public int getHistoryID() {
		return HistoryID;
	}

	public void setHistoryID(int historyID) {
		HistoryID = historyID;
	}

	public int getEmployeeID() {
		return EmployeeID;
	}

	public void setEmployeeID(int employeeID) {
		EmployeeID = employeeID;
	}

	public String getLeaveType() {
		return LeaveType;
	}

	public void setLeaveType(String leaveType) {
		LeaveType = leaveType;
	}

	public Date getStartDate() {
		return StartDate;
	}

	public void setStartDate(Date startDate) {
		StartDate = startDate;
	}

	public Date getEndDate() {
		return EndDate;
	}

	public void setEndDate(Date endDate) {
		EndDate = endDate;
	}

	public String getReason() {
		return Reason;
	}

	public void setReason(String reason) {
		Reason = reason;
	}

	public String getApprovalStatus() {
		return ApprovalStatus;
	}

	public void setApprovalStatus(String approvalStatus) {
		ApprovalStatus = approvalStatus;
	}

	public int getApproverID() {
		return ApproverID;
	}

	public void setApproverID(int approverID) {
		ApproverID = approverID;
	}

	public int getSubmissionDate() {
		return SubmissionDate;
	}

	public void setSubmissionDate(int submissionDate) {
		SubmissionDate = submissionDate;
	}

	public Date getApprovalDate() {
		return ApprovalDate;
	}

	public void setApprovalDate(Date approvalDate) {
		ApprovalDate = approvalDate;
	}

	@Override
	public String toString() {
		return "LeaveHistory [HistoryID=" + HistoryID + ", EmployeeID=" + EmployeeID + ", LeaveType=" + LeaveType
				+ ", StartDate=" + StartDate + ", EndDate=" + EndDate + ", Reason=" + Reason + ", ApprovalStatus="
				+ ApprovalStatus + ", ApproverID=" + ApproverID + ", SubmissionDate=" + SubmissionDate
				+ ", ApprovalDate=" + ApprovalDate + "]";
	} 
	
	
}
