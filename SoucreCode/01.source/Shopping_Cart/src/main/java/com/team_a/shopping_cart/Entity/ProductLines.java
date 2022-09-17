package com.team_a.shopping_cart.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "ProductLine_tbl")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductLines {

    @Id
    private String productLine;

    private String textDescription;
    private String htmlDescription;
    private String imageLink;

    @JsonIgnore
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "productLine")
    private Set<Products> productsSet;
}
