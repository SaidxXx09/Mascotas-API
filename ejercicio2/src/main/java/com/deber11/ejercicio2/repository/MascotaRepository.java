package com.deber11.ejercicio2.repository;

import com.deber11.ejercicio2.model.Mascotas;

import java.util.ArrayList;
import java.util.List;

public class MascotaRepository {
    private ArrayList<Mascotas> mascota = new ArrayList<>();

    public MascotaRepository(){
        mascota.add(new Mascotas(1,"Maldi","Lobo",2012,"Said"));
        mascota.add(new Mascotas(2,"Atenea","Loba",2021,"Camilo"));
    }

    public ArrayList<Mascotas> obtenerTodasMascotas(){
        return mascota;
    }

    public Mascotas buscarId(int id){
        for (Mascotas m: mascota){
            if(m.getId() == id){
                return m;
            }
        }
        System.out.println("No existe ninguna mascota");
        return null;
    }

    public List<Mascotas> obtenerMenores(int anio) {
        List<Mascotas> menores = new ArrayList<>();
        int anioActual = 2025;
        for (Mascotas m : mascota) {
            int edad = anioActual - m.getFechaNacimient();
            if (edad < anio) {
                menores.add(m);
            }
        }
        return menores;
    }

    public Mascotas agregar(Mascotas mascotas){
        mascota.add(mascotas);
        return mascotas;
    }
}
