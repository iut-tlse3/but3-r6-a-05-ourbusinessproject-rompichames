package ourbusinessproject;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class Project {
    @NotBlank
    @NotNull
    String title;
    String description;

    public Project() {
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
