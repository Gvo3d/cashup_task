package org.yakimovdenis.cashuptask.models;

import lombok.Data;
import org.yakimovdenis.cashuptask.models.inners.Sex;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name="orders")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer id;
    @Column
    private String name;
    @Column
    private String surname;
    @Column(name="date_of_birth")
    private Date dateOfBirth;
    
    private Sex sex;
    private Long identityCode;
}
