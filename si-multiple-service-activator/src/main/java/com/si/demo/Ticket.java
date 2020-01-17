package com.si.demo;

import java.util.Calendar;

public class Ticket {
	public enum Priority{
		low,
		medium,
		high,
		emergency
	}
	
	private long ticketid;
	private Calendar issueDateTime;
	private String description;
	private Priority priority;
	
	public Ticket() {}

	public long getTicketid() {
		return ticketid;
	}

	public void setTicketid(long ticketid) {
		this.ticketid = ticketid;
	}

	public Calendar getIssueDateTime() {
		return issueDateTime;
	}

	public void setIssueDateTime(Calendar issueDateTime) {
		this.issueDateTime = issueDateTime;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Priority getPriority() {
		return priority;
	}

	public void setPriority(Priority priority) {
		this.priority = priority;
	}

	@Override
	public String toString() {
		return "Ticket [ticketid=" + ticketid + ", issueDateTime=" + issueDateTime + ", description=" + description
				+ ", priority=" + priority + "]";
	}
	
	
}
