package com.deepak1.welcome.service;

import com.deepak1.welcome.constants.IsebahnConstants;
import com.deepak1.welcome.model.Person;
import com.deepak1.welcome.model.Roles;
import com.deepak1.welcome.repository.PersonRepository;
import com.deepak1.welcome.repository.RolesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    @Autowired
    private RolesRepository rolesRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public boolean createNewPerson(Person person){
        boolean isSaved = false;
        Roles role = rolesRepository.getByRoleName(IsebahnConstants.USER_ROLE);
        person.setRoles(role);
        person.setPwd(passwordEncoder.encode(person.getPwd()));
        person = personRepository.save(person);
        if (null != person && person.getPersonId() > 0)
        {
            isSaved = true;
        }
        return isSaved;
    }

    public boolean isEmailUnique(String email) {
        Person userByEmail = personRepository.getUserByEmail(email);

        return userByEmail == null;
    }
}