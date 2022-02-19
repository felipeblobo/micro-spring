package com.lobo.hrpayroll.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {

    private static final long serialVersionUID = 5054474855003183663L;

    private String name;

    private Double dailyIncome;

    private Integer days;

    public double getTotal() {
        return this.days * this.dailyIncome;
    }

}
