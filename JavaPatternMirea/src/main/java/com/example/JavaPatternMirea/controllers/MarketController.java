package com.example.JavaPatternMirea.controllers;

import lombok.RequiredArgsConstructor;
import com.example.JavaPatternMirea.models.Market;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.example.JavaPatternMirea.services.MarketService;

import java.util.List;

@RequestMapping("/market")
@Controller
@RequiredArgsConstructor
public class MarketController {
    private final MarketService marketService;

    @GetMapping("/add")
    public String createMarket(@RequestParam(value = "name") String name,
                             @RequestParam(value = "address") String address,
                             Model model) {
        Market market = new Market(name, address);
        if (!marketService.existsMarket(name, address)) marketService.addMarket(market);
        System.out.println("Added market: " + market);
        model.addAttribute("type", "added market");
        model.addAttribute("data", marketService.getMarket(name, address));
        return "market";
    }

    @GetMapping("/delete")
    public String deleteMarket(@RequestParam(value = "name") String name,
                             @RequestParam(value = "address") String address,
                             Model model) {
        model.addAttribute("type", "delete market");
        Market market = marketService.getMarket(name, address);
        marketService.deleteMarket(name, address);
        System.out.println("Removed market: " + market);
        model.addAttribute("data", market);
        return "market";
    }

    @GetMapping("/show")
    public String showMarkets(Model model) {
        model.addAttribute("type", "show markets");
        List<Market> markets = marketService.showMarkets();
        if (markets.isEmpty()) {
            model.addAttribute("data", "empty");
        } else {
            model.addAttribute("markets", markets);
        }
        System.out.println("All markets: ");
        int cnt = 0;
        for (Market market : markets) {
            System.out.println(++cnt + ". " + market);
        }
        return "market";
    }
}
