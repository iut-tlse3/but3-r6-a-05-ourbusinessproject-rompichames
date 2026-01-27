package ourbusinessproject;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Service;

@Service
public class EnterpriseProjectService {
    @PersistenceContext
    private EntityManager entityManager;


    public EnterpriseProjectService(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public Project newProject(String title, String description) {
        Project project = new Project();
        project.setTitle(title);
        project.setDescription(description);
        this.entityManager.persist(project);
        this.entityManager.flush();
        return project;
    }

    public EntityManager getEntityManager() {
        return entityManager;
    }

    public Enterprise newEnterprise(String aName, String aDescription, String aContactName, String mail) {
        Enterprise enterprise = new Enterprise();
        enterprise.setName(aName);
        enterprise.setDescription(aDescription);
        enterprise.setContactName(aContactName);
        enterprise.setContactEmail(mail);
        this.entityManager.persist(enterprise);
        this.entityManager.flush();
        return enterprise;
    }

    public Project findProjectById(Long anId) {
        return entityManager.find(Project.class, anId);
    }

    public Enterprise findEnterpriseById(Long anId) {
        return entityManager.find(Enterprise.class, anId);
    }
}
