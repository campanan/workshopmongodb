package com.netocampana.workshopmongodb.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.Objects;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Document(collection = "user")
public class User implements Serializable {

    private static final Long serialVersionUID = 1L;

    @Id
    private String id;

    private String name;

    private String email;

}
