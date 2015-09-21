package fr.polytech.todo;

public class Todo {
	
	private long id;
	private String name;
	private String description;
	

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "[" + id + "] " + name + " : "
				+ description;
	}
	
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
	public Todo(long id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}

	public static void main(String args[]){
		Todo t = new Todo(12,"aller a carrefour","acheter du poisson");
		System.out.println(t.toString());
	}
}
