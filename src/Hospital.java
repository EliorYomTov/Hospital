public class Hospital {
	private static final int NUM_OF_ROOM = 10;
	private Room[] rooms = new Room[NUM_OF_ROOM];
	private String name;

	Hospital(String name) {
		rooms = HospitalFactory.factoryRoom(NUM_OF_ROOM);
		this.name = name;
	}
	
	public Room[] getRooms() {
		return rooms;
	}

	@Override
	public String toString() {
		return "Name: " + name + getHospital();
	}

	private String getHospital() {
		String str = "\r\n\r\n" + "Rooms:" + "\r\n";
		for (int i = 0; i < rooms.length; i++) {
			str += rooms[i].toString();
			str += "\r\n";
		}
		return str;
	}
}
