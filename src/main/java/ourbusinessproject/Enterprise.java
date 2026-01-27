package ourbusinessproject;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Enterprise {
    @NotBlank
    String name;
    @Size(min = 16)
    String description;
    @NotBlank
    String contactName;
    @Email
    @NotBlank
    String contactEmail;

    public Enterprise() {
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
