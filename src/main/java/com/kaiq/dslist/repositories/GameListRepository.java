package com.kaiq.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kaiq.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}