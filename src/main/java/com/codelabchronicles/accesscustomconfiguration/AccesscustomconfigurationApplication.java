package com.codelabchronicles.accesscustomconfiguration;

import com.codelabchronicles.customautoconfigurationlib.config.CustomBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;

@SpringBootApplication
public class AccesscustomconfigurationApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccesscustomconfigurationApplication.class, args);
	}

	@Service
	public class CustomRunner implements CommandLineRunner{

		@Autowired
		CustomBean customBean;

		@Override
		public void run(String... args) throws Exception {

		}
	}
}
