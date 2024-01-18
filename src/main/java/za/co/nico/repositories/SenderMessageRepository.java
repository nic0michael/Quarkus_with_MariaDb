package za.co.nico.repositories;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import za.co.nico.entities.SenderMessageEntity;

@ApplicationScoped
public class SenderMessageRepository implements PanacheRepository<SenderMessageEntity> {

}
