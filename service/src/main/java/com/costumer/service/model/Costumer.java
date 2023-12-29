package com.costumer.service.model;

import com.costumer.service.dto.CostumerDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Costumer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false, unique = true)
    private String email;

    public CostumerDTO toDTO() {
        CostumerDTO dto = new CostumerDTO();
        dto.setId(this.id);
        dto.setName(this.name);
        dto.setEmail(this.email);
        return dto;
    }

}
