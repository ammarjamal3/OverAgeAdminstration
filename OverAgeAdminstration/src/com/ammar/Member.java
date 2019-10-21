package com.ammar;

public class Member {

	private int id;
	private   String  fname;
	private   String  lname;
	private   int  age;
	private   String department;
	private   String date_of_birth;
	private   String gender;
	private   String education;
	private   String experience;
	private   String date_of_join;
	private   String nationality;
	private   String mother_language;
	private   String other_language;
	private   String family_email;
	private   Long family_phone;
	private   String chronic_diseases;
	private   String other_diseases;
	private   String special_needs;
	private   String admin;
	private   String Modify_By; 



	public Member() {
		super();

	}

public Member(int id, String fname, String lname, int age, String department,
String date_of_birth, String gender, String education, String experience,
String nationality,String mother_language,String other_language,
Long family_phone,String family_email,
String date_of_join,String special_needs,String chronic_diseases,
String other_diseases,String admin,String Modify_By) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.age = age;
		this.department = department;
		this.date_of_birth = date_of_birth;
		this.gender = gender;
		this.education = education;
		this.experience = experience;
		this.date_of_join=date_of_join;
		this.nationality = nationality;
		this.mother_language = mother_language;
		this.other_language = other_language;
		this.family_email=family_email;
		this.family_phone=family_phone;
		this.chronic_diseases=chronic_diseases;
		this.other_diseases=other_diseases;
		this.special_needs=special_needs;
		this.admin=admin;
		this.Modify_By=Modify_By;
	}
	

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getFname() {
	return fname;
}

public void setFname(String fname) {
	this.fname = fname;
}

public String getLname() {
	return lname;
}

public void setLname(String lname) {
	this.lname = lname;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public String getDepartment() {
	return department;
}

public void setDepartment(String department) {
	this.department = department;
}

public String getDate_of_birth() {
	return date_of_birth;
}

public void setDate_of_birth(String date_of_birth) {
	this.date_of_birth = date_of_birth;
}

public String getGender() {
	return gender;
}

public void setGender(String gender) {
	this.gender = gender;
}

public String getEducation() {
	return education;
}

public void setEducation(String education) {
	this.education = education;
}

public String getExperience() {
	return experience;
}

public void setExperience(String experience) {
	this.experience = experience;
}

public String getDate_of_join() {
	return date_of_join;
}

public void setDate_of_join(String date_of_join) {
	this.date_of_join = date_of_join;
}

public String getNationality() {
	return nationality;
}

public void setNationality(String nationality) {
	this.nationality = nationality;
}

public String getMother_language() {
	return mother_language;
}

public void setMother_language(String mother_language) {
	this.mother_language = mother_language;
}

public String getOther_language() {
	return other_language;
}

public void setOther_language(String other_language) {
	this.other_language = other_language;
}

public String getFamily_email() {
	return family_email;
}

public void setFamily_email(String family_email) {
	this.family_email = family_email;
}

public Long getFamily_phone() {
	return family_phone;
}

public void setFamily_phone(Long family_phone) {
	this.family_phone = family_phone;
}


public String getChronic_diseases() {
	return chronic_diseases;
}

public void setChronic_diseases(String chronic_diseases) {
	this.chronic_diseases = chronic_diseases;
}

public String getOther_diseases() {
	return other_diseases;
}

public void setOther_diseases(String other_diseases) {
	this.other_diseases = other_diseases;
}

public String getSpecial_needs() {
	return special_needs;
}

public void setSpecial_needs(String special_needs) {
	this.special_needs = special_needs;
}

public String getAdmin() {
	return admin;
}

public void setAdmin(String admin) {
	this.admin = admin;
}

public String getModify_By() {
	return Modify_By;
}

public void setModify_By(String modify_By) {
	Modify_By = modify_By;
}
	
	
}
