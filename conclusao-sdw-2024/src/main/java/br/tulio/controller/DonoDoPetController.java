package br.tulio.controller;

import br.tulio.model.DonoDoPet;
import br.tulio.service.DonoDoPetService;
import jakarta.websocket.server.PathParam;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/donodopet")
public class DonoDoPetController {
    private final DonoDoPetService donoDoPetService;

    public DonoDoPetController(DonoDoPetService donoDoPetService) {
        this.donoDoPetService = donoDoPetService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<DonoDoPet> findById(@PathParam("id") int id) {
        return ResponseEntity.ok(donoDoPetService.findById(id));
    }

    @PostMapping("")
    public ResponseEntity<DonoDoPet> create(@RequestBody DonoDoPet donoDoPet) {
        return ResponseEntity.ok(donoDoPetService.create(donoDoPet));
    }
}
