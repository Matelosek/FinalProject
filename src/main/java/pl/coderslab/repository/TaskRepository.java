package pl.coderslab.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.coderslab.entity.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
