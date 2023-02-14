package com.educandoweb.course.dataprovider.repository.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "TB_ORDER")
public class OrderEntity {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(nullable = false)
    private Instant moment;

    @Column
    private Integer orderStatus;

    @JoinColumn(name = "client_id")
    @ManyToOne
    private UserEntity client;

    @OneToMany(mappedBy = "id.order")
    private List<OrderItemEntity> items = new ArrayList<>();
}
