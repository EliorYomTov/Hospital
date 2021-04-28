import java.util.ArrayList;
import java.util.List;

public class NurseUtils {
	private static final int NUM_OF_ROOM = 10;

	public static List<Nurse> generateRoomNumber(int size) {
		List<Nurse> nurses = new ArrayList<>();
		int[] roomNumber;
		for (int i = 0; i < size; i++) {
			Nurse nurse = new Nurse();
			if (nurse.getRoomNumber().length == 2) {
				do {
					roomNumber = new int[2];
					roomNumber[0] = Utils.generateRandom(i + 1, NUM_OF_ROOM);
					roomNumber[1] = Utils.generateRandom(i + 2, NUM_OF_ROOM);
				} while (roomNumber[0] == roomNumber[1]);
			} else {
				roomNumber = new int[1];
				roomNumber[0] = 1 + Utils.generateRandom(i + 1, NUM_OF_ROOM);
			}
			nurse.setRoomNumber(roomNumber);
			nurses.add(i, nurse);
		}
		return nurses;
	}

}
