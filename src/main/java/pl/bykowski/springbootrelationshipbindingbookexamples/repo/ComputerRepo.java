package pl.bykowski.springbootrelationshipbindingbookexamples.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.bykowski.springbootrelationshipbindingbookexamples.entity.Computer;

@Repository
public interface ComputerRepo extends JpaRepository<Computer, Long> {
}
