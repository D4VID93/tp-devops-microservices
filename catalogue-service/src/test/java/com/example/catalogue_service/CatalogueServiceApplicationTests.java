package com.example.catalogue_service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CatalogueServiceApplicationTests {

	@Test
	void testBasiquePourLePipeline() {
		int resultat = 1 + 1;
		assertEquals(2, resultat, "1 + 1 doit faire 2");
	}
}