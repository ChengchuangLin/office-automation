package com.keveon.oa;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.PostConstruct;

@SpringBootTest
@ActiveProfiles("test")
@RunWith(SpringRunner.class)
public class ApplicationTests {

	@PostConstruct
	public void init() {
	}

	@Test
	public void contextLoads() {
	}
}
