package FirstSteps.Model;

public class Targi {
	private String name, lastname, company, email, size, day, d1, d2, d3, type, material, transport, catering;
	
	public Targi() {};
	
	public Targi(String name, String lastname, String company, String email, String size, String type, String day, String extras, String d1, String d2, String d3, String material, String transport, String catering) {
		this.name = name;
		this.lastname = lastname;
		this.company = company;
		this.email = email;
		this.size = size;
		this.type = type;
		this.day = type;
		this.d1 = d1;
		this.d2 = d2;
		this.d3 = d3;
		this.material = material;
		this.transport = transport;
		this.catering = catering;
	}
	
	public void validate() {
		if (name.equals(null) || lastname.equals(null) || company.equals(null) || email.equals(null)) {
			
		}
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public String getD1() {
		return d1;
	}

	public void setD1(String d1) {
		this.d1 = d1;
	}

	public String getD2() {
		return d2;
	}

	public void setD2(String d2) {
		this.d2 = d2;
	}

	public String getD3() {
		return d3;
	}

	public void setD3(String d3) {
		this.d3 = d3;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getTransport() {
		return transport;
	}

	public void setTransport(String transport) {
		this.transport = transport;
	}

	public String getCatering() {
		return catering;
	}

	public void setCatering(String catering) {
		this.catering = catering;
	}

	
	
	
}
