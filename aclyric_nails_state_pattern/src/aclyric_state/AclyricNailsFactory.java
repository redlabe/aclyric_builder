package aclyric_state;

public class AclyricNailsFactory {
	 
	State printingState;
	State paintingState;
 
	State state;
	int count = 0;

 
	public void startPrinting() {
		state.startPrinting();
	}
 
	public void startPainting() {
		state.startPainting();
	}
	public void startCleansing() {
		state.startCleansing();
	}
 
 
	

	void setState(State state) {
		this.state = state;
	}
    public State getState() {
        return state;
    }

    public State getPrintingState() {
        return printingState;
    }

    public State getPaintingState() {
        return paintingState;
    }

}
