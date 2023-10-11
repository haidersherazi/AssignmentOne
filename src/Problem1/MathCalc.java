package Problem1;


public class MathCalc {

	static double calculateEarthVolume ( ) {
		double earthRadius = 7600.0/2.0;
		double earthVolume = 0;
			
		// formula 4 pi r^3/3 where r is the radius
		
		earthVolume = (4 * Math.PI * Math.pow(earthRadius,3) ) / 3;
		
		return earthVolume;
	}
	
	static double calculateSunVolume ( ) {
		double sunRadius = 865000.0/2.0;
		double sunVolume = 0;
			     
		// formula 4 pi r^3/3 where r is the radius
		
		sunVolume = (4 * Math.PI * Math.pow(sunRadius,3) ) / 3;
		
		return sunVolume;
	}
	
	static double sunToEarthRatio (double sunVolume, double earthVolume) {
		double ratioVolume = sunVolume/earthVolume;
		
		return ratioVolume;
	}
	
	public static void main(String[] args) {
		
		// (a) the volume of the Earth in cubic miles
		double earthVolume = calculateEarthVolume();
		
		// (b) the volume of the Sun in cubic miles 
		double sunVolume = calculateSunVolume();
		
		// (c) the ratio of the volume of the Sun to the volume of the Earth
		double ratioVolume = sunToEarthRatio(sunVolume, earthVolume);
		
		System.out.println("\n\nEarth Volume is " + earthVolume + " cubic miles");
		
		System.out.println("\n\nSun Volume is " + sunVolume + " cubic miles");
		
		System.out.println("\n\nThe ratio of the volume of the Sun to the volume of the Earth is " + ratioVolume);

	}

}
