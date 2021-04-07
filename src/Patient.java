
public class Patient extends Person {
	private Disease disease;

	Patient() {
		disease = new Disease();
	}
	
	public Disease getDisease() {
		return disease;
	}

	@Override
	public String toString() {
		return "Id " + getId() + ", name " + getName() + ", age " + getAge() + ", has "
				+ disease.getDiseaseDescription() + " and will be cured in approximately in " + disease.getTimeToCure()
				+ " days";
	}
}
