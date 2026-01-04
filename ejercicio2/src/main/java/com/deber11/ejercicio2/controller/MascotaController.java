package com.deber11.ejercicio2.controller;


import com.deber11.ejercicio2.model.Mascotas;
import com.deber11.ejercicio2.repository.MascotaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mascotas")
public class MascotaController {

    private final MascotaRepository repository;

    public MascotaController(MascotaRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public ResponseEntity<List<Mascotas>> obtenerTodasMascotas() {
        return ResponseEntity.ok(repository.obtenerTodasMascotas());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Mascotas> obtenerPorId(@PathVariable int id) {
        Mascotas mascota = repository.buscarId(id);
        if (mascota == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(mascota);
    }

    @GetMapping("/menores")
    public ResponseEntity<List<Mascotas>> obtenerMenores(@RequestParam int edad) {
        return ResponseEntity.ok(repository.obtenerMenores(edad));
    }

    @PostMapping
    public ResponseEntity<Mascotas> agregar(@RequestBody Mascotas mascota) {
        return ResponseEntity.status(201).body(repository.agregar(mascota));
    }
}

