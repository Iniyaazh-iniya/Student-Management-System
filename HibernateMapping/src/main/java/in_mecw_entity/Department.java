package in_mecw_entity;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="department")
public class Department {
	@Id
	@Column(name="dept_id")
	
private int departmentId;
	@Column(name="dept_name",unique=true,nullable=false)
private String departmentName;
private String location;
@OneToMany(mappedBy = "dept",cascade=CascadeType.ALL)

private List<Course>courses;

public List<Course> getCourses() {
	return courses;
}
public void setCourses(List<Course> courses) {
	this.courses = courses;
}
public int getDepartmentId() {
	return departmentId;
}
public void setDepartmentId(int departmentId) {
	this.departmentId = departmentId;
}
public String getDepartmentName() {
	return departmentName;
}
public void setDepartmentName(String departmentName) {
	this.departmentName = departmentName;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) { 
	this.location = location;
}


}
