package net.Todoist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.Todoist.model.TodoistData;

public interface TodoistRepository extends JpaRepository<TodoistData, Long>{

}
