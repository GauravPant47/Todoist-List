package net.Todoist.service;

import java.util.List;

import net.Todoist.model.TodoistData;

public interface TodoistService {
	List<TodoistData> findAllListData();

	TodoistData saveItem(TodoistData todoistData);
	
	TodoistData getListItemById(Long id);
	
	TodoistData updateListItem(TodoistData todoistData);
}
