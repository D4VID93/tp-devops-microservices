package com.example.catalogue_service;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CatalogueServiceApplicationTests {

	@Test
	@Disabled("Désactivé pour la CI sur GitHub car pas de base de données")
	void contextLoads() {
	}

}
