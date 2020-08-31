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
		return new Regulation[]{
			new Regulation(counter.incrementAndGet(),  "Baden-Württemberg", 10, 20, 5, 8, false, EbuildingTypes.BÜRO, 0.3, 0.1, "none"),
			new Regulation(counter.incrementAndGet(),  "Bayern", 10, 20, 5, 8, false, EbuildingTypes.BÜRO, 0.3, 0.1, "none"),
			new Regulation(counter.incrementAndGet(),  "Berlin", 10, 20, 5, 8, false, EbuildingTypes.BÜRO, 0.3, 0.1, "none"),
			new Regulation(counter.incrementAndGet(),  "Brandenburg", 10, 20, 5, 8, false, EbuildingTypes.BÜRO, 0.3, 0.1, "none"),
			new Regulation(counter.incrementAndGet(),  "Bremen", 10, 20, 5, 8, false, EbuildingTypes.BÜRO, 0.3, 0.1, "none"),
			new Regulation(counter.incrementAndGet(),  "Hamburg", 10, 20, 5, 8, false, EbuildingTypes.BÜRO, 0.3, 0.1, "none"),
			new Regulation(counter.incrementAndGet(),  "Hessen", 10, 20, 5, 8, false, EbuildingTypes.BÜRO, 0.3, 0.1, "none"),
			new Regulation(counter.incrementAndGet(),  "Mecklenburg-Vorpommern", 10, 20, 5, 8, false, EbuildingTypes.BÜRO, 0.3, 0.1, "none"),
			new Regulation(counter.incrementAndGet(),  "Niedersachsen", 10, 20, 5, 8, false, EbuildingTypes.BÜRO, 0.3, 0.1, "none"),
			new Regulation(counter.incrementAndGet(),  "Nordrhein-Westfalen", 10, 20, 5, 8, false, EbuildingTypes.BÜRO, 0.3, 0.1, "none"),
			new Regulation(counter.incrementAndGet(),  "Rheinland-Pfalz", 10, 20, 5, 8, false, EbuildingTypes.BÜRO, 0.3, 0.1, "none"),
			new Regulation(counter.incrementAndGet(),  "Saarland", 10, 20, 5, 8, false, EbuildingTypes.BÜRO, 0.3, 0.1, "none"),
			new Regulation(counter.incrementAndGet(),  "Sachsen", 10, 20, 5, 8, false, EbuildingTypes.BÜRO, 0.3, 0.1, "none"),
			new Regulation(counter.incrementAndGet(),  "Sachsen-Anhalt", 10, 20, 5, 8, false, EbuildingTypes.BÜRO, 0.3, 0.1, "none"),
			new Regulation(counter.incrementAndGet(),  "Schleswig-Holstein", 10, 20, 5, 8, false, EbuildingTypes.BÜRO, 0.3, 0.1, "none"),
			new Regulation(counter.incrementAndGet(),  "Thüringen", 10, 20, 5, 8, false, EbuildingTypes.BÜRO, 0.3, 0.1, "none")
		};
	}
}

