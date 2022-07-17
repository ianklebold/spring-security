package com.project.springsecurity.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Role {

    @Id
    private Long id;
    
    @Column(name="rone_name", nullable=false)
    private String roleName;
}
