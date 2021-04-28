public class Room {
	private static final int NUM__OF_PATIENT= 5; 
	private int roomNumber;
	private Doctor doctor;
	private Nurse nurse;
	private Patient[] patients = new Patient[NUM__OF_PATIENT];

	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public Nurse getNurse() {
		return nurse;
	}

	public void setNurse(Nurse nurse) {
		this.nurse = nurse;
	}

	
	public Patient[] getPatients() {
		return patients;
	}

	public void setPatients(Patient[] patients) {
		this.patients = patients;
	}

	@Override
	public String toString() {
		return "room number " + roomNumber + "\r\n" + "doctor details: " + doctor.toString() + "\r\n"
				+ "nurse details: " + nurse.toString() + "\r\n" + "patients detail:" + patientsDetail();
	}

	private String patientsDetail() {
		String details = "\r\n";
		for (int i = 0; i < patients.length; i++) {
			details += patients[i].toString() + "\r\n";
		}
		return details;
	}
}
