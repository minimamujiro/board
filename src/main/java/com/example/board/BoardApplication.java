package com.example.board;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BoardApplication {     //依存性クラスを使う側

	public static void main(String[] args) {
		SpringApplication.run(BoardApplication.class, args);
	}

}
