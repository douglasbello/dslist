package br.com.douglasbello.dslist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;

@SpringBootApplication
public class DslistApplication {

	public static void main(String[] args) {
		SpringApplication.run(DslistApplication.class, args);
//		try {
//			File file = new File("D:\\workspace-spring\\dslist\\src\\main\\resources\\import.sql");
//			file.delete();
//		} catch (Exception e) {
//			System.out.println("File import.sql not found");
//		}
	}
}