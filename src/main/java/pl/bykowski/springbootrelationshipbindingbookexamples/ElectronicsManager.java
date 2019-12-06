package pl.bykowski.springbootrelationshipbindingbookexamples;

import org.springframework.stereotype.Service;
import pl.bykowski.springbootrelationshipbindingbookexamples.entity.Computer;
import pl.bykowski.springbootrelationshipbindingbookexamples.entity.Processor;
import pl.bykowski.springbootrelationshipbindingbookexamples.repo.ComputerRepo;
import pl.bykowski.springbootrelationshipbindingbookexamples.repo.ProcessorRepo;

@Service
public class ElectronicsManager {

    public ElectronicsManager(ComputerRepo computerRepo,
                              ProcessorRepo processorRepo) {

        Processor processor = new Processor();
        processor.setName("Intel i5");
        processorRepo.save(processor);

        Computer computer = new Computer();
        computer.setProcessor(processor);
        computerRepo.save(computer);
    }
}


