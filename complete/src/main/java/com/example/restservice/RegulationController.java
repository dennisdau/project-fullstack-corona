package com.example.restservice;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegulationController {

	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/regulation")
	public Regulation[] regulation(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new Regulation[]{new Regulation(counter.incrementAndGet(),  "Niedersachen", 10, 20, 5, 8, false, "office", 0.3, 0.1, "none")};
	}
}

