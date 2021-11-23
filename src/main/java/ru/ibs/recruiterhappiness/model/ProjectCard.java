package ru.ibs.recruiterhappiness.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author Timur Khidirov on 23.11.2021
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ProjectCard {
    @Id
    @GeneratedValue
    private String customer;
    private String projectName;
}
