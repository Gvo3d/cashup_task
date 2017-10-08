package org.yakimovdenis.cashuptask.models;

import lombok.Data;
import org.yakimovdenis.cashuptask.models.inners.CashType;
import org.yakimovdenis.cashuptask.models.inners.OrderStatus;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name="orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;
    private Date createdDate;
    private OrderStatus status;
    private Long summ;
    private CashType type;
}
