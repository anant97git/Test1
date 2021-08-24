package org.hibernate;
// Generated Aug 6, 2021, 12:56:23 PM by Hibernate Tools 5.4.30.Final

/**
 * Patient generated by hbm2java
 */
public class Patient implements java.io.Serializable {

	private int patientId;
	private String address;
	private int age;
	private String disease;
	private String patientName;
	private String payment;
	private Integer doctorDoctorId;

	public Patient() {
	}

	public Patient(int patientId, int age) {
		this.patientId = patientId;
		this.age = age;
	}

	public Patient(int patientId, String address, int age, String disease, String patientName, String payment,
			Integer doctorDoctorId) {
		this.patientId = patientId;
		this.address = address;
		this.age = age;
		this.disease = disease;
		this.patientName = patientName;
		this.payment = payment;
		this.doctorDoctorId = doctorDoctorId;
	}

	public int getPatientId() {
		return this.patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDisease() {
		return this.disease;
	}

	public void setDisease(String disease) {
		this.disease = disease;
	}

	public String getPatientName() {
		return this.patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getPayment() {
		return this.payment;
	}

	public void setPayment(String payment) {
		this.payment = payment;
	}

	public Integer getDoctorDoctorId() {
		return this.doctorDoctorId;
	}

	public void setDoctorDoctorId(Integer doctorDoctorId) {
		this.doctorDoctorId = doctorDoctorId;
	}

}