package com.example.JavaPatternMirea.models;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "products")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "price")
    private int price;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "market_id")
    private Market market;

    public Product(String name, int price){
        this.name = name;
        this.price = price;
    }
    @Override
    public String toString(){
        if (market != null) return "Name = " + name + ", price: " + price + ", market id = " + market.getId();
        else return "Name = " + name + ", price = " + price + ", market id: null";
    }

}
