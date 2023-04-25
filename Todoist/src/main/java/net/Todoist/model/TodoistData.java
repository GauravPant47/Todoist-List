package net.Todoist.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "todoist")
public class TodoistData {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "task_number")
	private int taskNumber;

	@Column(name = "task_tital")
	private String taskTital;

	@Column(name = "add_Task")
	private String addTask;

	@Column(name = "status")
	private String status;

	public TodoistData() {

	}

	public TodoistData(String taskTital, String addTask, String status) {
		super();
		this.taskTital = taskTital;
		this.addTask = addTask;
		this.status = status;
	}

	public int getTaskNumber() {
		return taskNumber;
	}

	public void setTaskNumber(int taskNumber) {
		this.taskNumber = taskNumber;
	}

	public String getTaskTital() {
		return taskTital;
	}

	public void setTaskTital(String taskTital) {
		this.taskTital = taskTital;
	}

	public String getAddTask() {
		return addTask;
	}

	public void setAddTask(String addTask) {
		this.addTask = addTask;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
