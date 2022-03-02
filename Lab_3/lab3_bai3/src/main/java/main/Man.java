package main;

import java.util.Date;

import org.apache.catalina.tribes.util.Arrays;

public class Man {
private String fullname;
private Date ngaysinh;
private String image;
private boolean gender;
private String country;
private boolean married;
private String[] hobbie;
private String note;

public Man() {
	super();
 Arrays.toString(hobbie);
}
public Man(String fullname, Date ngaysinh,String image, boolean gender, String country, boolean married, String[] hobbie,
		String note) {
	super();
	this.fullname = fullname;
	this.ngaysinh = ngaysinh;
	this.image=image;
	this.gender = gender;
	this.country = country;
	this.married = married;
	this.hobbie = hobbie;
	this.note = note;
}
public String getFullname() {
	return fullname;
}
public String getImage() {
	return image;
}
public void setImage(String image) {
	this.image=image;
}
public void setFullname(String fullname) {
	this.fullname = fullname;
}
public Date getNgaysinh() {
	return ngaysinh;
}
public void setNgaysinh(Date ngaysinh) {
	this.ngaysinh = ngaysinh;
}
public boolean isGender() {
	return gender;
}
public void setGender(boolean gender) {
	this.gender = gender;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
public boolean isMarried() {
	return married;
}
public void setMarried(boolean married) {
	this.married = married;
}
public String[] getHobbie() {
	return hobbie;
}
public void setHobbie(String[] hobbie) {
	this.hobbie = hobbie;
}
public String getNote() {
	return note;
}
public void setNote(String note) {
	this.note = note;
}


}
