package com.example.atividade_marcio;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.atividade_marcio.controller.ConvertController;

@SpringBootTest
class AtividadeMarcioApplicationTests {
	@Autowired
	ConvertController convertionController;

	@Test
	void ConvertionFahrenheitToCelsiusTest() {
		var celsius = convertionController.fahrenheitToCelsius(0);	
		float result = -17.777779f;
		assertEquals(result, celsius);
	}
	@Test
	void ConvertionCelsiusToFahrenheitTest() {
		var fahrenheits = convertionController.celsiusToFahrenheit(100);	
		float result = 212;
		assertEquals(result, fahrenheits);
	}

}
