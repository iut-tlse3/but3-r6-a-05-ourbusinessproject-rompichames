package ourbusinessproject;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

//Introduction JPA

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

@Entity
public class Enterprise {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;
    @NotBlank
    String name;
    @Size(min = 10)
    String description;
    @NotBlank
    String contactName;
    @Email
    @NotBlank
    String contactEmail;

    @OneToMany (mappedBy = "enterprise")
    public Collection <Project> projects;

    public Enterprise() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setDescription(String description){
        this.description=description;
    }

    public void setContactName(String contactName){
        this.contactName=contactName;
    }
    public void setContactEmail(String contactEmail){
        this.contactEmail=contactEmail;
    }

    public Collection<Project> getProjects() {
        return projects;
    }

    public void addProject(Project project){
        if (this.projects == null) {
            this.projects = new HashSet<>();    //permet qu'il n'y ai pas plusieurs fois le mm projet dans enterprise
        }
        projects.add(project);
    }
}
