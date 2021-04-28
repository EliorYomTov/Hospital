
public class Doctor extends Person {
	private DiseaseDescription diseaseSpecialty;
	private int roomNumber;

	Doctor() {
		diseaseSpecialty = DiseaseDescription.getRandomDisease();
	}

	public DiseaseDescription getDiseaseSpecialty() {
		return diseaseSpecialty;
	}

	public int count() {
		return 1;
	}

	public int getRoomNumber() {
		return roomNumber;
	}
	
	
	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	@Override
	public String toString() {
		return "id " + getId() + ", name " + getName() + ", age " + getAge() + ", specialist to cure "
				+ diseaseSpecialty.name() + " and belong to room " + roomNumber;
	}
}
