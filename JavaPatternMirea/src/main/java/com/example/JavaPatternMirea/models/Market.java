package com.example.JavaPatternMirea.models;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "markets")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Market {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "address", columnDefinition = "text")
    private String address;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "market", cascade = CascadeType.ALL)
    private List<Product> products;

    public Market(String name, String address){
        this.name = name;
        this.address = address;
    }
    @Override
    public String toString(){
        return "Name = " + name + ", address = " + address;
    }
}
