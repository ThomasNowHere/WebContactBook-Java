package myPackage.Model;

public class AddressModel {
	private int id;
	private int sex_id,country_id, city_id ,address_id;
	private String first_name, last_name, gender, phone, email, city_name,zip_code,street,street_no,country_name, alpha2, alpha3;
	
	public AddressModel(){
		
	}

	public AddressModel(int id, String first_name, String last_name, String gender ,String phone, String email, String city_name
			,String zip_code, String street, String street_no,
			String country_name, String alpha2, String alpha3,
			int sex_id, int country_id, int city_id, int address_id) {
		super();
		this.id = id;
		this.first_name = first_name;
		this.last_name=last_name;
		this.gender = gender;
		this.phone=phone;
		this.email=email;
		this.city_name=city_name;
		this.zip_code=zip_code;
		this.street = street;
		this.street_no = street_no;
		this.country_name=country_name;
		this.alpha2=alpha2;
		this.alpha3=alpha3;
		this.sex_id=sex_id;
		this.country_id=country_id;
		this.city_id=city_id;
		this.address_id = address_id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCity_name() {
		return city_name;
	}

	public void setCity_name(String city_name) {
		this.city_name = city_name;
	}

	public String getZip_code() {
		return zip_code;
	}

	public void setZip_code(String zip_code) {
		this.zip_code = zip_code;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getStreet_no() {
		return street_no;
	}

	public void setStreet_no(String street_no) {
		this.street_no = street_no;
	}

	public String getCountry_name() {
		return country_name;
	}

	public void setCountry_name(String country_name) {
		this.country_name = country_name;
	}

	public String getAlpha2() {
		return alpha2;
	}

	public void setAlpha2(String alpha2) {
		this.alpha2 = alpha2;
	}

	public String getAlpha3() {
		return alpha3;
	}

	public void setAlpha3(String alpha3) {
		this.alpha3 = alpha3;
	}

	public int getSex_id() {
		return sex_id;
	}

	public void setSex_id(int sex_id) {
		this.sex_id = sex_id;
	}

	public int getCountry_id() {
		return country_id;
	}

	public void setCountry_id(int country_id) {
		this.country_id = country_id;
	}

	public int getCity_id() {
		return city_id;
	}

	public void setCity_id(int city_id) {
		this.city_id = city_id;
	}

	public int getAddress_id() {
		return address_id;
	}

	public void setAddress_id(int address_id) {
		this.address_id = address_id;
	}

    
}
