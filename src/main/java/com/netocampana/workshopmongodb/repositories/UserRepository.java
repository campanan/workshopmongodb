package com.netocampana.workshopmongodb.repositories;

import com.netocampana.workshopmongodb.entities.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {


}
