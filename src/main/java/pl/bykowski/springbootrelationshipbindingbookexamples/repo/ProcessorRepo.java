package pl.bykowski.springbootrelationshipbindingbookexamples.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.bykowski.springbootrelationshipbindingbookexamples.entity.Computer;
import pl.bykowski.springbootrelationshipbindingbookexamples.entity.Processor;

@Repository
public interface ProcessorRepo extends JpaRepository<Processor, Long> {
}
