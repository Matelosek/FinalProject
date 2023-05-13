package pl.coderslab.service;

import pl.coderslab.entity.Task;

import java.awt.print.Book;
import java.util.List;

public interface TaskService {
    List<Task> findAll();

    void deleteById(Long id);

    void save (Task task);
}
