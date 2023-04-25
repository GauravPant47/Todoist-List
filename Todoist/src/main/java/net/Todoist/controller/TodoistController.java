package net.Todoist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import net.Todoist.model.TodoistData;
import net.Todoist.service.TodoistService;

@Controller
public class TodoistController {
	
	@Autowired
	private TodoistService todoistService;
	
	
	
	@GetMapping("/todoist")
	public List<TodoistData> findingAList(){
		List<TodoistData> todoist = todoistService.findAllListData();
		return todoist;
	}
	
	@GetMapping("/todoist/listItem")
	public String createATodoistForm(Model model){
		TodoistData todoistData = new TodoistData();
		
		model.addAttribute("todoistData", todoistData);
		return "create_todoistData";
		
	}
}
