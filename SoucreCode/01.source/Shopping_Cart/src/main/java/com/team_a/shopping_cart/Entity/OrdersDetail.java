package com.team_a.shopping_cart.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Orders_Detail_tbl")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrdersDetail implements Serializable {

    @Id
    @ManyToOne
    @JoinColumn(name = "orderNumber", referencedColumnName = "orderNumber")
    private Orders orderNumber;

    @Id
    @ManyToOne
    @JoinColumn(name = "productId", referencedColumnName = "productId")
    private Products productId;

    @Column(nullable = false)
    private int orderQty;

    @Column(nullable = false)
    private int priceEach;
}

