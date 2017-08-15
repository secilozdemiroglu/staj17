package Controller;

import java.sql.Date;

public class ProblemsController extends Contoller {

	int MarkID;
	String problem;
	Date date;

	public int getMarkID() {
		return MarkID;
	}

	public void setMarkID(int markID) {
		MarkID = markID;
	}

	public String getProblem() {
		return problem;
	}

	public void setProblem(String problem) {
		this.problem = problem;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
