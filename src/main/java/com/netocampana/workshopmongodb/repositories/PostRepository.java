package com.netocampana.workshopmongodb.repositories;

import com.netocampana.workshopmongodb.entities.Post;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {
}