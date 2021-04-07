public class Run {
	public static void main(String[] args) {
		PrintUtils.wellcome();
		Hospital hospital = new Hospital("Ichilov Hospital");
		PrintUtils.showHospitalDetails(hospital);
		PrintUtils.showHospitalStatistics(hospital);
	}
}
