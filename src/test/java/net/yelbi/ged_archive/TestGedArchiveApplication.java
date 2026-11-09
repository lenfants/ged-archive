package net.yelbi.ged_archive;

import org.springframework.boot.SpringApplication;

public class TestGedArchiveApplication {

	public static void main(String[] args) {
		SpringApplication.from(GedArchiveApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
