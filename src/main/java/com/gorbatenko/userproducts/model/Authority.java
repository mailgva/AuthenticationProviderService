package com.gorbatenko.userproducts.model;

import lombok.Data;
import org.springframework.security.core.GrantedAuthority;


import javax.persistence.*;

@Data
@Entity
public class Authority {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    @JoinColumn(name = "user")
    @ManyToOne
    private User user;

}