package net.Todoist.service;

import java.util.List;

//import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.Todoist.model.TodoistData;
import net.Todoist.repository.TodoistRepository;

@Service
public class TodoistServiceImpl implements TodoistService {

//	@Autowired
	private TodoistRepository todoistRepository;

	public TodoistServiceImpl(TodoistRepository todoistRepository) {
		super();
		this.todoistRepository = todoistRepository;
	}

	@Override
	public List<TodoistData> findAllListData() {
		return this.todoistRepository.findAll();
	}

	@Override
	public TodoistData saveItem(TodoistData todoistData) {
		return todoistRepository.save(todoistData);
	}

	@Override
	public TodoistData getListItemById(Long id) {
		return todoistRepository.findById(id).get();
	}

	@Override
	public TodoistData updateListItem(TodoistData todoistData) {
		return todoistRepository.save(todoistData);
	}

}
