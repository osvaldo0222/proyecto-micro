package logical;

import java.util.Date;

public class Contract {
	private String id;
	private Date dateBegin;
	private Date dueDate;
	private Date finalDate;
	private String idClient;
	private Project project;
	private float price;
	
	public Contract(String id, Date dateBegin, Date dueDate, Date finalDate, String idClient, Project project, float price) {
		super();
		this.id = id;
		this.dateBegin = dateBegin;
		this.dueDate = dueDate;
		this.finalDate = finalDate;
		this.idClient = idClient;
		this.project = project;
		this.price = price;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getDateBegin() {
		return dateBegin;
	}

	public void setDateBegin(Date dateBegin) {
		this.dateBegin = dateBegin;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public String getIdClient() {
		return idClient;
	}

	public void setIdClient(String idClient) {
		this.idClient = idClient;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public Date getFinalDate() {
		return finalDate;
	}

	public void setFinalDate(Date finalDate) {
		this.finalDate = finalDate;
	}
}
