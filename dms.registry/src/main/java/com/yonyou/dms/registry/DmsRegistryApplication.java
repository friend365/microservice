package com.yonyou.dms.registry;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
/**
 * 创建服务注册中心
 * 
 * @author David
 * 
 */
@SpringBootApplication
@EnableEurekaServer
public class DmsRegistryApplication {

	public static void main(String[] args) {
		//SpringApplication.run(DmsRegistryApplication.class, args);
		new SpringApplicationBuilder(DmsRegistryApplication.class).web(true).run(args);
	}
}