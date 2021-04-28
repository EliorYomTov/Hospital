import java.util.ArrayList;
import java.util.List;

public class HospitalFactory {
	private static final int NUM_OF_ROOM = 10;
	private static final int NUM__OF_PATIENT = 5;

	private static Patient[] factoryPatientsArr(int size) {
		Patient[] patients = new Patient[size];
		for (int i = 0; i < size; i++) {
			patients[i] = new Patient();
		}
		return patients;
	}

	private static List<Nurse> factoryNurses(int size) {
		List<Nurse> nurses = NurseUtils.generateRoomNumber(NUM_OF_ROOM);
		return nurses;
	}

	private static List<Doctor> factoryDoctors(int size) {
		List<Doctor> doctors = new ArrayList<>();
		for (int i = 0; i < size; i++) {
			Doctor doctor = new Doctor();
			doctor.setRoomNumber(i + 1);
			doctors.add(i, doctor);
		}
		return doctors;
	}

	public static Room[] factoryRoom(int size) {
		List<Nurse> nurses = new ArrayList<>();
		List<Doctor> doctors = new ArrayList<>();
		Room[] rooms = new Room[NUM_OF_ROOM];
		doctors = factoryDoctors(NUM_OF_ROOM);
		nurses = factoryNurses(NUM_OF_ROOM);

		for (int i = 0; i < NUM_OF_ROOM; i++) {
			Room room = new Room();
			room.setRoomNumber(i + 1);
			room.setPatients(factoryPatientsArr(NUM__OF_PATIENT));
			boolean nurseRoomExists = false;
			for (int j = 0; j < NUM_OF_ROOM; j++) {
				if (nurses.get(j).getRoomNumber().length > 1) {
					if (nurses.get(j).getRoomNumber()[1] == i + 1 || nurses.get(j).getRoomNumber()[0] == i + 1) {
						room.setNurse(nurses.get(j));
						nurseRoomExists = true;
					}
				} else if (nurses.get(j).getRoomNumber()[0] == i + 1) {
					room.setNurse(nurses.get(j));
					nurseRoomExists = true;
				} else if (nurseRoomExists != true) {
					Nurse nurse = new Nurse();
					int[] roomNumber = { i + 1 };
					nurse.setRoomNumber(roomNumber);
					room.setNurse(nurse);
				}
			}
			room.setDoctor(doctors.get(i));
			rooms[i] = room;
		}
		return rooms;
	}

}
