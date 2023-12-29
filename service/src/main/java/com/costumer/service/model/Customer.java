package com.costumer.service.model;

import com.costumer.service.dto.CustomerDTO;
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
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false, unique = true)
    private String email;

    public CustomerDTO toDTO() {
        CustomerDTO dto = new CustomerDTO();
        dto.setId(this.id);
        dto.setName(this.name);
        dto.setEmail(this.email);
        return dto;
    }

}
