package ceiTrainingClass;

public class GetterSetterHtml {

	private String studName;
	private String studID;
	private String studDesc;
	private int markinLanguage;
	private int markinEnglish;
	private int markinCommerce;
	private int markinEcnomics;
	private int markinCompScience;
	private int studExamTotal;
	
	public GetterSetterHtml(String studName, String studID, String studDesc, int markinLanguage, int markinEnglish,
			int markinCommerce, int markinEcnomics, int markinCompScience, int studExamTotal) {
		super();
		this.studName = studName;
		this.studID = studID;
		this.studDesc = studDesc;
		this.markinLanguage = markinLanguage;
		this.markinEnglish = markinEnglish;
		this.markinCommerce = markinCommerce;
		this.markinEcnomics = markinEcnomics;
		this.markinCompScience = markinCompScience;
		this.studExamTotal = studExamTotal;
	}

	public String getStudName() {
		return studName;
	}

	public String getStudID() {
		return studID;
	}

	public String getStudDesc() {
		return studDesc;
	}

	public int getMarkinLanguage() {
		return markinLanguage;
	}

	public int getMarkinEnglish() {
		return markinEnglish;
	}

	public int getMarkinCommerce() {
		return markinCommerce;
	}

	public int getMarkinEcnomics() {
		return markinEcnomics;
	}

	public int getMarkinCompScience() {
		return markinCompScience;
	}

	public int getStudExamTotal() {
		return studExamTotal;
	}
	
	
	

}
