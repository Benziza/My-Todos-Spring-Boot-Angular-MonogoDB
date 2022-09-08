// The MongoRepository interface defines methods for all the CRUD operations on the Document like
// finAll(), fineOne(), save(), delete() etc.
package com.example.backend.repositories;

import com.example.backend.models.Todo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends MongoRepository<Todo, String> {

}