package ourbusinessproject;

import jakarta.validation.constraints.NotBlank;

//Introduction JPA
import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class Project {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;
    @NotBlank
    String title;
    String description;

    public Project() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
