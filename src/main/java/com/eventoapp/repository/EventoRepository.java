package com.eventoapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.eventosapp.models.Evento;

public interface EventoRepository extends CrudRepository<Evento,String>{

}