package com.jc.ws;

import javax.jws.WebService;

@WebService(endpointInterface="com.jc.ws.HelloWS")
public class HelloWSImpl implements HelloWS{

	@Override
	public String getHelloWorldAsString() {
		return "Hello WS";
	}

}
