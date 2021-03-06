package ru.ibs.dataprojects.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.ibs.dataprojects.model.ProjectCard;

/**
 * @author Timur Khidirov on 23.11.2021
 */
@Repository
public interface ProjectCardRepository extends JpaRepository<ProjectCard, Long> {
}
