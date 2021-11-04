package com.technoelevate.exceptionhandling.assiginment;

public class notPossiable extends Exception {
  String msg;

public notPossiable(String msg) {
	super();
	this.msg = msg;
}


@Override
public String getMessage() {
	return msg;
}
}
