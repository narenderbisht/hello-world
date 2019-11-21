/**
 * 
 */
package fco.svc.node.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

/**
 * @author narbisht
 *
 */
@RestController
@RequestMapping(path="/sample", produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
public class HelloWorldController{
	
	@Value("${sample.param}")
	private String param;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(HelloWorldController.class);
	
	@GetMapping("/hello")
	public Mono<String> sayHello(ServerHttpRequest request) {
				return Mono.just("Hello World updated:"+param);
		
	}
	
}
