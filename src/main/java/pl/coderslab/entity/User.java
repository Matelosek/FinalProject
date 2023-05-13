package pl.coderslab.entity;


import com.fasterxml.jackson.annotation.JsonAnyGetter;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.bind.DefaultValue;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "users")
@Getter
@Setter
@ToString
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String login;

    @NotBlank(message = "To pole nie może być puste")
    private String userName;

    @NotBlank(message = "To pole nie może być puste")
    private String surname;

    @Email(message = "Nieprawidłowy adres email")
    @NotNull(message = "To pole nie może być puste")
    private String email;

    @Size(min = 8, message= "Hasło musi mieć przynajmniej 8 znaków")
    private String password;

    private boolean admin = false;

    @ManyToMany
    private List<Task> tasks;


    private int enabled = 1;

    @ManyToMany
    private List<Role> roles = new ArrayList<>();


}
