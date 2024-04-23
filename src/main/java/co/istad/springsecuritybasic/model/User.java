package co.istad.springsecuritybasic.model;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@Table(name = "users_tbl")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    @Column(unique = true)
    private String email;
    private String password;

    private boolean isDisabled;
    private boolean isAccountLocked;
    private boolean isAccountExpired;
    private boolean isCredentialsExpired;

    @ManyToMany(fetch = FetchType.EAGER)
    Set<Role> roles;


}
