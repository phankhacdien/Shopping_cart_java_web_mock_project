package com.team_a.shopping_cart.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "Products_tbl")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Products {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int productId;

    @Column(nullable = false)
    private String productName;

    @ManyToOne
    @JoinColumn(name = "productLine", referencedColumnName = "productLine", nullable = false)
    private ProductLines productLine;

    private String productReview;

    @Column(nullable = false)
    private int productPrice;

    @Column(nullable = false)
    private int remainingQty;

    @Column(nullable = false)
    private String productVendor;

    @JsonIgnore
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "productId")
    private Set<OrdersDetail> ordersDetailSet;
}
