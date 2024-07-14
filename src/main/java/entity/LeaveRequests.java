package entity;

import java.util.Date;

public class LeaveRequests {
	private int RequestID ;
	private int EmployeeID; 
	private String LeaveType; 
	private Date StartDate;
	private Date EndDate;
	private String Reason; 
	private String Status; 
	private int ApproverID;
	private Date SubmissionDatel;
	
	public LeaveRequests() {}
	
	public LeaveRequests(int requestID, int employeeID, String leaveType, Date startDate, Date endDate, String reason,
			String status, int approverID, Date submissionDatel) {
		super();
		RequestID = requestID;
		EmployeeID = employeeID;
		LeaveType = leaveType;
		StartDate = startDate;
		EndDate = endDate;
		Reason = reason;
		Status = status;
		ApproverID = approverID;
		SubmissionDatel = submissionDatel;
	}

	public int getRequestID() {
		return RequestID;
	}

	public void setRequestID(int requestID) {
		RequestID = requestID;
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

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	public int getApproverID() {
		return ApproverID;
	}

	public void setApproverID(int approverID) {
		ApproverID = approverID;
	}

	public Date getSubmissionDatel() {
		return SubmissionDatel;
	}

	public void setSubmissionDatel(Date submissionDatel) {
		SubmissionDatel = submissionDatel;
	}

	@Override
	public String toString() {
		return "LeaveRequests [RequestID=" + RequestID + ", EmployeeID=" + EmployeeID + ", LeaveType=" + LeaveType
				+ ", StartDate=" + StartDate + ", EndDate=" + EndDate + ", Reason=" + Reason + ", Status=" + Status
				+ ", ApproverID=" + ApproverID + ", SubmissionDatel=" + SubmissionDatel + "]";
	}
	
	
}
