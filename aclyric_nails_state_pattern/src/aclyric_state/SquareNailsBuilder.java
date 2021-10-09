package aclyric_state;


public class SquareNailsBuilder extends AclyricBuilder {
	@Override
	public AclyricBuilder startPrinting() {
		nails.startPrinting(new Start3DPrinting(null));
		return this;
	}
	@Override
	public AclyricBuilder startPainting() {
		nails.startPainting(new StartPainting(null));
		return this;
	}
	@Override
	public AclyricBuilder startCleansing() {
		nails.startCleansing(new StartCleansing(null));
		return this;
	}
	@Override
	public AclyricBuilder startPriming() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public AclyricBuilder finishing() {
		// TODO Auto-generated method stub
		return null;
	}
}
