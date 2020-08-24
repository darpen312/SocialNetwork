package com.project.socialmedia.dal.repos;

import org.springframework.data.repository.CrudRepository;

import com.project.socialmedia.dal.entities.User;

/*
 * Cannot pass a primitive object into a generic type declaration. They always expect a wrapper class
 * e.g 'Boolean' instead of 'boolean', 'Long' instead of 'long' and in this case, 'Integer' instead of 'int'
 */

//repo contains all crud operations
public interface UserRepository extends CrudRepository<User, Integer > {

}
