package co.istad.springsecuritybasic.model;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;

import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@Table(name = "roles_tbl")
public class Role implements GrantedAuthority {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String name;
    private String description;

    @ManyToMany
    Set<Authority> authorities;


    //ROLE_ + this.name
    @Override
    public String getAuthority() {
        return "ROLE_" + this.name;
    }
}
