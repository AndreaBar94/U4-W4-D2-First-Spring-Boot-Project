package it.epicode.be.godfather;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import it.epicode.be.godfather.model.Ordine;
import lombok.extern.slf4j.Slf4j;

@SpringBootTest
@Slf4j
class GodFatherPizzaApplicationTests {
	
	@Test
	void contextLoads() {
	}
	

	@Value("${application.costocoperto}")
	double costocoperto;

    @Test
    void testCostoCoperti() {
        log.info("Test costo dei coperti");
        double expectedCostoCoperti = 1.5;
        assertEquals(expectedCostoCoperti, costocoperto);
    }

	private void assertEquals(double expectedCostoCoperti, double costocoperto2) {
		// TODO Auto-generated method stub
		
	}
	
}
