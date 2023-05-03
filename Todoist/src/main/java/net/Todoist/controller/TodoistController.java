package net.Todoist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import net.Todoist.model.TodoistData;
import net.Todoist.service.TodoistService;


@Controller
public class TodoistController {

//	@Autowired
	private TodoistService todoistService;
	

	public TodoistController(TodoistService todoistService) {
		super();
		this.todoistService = todoistService;
	}

//	@GetMapping("/todoist")
//	public List<TodoistData> findingAList(Model model) {
//		List<TodoistData> todoist = model.addAttribute("todoist", todoistService.findAllListData());
//		return todoist;
//	}
	
	// creating a main page method in side this method we show the all list entry
	@GetMapping("/todoist")
	public String allDataList(Model model) {
		model.addAttribute("todoist",todoistService.findAllListData());
		return "todoist";
	}

	// adding a list entry method
	@GetMapping("/todoist/listItem")
	public String createATodoistForm(Model model) {
		TodoistData todoistData = new TodoistData();

		model.addAttribute("todoistData", todoistData);
		return "create_todoistData";
	}
	
	// adding a method to post the all list item inside main method
	@PostMapping("/todoist")
	public String saveDataTodoist(@ModelAttribute("todoistData") TodoistData todoistData) {
		todoistService.saveItem(todoistData);
		return "redirect:/todoist";
	}
	
	// adding a changing post method  
	
//	@GetMapping("/todoist/edit/{id}")
//	public String editListItem(@PathVariable Long id , Model model) {
//		model.addAttribute("todoist", todoistService.getListItemById(id));
//		return "edit_todoistItem";
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
