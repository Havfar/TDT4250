package tdt4250.Assignment2.common;


public class DepartmentGeneratorHelper {
	
	public String translateSeasonToNorwegian(String season) {
		if(season.equalsIgnoreCase("Fall")) {
			return "Høst";
		}else {
			return "Vår";
		}
	}
}
