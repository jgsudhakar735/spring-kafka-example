/**
 * 
 */
package com.jgsudhakar.kafka.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jgsudhakar.kafka.entity.User;

/**
 * @author sudhakar.t
 *
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
