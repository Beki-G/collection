package com.cloud.collection.models.user;

import com.cloud.collection.models.enums.UserType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Locale;
import java.util.Optional;

@Getter
@Setter
@Entity
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@DiscriminatorColumn(name = "type", discriminatorType = DiscriminatorType.STRING)
public class BaseUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String username;
    @NotNull
    private String firstName;
    @NotNull
    private String lastName;
    @NotNull
    private String email;
    @NotNull
    private String password;

    private Boolean enabled;

    @Transient
    public String getType(){
        DiscriminatorValue annotation = this.getClass().getAnnotation(DiscriminatorValue.class);
        return Optional.of(annotation.value()).orElse(null);
    }

    @Transient
    public UserType getUserType(){
        return Optional.of(UserType.valueOf(getType().toUpperCase())).orElse(null);
    }
}
