package aclyric_state;


public class StartPainting implements State {
	 
	AclyricBuilder aclyricNailsFactory;
 
    public StartPainting(AclyricBuilder aclyricNailsFactory) {
        this.aclyricNailsFactory = aclyricNailsFactory;
    }


	public void startPrinting() {
		System.out.println("The 3D printer cant run while nails are being painted");
		
	}

	@Override
	public void startPainting() {
		System.out.println("Painting of the nails has started");
		
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
