package com.krishana.vscodespring.entity;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity(name="Item")
@Table (name="item")

    public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "itemId")
    private Long itemId;
    @Column(name = "name",nullable = false)
    private String itemName;

    @Column(name = "description")
    private String itemDescription;

    @Column(name = "price",nullable = false)
    private Double itemPrice;

    @Column(name = "url")
    private String itemURL;

    @Column(name = "availability",nullable = false)
    private String itemAvailability;

}
    