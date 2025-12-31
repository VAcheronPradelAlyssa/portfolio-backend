package com.vacheronpradelalyssa.portfolio.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "PROJECT")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Project {
    @Id
    private Long id;
    private String title;
    private String description;
    private String githubLink;
    private String presentationFile;
}