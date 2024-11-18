package com.springsecurity.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Products") // Đảm bảo bảng trong DB có tên là "product"
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "TEXT")
    private String name;
    @Column( columnDefinition = "TEXT")
    private String brand;
    @Column( columnDefinition = "TEXT")
    private String madein;

    private Float price;

}
