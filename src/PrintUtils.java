
public class PrintUtils {
	public static void wellcome() {
		System.out.println(""
				+ " _                     _ _        _ \r\n"
				+ "| |                   (_) |      | |\r\n"
				+ "| |__   ___  ___ _ __  _| |_ __ _| |\r\n"
				+ "| '_ \\ / _ \\/ __| '_ \\| | __/ _` | |\r\n"
				+ "| | | | (_) \\__ \\ |_) | | || (_| | |\r\n"
				+ "|_| |_|\\___/|___/ .__/|_|\\__\\__,_|_|\r\n"
				+ "                | |                 \r\n"
				+ "                |_|   "+"\r\n");
	}
	
	public static void showHospitalDetails(Hospital hospital) {
		System.out.println(hospital);
	}
	
	public static void showHospitalStatistics(Hospital hospital) {
		System.out.println("-#- Hospital Statistics: -#- \r\n");
		HospitalStatistics.numOfPerson(hospital);
		HospitalStatistics.avgRecoveryTimeFromAllDiseases(hospital);
		HospitalStatistics.avgRecoveryTimeForEachDisease(hospital);
		HospitalStatistics.avgPatientAgesPerDepartment(hospital);
		HospitalStatistics.MostCommonDisease(hospital);
		HospitalStatistics.MostUncommonDisease(hospital);
		HospitalStatistics.avgDoctorsAndNurses(hospital);
	}
}
