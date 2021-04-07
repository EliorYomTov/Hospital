import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HospitalStatistics {
	public static void numOfPerson(Hospital hospital) {
		int countPatient = 0, conutDoctors = 0, countNurses = 0;
		for (int i = 0; i < hospital.getRooms().length; i++) {
			countPatient += hospital.getRooms()[i].getPatients().length;
			conutDoctors += hospital.getRooms()[i].getDoctor().count();
			countNurses += hospital.getRooms()[i].getNurse().count();
		}
		System.out.println("Number of patients: " + countPatient);
		System.out.println("Number of nurses: " + countNurses);
		System.out.println("Number of doctors: " + conutDoctors + "\r\n");
	}

	public static void avgRecoveryTimeFromAllDiseases(Hospital hospital) {
		int countPatient = 0;
		double avgRecovery = 0;
		for (int i = 0; i < hospital.getRooms().length; i++) {
			countPatient += hospital.getRooms()[i].getPatients().length;
			for (int j = 0; j < hospital.getRooms()[i].getPatients().length; j++) {
				avgRecovery += hospital.getRooms()[i].getPatients()[j].getDisease().getTimeToCure();
			}
		}
		System.out.println(
				String.format("Average recovery time from all diseases %.2f days \r\n", avgRecovery /= countPatient));
	}

	public static void avgRecoveryTimeForEachDisease(Hospital hospital) {
		int countPatient = 0;
		double countTUBERCULOSIS = 0, countPNEUMONIA = 0, countCOVID19 = 0, countFRACTURE = 0, countCARDIO = 0;
		for (int i = 0; i < hospital.getRooms().length; i++) {
			countPatient += hospital.getRooms()[i].getPatients().length;
			for (int j = 0; j < hospital.getRooms()[i].getPatients().length; j++) {
				switch (hospital.getRooms()[i].getPatients()[j].getDisease().getDiseaseDescription().name()) {
				case "TUBERCULOSIS":
					countTUBERCULOSIS += hospital.getRooms()[i].getPatients()[j].getDisease().getTimeToCure();
					break;
				case "PNEUMONIA":
					countPNEUMONIA += hospital.getRooms()[i].getPatients()[j].getDisease().getTimeToCure();
					break;
				case "COVID19":
					countCOVID19 += hospital.getRooms()[i].getPatients()[j].getDisease().getTimeToCure();
					break;
				case "FRACTURE":
					countFRACTURE += hospital.getRooms()[i].getPatients()[j].getDisease().getTimeToCure();
					break;
				case "CARDIO":
					countCARDIO += hospital.getRooms()[i].getPatients()[j].getDisease().getTimeToCure();
					break;
				}
			}
		}
		System.out.println(String.format("Average recovery time from TUBERCULOSIS is %.2f days",
				countTUBERCULOSIS /= countPatient));
		System.out.println(
				String.format("Average recovery time from PNEUMONIA is %.2f days", countPNEUMONIA /= countPatient));
		System.out.println(
				String.format("Average recovery time from COVID19 is %.2f days", countCOVID19 /= countPatient));
		System.out.println(
				String.format("Average recovery time from FRACTURE is %.2f days", countFRACTURE /= countPatient));
		System.out.println(
				String.format("Average recovery time from CARDIO is %.2f days \r\n", countCARDIO /= countPatient));
	}

	public static void avgPatientAgesPerDepartment(Hospital hospital) {
		int countPatient = 0;
		double countTUBERCULOSIS = 0, countPNEUMONIA = 0, countCOVID19 = 0, countFRACTURE = 0, countCARDIO = 0;
		for (int i = 0; i < hospital.getRooms().length; i++) {
			countPatient += hospital.getRooms()[i].getPatients().length;
			for (int j = 0; j < hospital.getRooms()[i].getPatients().length; j++) {
				switch (hospital.getRooms()[i].getPatients()[j].getDisease().getDiseaseDescription().name()) {
				case "TUBERCULOSIS":
					countTUBERCULOSIS += hospital.getRooms()[i].getPatients()[j].getAge();
					break;
				case "PNEUMONIA":
					countPNEUMONIA += hospital.getRooms()[i].getPatients()[j].getAge();
					break;
				case "COVID19":
					countCOVID19 += hospital.getRooms()[i].getPatients()[j].getAge();
					break;
				case "FRACTURE":
					countFRACTURE += hospital.getRooms()[i].getPatients()[j].getAge();
					break;
				case "CARDIO":
					countCARDIO += hospital.getRooms()[i].getPatients()[j].getAge();
					break;
				}
			}
		}
		System.out.println(String.format("The average age for the TUBERCULOSIS department is %.2f",
				countTUBERCULOSIS /= countPatient));
		System.out.println(
				String.format("The average age for the PNEUMONIA department is %.2f", countPNEUMONIA /= countPatient));
		System.out.println(
				String.format("The average age for the COVID19 department is %.2f", countCOVID19 /= countPatient));
		System.out.println(
				String.format("The average age for the FRACTURE department is %.2f", countFRACTURE /= countPatient));
		System.out.println(
				String.format("The average age for the CARDIO department is %.2f \r\n", countCARDIO /= countPatient));
	}

	public static void MostCommonDisease(Hospital hospital) {
		getMostCommonAndUncommon(hospital, "mostCommon");
	}

	public static void MostUncommonDisease(Hospital hospital) {
		getMostCommonAndUncommon(hospital, "mostUncommon");
	}

	public static void avgDoctorsAndNurses(Hospital hospital) {
		int avgDoctors = 0, avgNurses = 0, size = hospital.getRooms().length;
		for (int i = 0; i < size; i++) {
			avgDoctors += hospital.getRooms()[i].getDoctor().getAge();
			avgNurses += hospital.getRooms()[i].getNurse().getAge();
		}
		System.out.println(String.format("The average age of the doctors is %s \r\n", avgDoctors /= size));
		System.out.println(String.format("The average age of the nurses is %s \r\n", avgNurses /= size));
	}

	private static void getMostCommonAndUncommon(Hospital hospital, String s) {
		int countTUBERCULOSIS = 0, countPNEUMONIA = 0, countCOVID19 = 0, countFRACTURE = 0, countCARDIO = 0;
		for (int i = 0; i < hospital.getRooms().length; i++) {
			for (int j = 0; j < hospital.getRooms()[i].getPatients().length; j++) {
				switch (hospital.getRooms()[i].getPatients()[j].getDisease().getDiseaseDescription().name()) {
				case "TUBERCULOSIS":
					countTUBERCULOSIS++;
					break;
				case "PNEUMONIA":
					countPNEUMONIA++;
					break;
				case "COVID19":
					countCOVID19++;
					break;
				case "FRACTURE":
					countFRACTURE++;
					break;
				case "CARDIO":
					countCARDIO++;
					break;
				}
			}
		}
		String mostUncommonOrCommon = "";
		int ValueInMap;
		Map<String, Integer> map = new HashMap<>();
		map.put("TUBERCULOSIS", countTUBERCULOSIS);
		map.put("PNEUMONIA", countPNEUMONIA);
		map.put("COVID19", countCOVID19);
		map.put("FRACTURE", countFRACTURE);
		map.put("CARDIO", countCARDIO);
		if (s.equals("mostUncommon")) {
			ValueInMap = (Collections.min(map.values()));
		} else {
			ValueInMap = (Collections.max(map.values()));
		}
		for (Entry<String, Integer> entry : map.entrySet()) {
			if (entry.getValue() == ValueInMap) {
				if (mostUncommonOrCommon != "")
					mostUncommonOrCommon += ", " + entry.getKey();
				else
					mostUncommonOrCommon += entry.getKey();
			}
		}
		if (s.equals("mostUncommon")) {
			System.out.println(
					String.format("The most uncommon disease in the hospital is %s \r\n", mostUncommonOrCommon));
		} else {
			System.out
					.println(String.format("The most common disease in the hospital is %s \r\n", mostUncommonOrCommon));
		}
	}
}
