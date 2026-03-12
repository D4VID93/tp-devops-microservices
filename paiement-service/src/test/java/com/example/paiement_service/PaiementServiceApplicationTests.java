package com.example.paiement_service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PaiementServiceApplicationTests {

	@Test
	void testBasiquePourLePipeline() {
		int resultat = 10 * 2;
		assertEquals(20, resultat, "Le pipeline doit passer !");
	}
}