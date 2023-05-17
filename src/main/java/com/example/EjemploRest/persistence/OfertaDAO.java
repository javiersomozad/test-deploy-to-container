package com.example.EjemploRest.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.EjemploRest.entities.Oferta;

public interface OfertaDAO extends JpaRepository<Oferta, Integer>{
}