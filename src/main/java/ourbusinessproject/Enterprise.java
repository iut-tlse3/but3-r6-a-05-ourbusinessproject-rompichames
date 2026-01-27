package ourbusinessproject;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

//Introduction JPA
import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

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
}
