package com.thangdao.shop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.thangdao.shop.upload.FileStorageProperties;

@SpringBootApplication
@EnableConfigurationProperties({
    FileStorageProperties.class
})
public class ShopApplication{
	

	public static void main(String[] args) {
		SpringApplication.run(ShopApplication.class, args);
	}

}
