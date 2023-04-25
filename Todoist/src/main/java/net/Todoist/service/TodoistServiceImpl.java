package net.Todoist.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.Todoist.model.TodoistData;
import net.Todoist.repository.TodoistRepository;

@Service
@Transactional
public class TodoistServiceImpl implements TodoistService {

	@Autowired
	private TodoistRepository todoistRepository;

	@Override
	public List<TodoistData> findAllListData() {

		return this.todoistRepository.findAll();
	}

}
