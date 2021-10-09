package aclyric_state;


public abstract class AclyricBuilder {
	Nails nails = new Nails();
	public abstract AclyricBuilder startPrinting();
	public abstract AclyricBuilder startPainting();
	public abstract AclyricBuilder startCleansing();
	public abstract AclyricBuilder startPriming();
	public abstract AclyricBuilder finishing();

	public Nails build() {
		System.out.println("Aclyric nails manufacture was successful!");
		return nails;
	}
}