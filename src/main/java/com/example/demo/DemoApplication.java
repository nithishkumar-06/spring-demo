package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.stereotype.Service;
import org.springframework.stereotype.Repository;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}

@RestController
@RequestMapping("/api")
class DemoController {

    @GetMapping("/endpoint1")
    public String getEndpoint1() {
        return "Response from Endpoint 1";
    }

    @GetMapping("/endpoint2")
    public String getEndpoint2() {
        return "Response from Endpoint 2";
    }
}

@Service
class DemoService {
    public String getResponse1() {
        return "Response from Service 1";
    }

    public String getResponse2() {
        return "Response from Service 2";
    }
}

@Repository
class DemoRepository {
    public String fetchData1() {
        return "Data from Repository 1";
    }

    public String fetchData2() {
        return "Data from Repository 2";
    }
}
