package com.example.yakisoba.service;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.yakisoba.domain.Player;
import com.example.yakisoba.repository.PlayerRepository;



@Service
public class PlayerService {
    // ①
    @Autowired
    private PlayerRepository playerRepository;

    public List<Player> findAll() {
        return playerRepository.findAll();
    }

    public Player findOne(Long id) {
        return playerRepository.findById(id).get();
    }

    public Player save(Player player) {
        return playerRepository.save(player);
    }

    public void delete(Long id) {
        playerRepository.deleteById(id);
    }
}
