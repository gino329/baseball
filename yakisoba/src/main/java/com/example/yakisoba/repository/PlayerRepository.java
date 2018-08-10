package com.example.yakisoba.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.yakisoba.domain.Player;


@Repository
public interface PlayerRepository extends JpaRepository<Player, Long> {

}