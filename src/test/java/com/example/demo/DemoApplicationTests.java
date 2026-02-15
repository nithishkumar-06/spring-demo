package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	private DemoService demoService;

	@Autowired
	private DemoRepository demoRepository;

	@Test
	void contextLoads() {
	}

	@Test
	void testServiceResponses() {
		assertThat(demoService.getResponse1()).isEqualTo("Response from Service 1");
		assertThat(demoService.getResponse2()).isEqualTo("Response from Service 2");
	}

	@Test
	void testRepositoryData() {
		assertThat(demoRepository.fetchData1()).isEqualTo("Data from Repository 1");
		assertThat(demoRepository.fetchData2()).isEqualTo("Data from Repository 2");
	}
}
