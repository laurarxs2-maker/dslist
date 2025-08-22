package com.laura.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.laura.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
