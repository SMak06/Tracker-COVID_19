//Understand that Java is a pain in the A to work with; so make sure the version of Java is the most recent one available. When exporting the ZIP file from start.spring.io, make sure to select the latest Java version as well as download the latest JDK for your system. Sigh!

package io.Sahil.TrackerCOVID_19;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling //calling the Scheduling method
public class TrackerCovid19Application {

	public static void main(String[] args) {
		SpringApplication.run(TrackerCovid19Application.class, args);
	}

}
