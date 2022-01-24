package testPrograms;

interface FirtstInterface {

	void data();
	 static int vehicle_price = 150000;

	static String manufactInfo(int manID, String manLoc) {

		String manIDLoc = manID + manLoc;
		return manIDLoc;

	}

	default String delearInfo(int delId, String delLoc) {

		String delIdLoc = delId + delLoc;
		return delIdLoc;

	}

	abstract void vehic();
	
	void vechicleEngine(int enNo, int chasNo);

	void vechicleModel(int ModNo, int ModYr);

	void vechicleCap(int vehwt, int vehcap);
}

class NewClass implements FirtstInterface {
	
	

	public void vechicleEngine(int enNo, int chasNo) {

		System.out.println("Vehicle Engine No:" + enNo);
		System.out.println("Vehicle Chasis No:" + chasNo);
		
		@SuppressWarnings("unused")
		int vehicle_price=10;

	}

	public void vechicleModel(int ModNo, int ModYr) {

		System.out.println("Vehicle Model No:" + ModNo);
		System.out.println("Vehicle Model Year: " + ModYr);
	}

	public void vechicleCap(int vehwt, int vehcap) {

		System.out.println("Vehichle Weight" + vehwt);
		System.out.println("Vehichle capacity" + vehcap);
	}

	public static void main(String args[]) {

		NewClass obj = new NewClass();
		obj.vechicleCap(110, 3);
		System.out.println(obj.delearInfo(94, "CHN"));
		obj.vechicleEngine(1899, 100);
		obj.vechicleModel(92021, 2021);
		System.out.println(FirtstInterface.vehicle_price);
	}

	@Override
	public void vehic() {
		// TODO Auto-generated method stub
		
	}

}
