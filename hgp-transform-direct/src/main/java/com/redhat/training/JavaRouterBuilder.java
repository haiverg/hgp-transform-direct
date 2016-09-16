package com.redhat.training;

import org.apache.camel.builder.RouteBuilder;

public class JavaRouterBuilder extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		from("direct:javaobject")
		.to("jms:queue:orders");
	}

}
