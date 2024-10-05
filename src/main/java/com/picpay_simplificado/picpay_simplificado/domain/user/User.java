package com.picpay_simplificado.picpay_simplificado.domain.user;

import com.picpay_simplificado.picpay_simplificado.dtos.UserDTO;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity(name = "users")
@Table(name = "users")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of="id")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String firstName;
    private String lastName;
    @Column(unique = true)
    private String document;
    @Column(unique = true)
    private String email;
    private String password;
    private BigDecimal balance;
    @Enumerated(EnumType.STRING)
    private UserType userType;

   public User(UserDTO data) {
       this.lastName = data.lastName();
       this.firstName = data.firstName();
       this.document = data.document();
       this.email = data.email();
       this.password = data.password();
       this.balance = data.balance();
       this.userType = data.userType();
   }
}
