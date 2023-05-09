package com.kaiq.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kaiq.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}