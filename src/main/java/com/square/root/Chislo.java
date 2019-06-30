package com.square.root;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Data;

import java.io.Serializable;

@Data
@JsonDeserialize
public class Chislo implements Serializable {
    private int number;
}
