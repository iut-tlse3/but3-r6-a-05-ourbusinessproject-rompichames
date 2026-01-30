package ourbusinessproject;

import jakarta.validation.constraints.NotNull;

import java.util.Date;

public class Partnership {
    @NotNull
    Date date;

    @NotNull
    Enterprise enterprise;

    @NotNull
    Project project;

    public Partnership() {}

    public void setCreationDate(Date date) {
        this.date = date;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }

    public void setProject(Project project) {
        this.project = project;
    }
}
