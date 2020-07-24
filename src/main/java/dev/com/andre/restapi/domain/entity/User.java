package dev.com.andre.restapi.domain.entity;

import dev.com.andre.restapi.domain.enums.TypeStatus;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "tb_user")
@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@SequenceGenerator(initialValue = 2, name = "user_seq", allocationSize = 1)
public class User {

    @Id
    @GeneratedValue(generator = "user_seq", strategy = GenerationType.SEQUENCE)
    private long id;

    private String name;

    @Column(unique=true, nullable = false)
    private String cpf;

    @Column(unique = true, nullable = false)
    private String email;

    private String password;

    @Column(name = "status", nullable = false)
    @Enumerated(EnumType.STRING)
    @Builder.Default
    private TypeStatus status = TypeStatus.ACTIVE;

}
