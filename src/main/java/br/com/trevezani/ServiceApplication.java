package br.com.trevezani;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@ApplicationScoped
public class ServiceApplication {
	private static final Logger log = LoggerFactory.getLogger(ServiceApplication.class);
	
	@PostConstruct
	public void init() {
		log.info("Initialize Service Application");
	}
}
