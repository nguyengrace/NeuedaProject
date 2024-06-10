package com.example.backend.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.backend.model.Stock;
import com.example.backend.repository.StockRepository;
import java.util.List;

@RestController // Marks this class as a Spring MVC controller where every method returns a domain object instead of a view
@RequestMapping("/api/stocks") // Maps HTTP requests to /api/users to this controller

public class StockController {

    @Autowired // Injects the UserRepository dependency - the recomended way is to use contructors  :)
    private StockRepository stockRepository;


    @GetMapping // Maps HTTP GET requests to /api/users to this method
    public List<Stock> getAllStocks() {
        /*
            Fetches and returns all User entities from the database
         */
        return stockRepository.findAll();
    }
}

