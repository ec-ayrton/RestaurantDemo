package com.ayrton.pratica.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.ayrton.pratica.entities.Client;
import com.ayrton.pratica.repositories.ClientRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private ClientRepository userRepository;

	@Override
	public void run(String... args) throws Exception {

		Client u1 = new Client(0, "rogerio", "8899895564");
		Client u2 = new Client(0, "Alex Green", "977777777");

		userRepository.saveAll(Arrays.asList(u1,u2));
	}
}