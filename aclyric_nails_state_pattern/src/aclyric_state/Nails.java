package aclyric_state;


import java.util.*;

public class Nails {
	
	State startPrinting;
	State startPainting;
	State startCleansing;
	State startPriming;
	State finishing;
	
	State state;
	
	Nails startPrinting(Start3DPrinting startPrinting) {
		this.startPrinting = startPrinting;
		return this;
	}
	
	Nails startPainting(StartPainting startPainting) {
		this.startPainting = startPainting;
		return this;
	}
	
	Nails startCleansing(StartCleansing startCleansing) {
		this.startCleansing = startCleansing;
		return this;
	}
	
//	Nails startPriming(StartPriming startPriming) {
//		this.startPriming = startPriming;
//		return this;
//	}
//	
//	Nails startPainting(StartPainting startPainting) {
//		this.startPainting = startPainting;
//		return this;
//	}
}

