
public class Disease {
	private static final int MIN_DAY = 3;
	private static final int MAX_DAY = 21;
	private DiseaseDescription diseaseDescription;
	private int timeToCure;

	Disease() {
		timeToCure = Utils.generateRandom(MIN_DAY, MAX_DAY);
		diseaseDescription = DiseaseDescription.getRandomDisease();
	}

	public DiseaseDescription getDiseaseDescription() {
		return diseaseDescription;
	}

	public int getTimeToCure() {
		return timeToCure;
	}

	@Override
	public String toString() {
		return "Disease Description: " + diseaseDescription + ", Time To Cure: " + timeToCure + " days";
	}

}
