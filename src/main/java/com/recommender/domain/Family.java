package com.recommender.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "family_details")
public class Family {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long ID;
	
	private String firstname;
	private String middlename;
	private String lastname;
	private String gender;
	private String maritalStatus;
	private String mobile;
	private String mosad;
	private String tel_code;
	private String tel_no;
	private String dob;
	private int age;
	private String birthtime;
	private String birthtime1;
	private String birthplace;
	private String education;
	private String profession;
	private String email;
	private String remarks;
	private String bloodgroup;
	private String addr;
	private String addr_city;
	private String addr_pincode;
	private String addr_state;
	private String addr_country;
	private String company;
	private String designation;
	private String height_feet;
	private String height_inch;
	private String weight;

	public Family() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Family(String firstname, String middlename, String lastname, String gender, String maritalStatus,
			String mobile, String mosad, String tel_code, String tel_no, String dob, int age, String birthtime,
			String birthtime1, String birthplace, String education, String profession, String email, String remarks,
			String bloodgroup, String addr, String addr_city, String addr_pincode, String addr_state,
			String addr_country, String company, String designation, String height_feet, String height_inch,
			String weight) {
		super();
		this.firstname = firstname;
		this.middlename = middlename;
		this.lastname = lastname;
		this.gender = gender;
		this.maritalStatus = maritalStatus;
		this.mobile = mobile;
		this.mosad = mosad;
		this.tel_code = tel_code;
		this.tel_no = tel_no;
		this.dob = dob;
		this.age = age;
		this.birthtime = birthtime;
		this.birthtime1 = birthtime1;
		this.birthplace = birthplace;
		this.education = education;
		this.profession = profession;
		this.email = email;
		this.remarks = remarks;
		this.bloodgroup = bloodgroup;
		this.addr = addr;
		this.addr_city = addr_city;
		this.addr_pincode = addr_pincode;
		this.addr_state = addr_state;
		this.addr_country = addr_country;
		this.company = company;
		this.designation = designation;
		this.height_feet = height_feet;
		this.height_inch = height_inch;
		this.weight = weight;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getMiddlename() {
		return middlename;
	}

	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getMosad() {
		return mosad;
	}

	public void setMosad(String mosad) {
		this.mosad = mosad;
	}

	public String getTel_code() {
		return tel_code;
	}

	public void setTel_code(String tel_code) {
		this.tel_code = tel_code;
	}

	public String getTel_no() {
		return tel_no;
	}

	public void setTel_no(String tel_no) {
		this.tel_no = tel_no;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getBirthtime() {
		return birthtime;
	}

	public void setBirthtime(String birthtime) {
		this.birthtime = birthtime;
	}

	public String getBirthtime1() {
		return birthtime1;
	}

	public void setBirthtime1(String birthtime1) {
		this.birthtime1 = birthtime1;
	}

	public String getBirthplace() {
		return birthplace;
	}

	public void setBirthplace(String birthplace) {
		this.birthplace = birthplace;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getBloodgroup() {
		return bloodgroup;
	}

	public void setBloodgroup(String bloodgroup) {
		this.bloodgroup = bloodgroup;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getAddr_city() {
		return addr_city;
	}

	public void setAddr_city(String addr_city) {
		this.addr_city = addr_city;
	}

	public String getAddr_pincode() {
		return addr_pincode;
	}

	public void setAddr_pincode(String addr_pincode) {
		this.addr_pincode = addr_pincode;
	}

	public String getAddr_state() {
		return addr_state;
	}

	public void setAddr_state(String addr_state) {
		this.addr_state = addr_state;
	}

	public String getAddr_country() {
		return addr_country;
	}

	public void setAddr_country(String addr_country) {
		this.addr_country = addr_country;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getHeight_feet() {
		return height_feet;
	}

	public void setHeight_feet(String height_feet) {
		this.height_feet = height_feet;
	}

	public String getHeight_inch() {
		return height_inch;
	}

	public void setHeight_inch(String height_inch) {
		this.height_inch = height_inch;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Family [ID=" + ID + ", firstname=" + firstname + ", middlename=" + middlename + ", lastname=" + lastname
				+ ", gender=" + gender + ", maritalStatus=" + maritalStatus + ", mobile=" + mobile + ", mosad=" + mosad
				+ ", tel_code=" + tel_code + ", tel_no=" + tel_no + ", dob=" + dob + ", age=" + age + ", birthtime="
				+ birthtime + ", birthtime1=" + birthtime1 + ", birthplace=" + birthplace + ", education=" + education
				+ ", profession=" + profession + ", email=" + email + ", remarks=" + remarks + ", bloodgroup="
				+ bloodgroup + ", addr=" + addr + ", addr_city=" + addr_city + ", addr_pincode=" + addr_pincode
				+ ", addr_state=" + addr_state + ", addr_country=" + addr_country + ", company=" + company
				+ ", designation=" + designation + ", height_feet=" + height_feet + ", height_inch=" + height_inch
				+ ", weight=" + weight + "]";
	}
}
