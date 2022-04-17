package com.netocampana.workshopmongodb.entities;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Data
@Document(collection = "user")
public class User implements Serializable {

    private static final Long serialVersionUID = 1L;

    @Id
    private String id;

    @NonNull
    private String name;

    @NonNull
    private String email;

    @DBRef(lazy = true)
    private List<Post> posts = new ArrayList<>();

    public User(String id, @NonNull String name, @NonNull String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }
}
