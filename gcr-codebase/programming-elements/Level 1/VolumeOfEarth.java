public class VolumeOfEarth{
	public static void main(String[] args){
		// initializing radius of the earth
		double radiusInKilometers = 6378;
		
		// finding the volume in kilometers
		double volumeInKilometerCube = (4.0/3.0) * Math.PI * (radiusInKilometers * radiusInKilometers * radiusInKilometers);
		// finding the radius in miles
		double radiusInMiles = 0.6213 * radiusInKilometers;
		// finding the volume in miles
		double volumeInMilesCube = (4.0/3.0) * Math.PI * (radiusInMiles * radiusInMiles * radiusInMiles);
		
		// printing results
		System.out.println("The volume of earth in cubic kilometers is " + volumeInKilometerCube + " and cubic miles is " + volumeInMilesCube);
		
	}
}