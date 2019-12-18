package com.zj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//该注解表明该类是一个springboot的引导类
@SpringBootApplication
public class MySpringBootApplication {

	public static void main(String[] args) {
		//run方法表示要运行springboot引导类，run方法参数就是springboot引导类的字节码
		SpringApplication.run(MySpringBootApplication.class);
	}

}
