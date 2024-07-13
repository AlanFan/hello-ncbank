package com.example.hello_openshift;

import java.net.InetAddress;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloOpenshiftApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloOpenshiftApplication.class, args);
	}

	@RequestMapping("/")
	public String hi(){
		try {
			InetAddress localHost = InetAddress.getLocalHost();
		
		String hostname = localHost.getHostName();
		return "hello... from " + hostname ;
		} catch (Exception e) {
			return "";
		}
		
	}

}
