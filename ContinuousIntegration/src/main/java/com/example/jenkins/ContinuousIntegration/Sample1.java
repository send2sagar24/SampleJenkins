package com.example.jenkins.ContinuousIntegration;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@Configuration
public class Sample1 {

	@RequestMapping("/App")
	public String Home() {
		return "Hello Smart Data World!";
	}

	public static void main(String[] args) {
		SpringApplication.run(Sample1.class, args);
		// ConfigurableApplicationContext ctx = new
		// SpringApplicationBuilder().bannerMode(Banner.Mode.OFF)
		// .sources(Sample1.class).run(args);
		//System.out.println(ctx.getEnvironment().getProperty("local.server.port"));
		try {
			System.out.println("The IP of the Sagar machine is :" + InetAddress.getLocalHost().getHostAddress());
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		System.out.println("Sample1.java Done...");
	}
}
