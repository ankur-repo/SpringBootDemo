package com.fis.ankur.demo.pojoobject;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application.properties")
public class ServerInfo {

	@Value("${server.info.servername}")
	private String srverename;
	
	@Value("${server.info.port}")
	private String port;

	public String getSrverename() {
		return srverename;
	}

	public void setSrverename(String srverename) {
		this.srverename = srverename;
	}

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}
	
	
}
