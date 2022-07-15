package com.careerit.cj.coursestats.exceptions;

import java.io.FileNotFoundException;

class E1Exception extends Exception{
	
}
class E2Exception extends E1Exception{
	
}
class E3Exception extends E2Exception{
	
}


class One{
	void m1() throws E2Exception {
		
	}
}
class Two extends One{
	void m1() {
		
	}
}

public class ExceptionWithOverriding {

}
