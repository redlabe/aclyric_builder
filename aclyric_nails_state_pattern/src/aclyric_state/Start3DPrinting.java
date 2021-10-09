package aclyric_state;


public class Start3DPrinting implements State {
	 
	AclyricBuilder aclyricNailsFactory;
 
    public Start3DPrinting(AclyricBuilder aclyricNailsFactory) {
        this.aclyricNailsFactory = aclyricNailsFactory;
    }

    public void startPrinting() {
		System.out.println("The 3D printer is printing the aclyric nails");
		
	}

	public void startPainting() {
		System.out.println("Sorry, you will have to wait for the printing to finish to begin painting");
		
	}

	@Override
	public void startCleansing() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void startPriming() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void finishing() {
		// TODO Auto-generated method stub
		
	}
	

}
