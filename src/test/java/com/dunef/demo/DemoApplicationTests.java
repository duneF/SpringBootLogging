package com.dunef.demo;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class DemoApplicationTests {
	//private final Logger logger= LoggerFactory.getLogger ( DemoApplicationTests.class );
	@Test
	public void contextLoads() {
		String name="imooc";
		String password="123456";

		log.info ( "name:{},password:{}",name,password );
		log.error ( "name:{},password:{}",name,password );

		log.debug ( "debug..." 	);
		log.info ( "info..." );
		log.error ( "error..." );
	}

}
