package net.yelbi.ged_archive;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
class GedArchiveApplicationTests {

	@Test
	void contextLoads() {
	}

}
