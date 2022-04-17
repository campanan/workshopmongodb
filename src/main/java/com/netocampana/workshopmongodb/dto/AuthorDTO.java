package com.netocampana.workshopmongodb.dto;

import com.netocampana.workshopmongodb.entities.User;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class AuthorDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    private String id;
    private String name;

    public AuthorDTO(User obj){
        id = obj.getId();
        name = obj.getName();
    }

}
