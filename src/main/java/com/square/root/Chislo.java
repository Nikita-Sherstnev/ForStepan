package com.square.root;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "numbers")
public class Chislo {
    @Id
    @Column(name = "id_req")
    @GeneratedValue
    private Long id;
    private int param;
    private int res;
}
