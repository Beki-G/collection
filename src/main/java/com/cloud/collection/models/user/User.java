package com.cloud.collection.models.user;

import com.cloud.collection.models.Collection;
import com.cloud.collection.models.Series;
import com.cloud.collection.models.enums.UserType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.Set;

@Getter
@Setter
@Entity
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@DiscriminatorValue(UserType.Types.USER)
public class User extends BaseUser{

    @OneToMany
    private Set<Collection> collections;
//    @OneToMany
//    private Set<Item> items;
    @OneToMany
    private Set<Series> series;
    private String bio;
    private String profilePicId;
    private Boolean personal;
    @OneToMany
    private Set<User> friends;

}
