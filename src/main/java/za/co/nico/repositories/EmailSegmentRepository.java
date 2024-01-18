package za.co.nico.repositories;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import za.co.nico.entities.EmailSegmentEntity;

@ApplicationScoped
public class EmailSegmentRepository implements PanacheRepository<EmailSegmentEntity> {

}
