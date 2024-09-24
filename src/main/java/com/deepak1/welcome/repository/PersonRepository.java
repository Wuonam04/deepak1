package com.deepak1.welcome.repository;

import com.deepak1.welcome.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {



    @Query("SELECT u FROM Person u WHERE u.email = :email")  //checking for unique email
    Person readByEmail(String email);
    public  Person getUserByEmail(@Param("email") String email);

}
