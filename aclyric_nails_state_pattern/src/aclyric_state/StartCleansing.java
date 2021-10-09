package aclyric_state;


public class StartCleansing implements State {
	 
	AclyricBuilder aclyricNailsFactory;
 
    public StartCleansing(AclyricBuilder aclyricNailsFactory) {
        this.aclyricNailsFactory = aclyricNailsFactory;
    }


	public void startPrinting() {
		// TODO Auto-generated method stub
	}

	@Override
	public void startPainting() {
		System.out.println("Painting of the nails has started");
		
	}


	@Override
	public void startCleansing() {
		System.out.println("The 3D printer cant run while nails are being painted");
		
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
