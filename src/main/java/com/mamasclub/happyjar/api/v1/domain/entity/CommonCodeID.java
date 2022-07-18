package com.mamasclub.happyjar.api.v1.domain.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class CommonCodeID implements Serializable {
    private String baseCode;
    private String subCode;

}
