import java.util.Arrays;

public class Nurse extends Person {
	private static final int MIN_ROOM = 1;
	private static final int MAX_ROOM = 2;
	private int[] roomNumber;

	Nurse() {
		roomNumber = new int[Utils.generateRandom(MIN_ROOM, MAX_ROOM + 1)];	
	}

	public int[] getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int[] roomNumber) {
		this.roomNumber = roomNumber;
	}

	@Override
	public String toString() {
		return "id " + getId() + ", name " + getName() + ", age " + getAge() + ", belong to room number "
				+ Arrays.toString(roomNumber);
	}

	public int count() {
		return 1;
	}
}
