package com.careerit.ipl.stats;

import com.opencsv.CSVReader;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class IplStatsApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(IplStatsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
			
	}

}
