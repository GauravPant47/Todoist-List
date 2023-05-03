package net.Todoist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.Todoist.model.TodoistData;
import net.Todoist.repository.TodoistRepository;

@SpringBootApplication
public class TodoistApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(TodoistApplication.class, args);
	}

	@Autowired
	private TodoistRepository todoistRepository;

//	@Override
	public void run(String... args) throws Exception {
//
//		TodoistData todoistData1 = new TodoistData("Todoist Project","working", "Create a todoist project using spring boot");
//		todoistRepository.save(todoistData1);
//		
//		TodoistData todoistData2 = new TodoistData("Mobile","working", "Baying a mobile");
//		todoistRepository.save(todoistData2);
//		
//		TodoistData todoistData3 = new TodoistData("Banking Project","working", "Create a Banking Project using spring boot");
//		todoistRepository.save(todoistData3);
//		
	}


}
