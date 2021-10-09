package aclyric_state;


public class Pattern {

	public static void main(String[] args) {
		AclyricBuilder builder = new SquareNailsBuilder();
		AclyricBuilder b = builder.startPainting().startPrinting().startCleansing();
		System.out.println("The nails have been manufactured successfully"); 
		System.out.println(b); 

	}
}