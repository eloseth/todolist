package com.list.todolist.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.list.todolist.Model.Task;

//databasetilgang
public interface TaskRepository extends JpaRepository<Task, Long> {

}
