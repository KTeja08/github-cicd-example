package com.cicd.demo.cicdExample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CicdExampleApplication {

	public static void main(String[] args)
	{
		SpringApplication.run(CicdExampleApplication.class, args);
	}

	@GetMapping("/home")
	public String home()
	{
		return "heyy..!! you have successfully set up CI/CD pipeline using jenkins, github and docker with springBoot";
	}

}
//echo "# github-cicd-example" >> README.md
//		git init
//		git add README.md
//		git commit -m "first commit"
//		git branch -M main
//		git remote add origin https://github.com/KTeja08/github-cicd-example.git
//		git push -u origin main