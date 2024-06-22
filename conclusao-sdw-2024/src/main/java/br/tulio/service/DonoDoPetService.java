package br.tulio.service;

import br.tulio.model.DonoDoPet;
import br.tulio.repository.DonoDoPetRepository;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class DonoDoPetService {
    private final DonoDoPetRepository donoDoPetRepository;

    public DonoDoPetService(DonoDoPetRepository donoDoPetRepository) {
        this.donoDoPetRepository = donoDoPetRepository;
    }

    public DonoDoPet findById(int id) {
        return donoDoPetRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    public DonoDoPet create(DonoDoPet donoDoPet) {
        return donoDoPetRepository.save(donoDoPet);
    }
}
