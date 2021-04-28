import java.util.Random;

public enum DiseaseDescription {
	TUBERCULOSIS, PNEUMONIA, COVID19, FRACTURE, CARDIO;

	private DiseaseDescription() {
	}

	public static DiseaseDescription getRandomDisease() {
		Random random = new Random();
		return values()[random.nextInt(values().length)];
	}

	public static int getSize() {
		return DiseaseDescription.values().length;
	}
}