package testPrograms;

public class ClassusingInterface {

	public void vechicleEngine(int enNo, int chasNo) {

		System.out.println("Vehicle Engine No:" + enNo);
		System.out.println("Vehicle Chasis No:" + chasNo);

		@SuppressWarnings("unused")
		int vehicle_price = 10;

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
		obj.vechicleCap(110,3);
		System.out.println(obj.delearInfo(94,"CHN"));
		obj.vechicleEngine(1899,100);
		obj.vechicleModel(92021,2021);
		System.out.println(obj.vehicle_price);
	}

}
