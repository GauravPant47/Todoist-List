package net.Todoist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import net.Todoist.model.TodoistData;
import net.Todoist.repository.TodoistRepository;

public class TodoistServiceImpl implements TodoistService {

	@Autowired
	private TodoistRepository todoistRepository;

	@Override
	public List<TodoistData> findAllListData() {

		return this.todoistRepository.findAll();
	}

}
