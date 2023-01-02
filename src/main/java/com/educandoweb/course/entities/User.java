package com.educandoweb.course.entities;

import lombok.Builder;
import lombok.Data;
import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

@Builder
@Data
@Entity
@Table(name = "TB_USER")
public class User implements Serializable {
    private static final long serialVersionUID = 1L;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String phone;

    @Column(nullable = false)
    private String password;
}
