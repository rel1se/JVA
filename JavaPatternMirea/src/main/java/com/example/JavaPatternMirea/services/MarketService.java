package com.example.JavaPatternMirea.services;

import lombok.RequiredArgsConstructor;
import com.example.JavaPatternMirea.models.Market;
import org.springframework.stereotype.Service;
import com.example.JavaPatternMirea.repositories.MarketRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MarketService {
    private final MarketRepository marketRepository;
    public void addMarket(Market market) {marketRepository.save(market);
    }

    public Market getMarket(String name, String address) {

        return marketRepository.findByNameAndAddress(name, address);
    }

    public boolean existsMarket(String name, String address) {
        return marketRepository.existsBankByNameAndAddress(name, address);
    }

    public void deleteMarket(String name, String address) {
        Market market = marketRepository.findByNameAndAddress(name, address);
        if (market != null) marketRepository.delete(market);
    }

    public List<Market> showMarkets() {

        return marketRepository.findAll();
    }

}
