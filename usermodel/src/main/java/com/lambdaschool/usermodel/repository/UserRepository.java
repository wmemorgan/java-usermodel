package com.lambdaschool.usermodel.repository;

import com.lambdaschool.usermodel.models.User;
import com.lambdaschool.usermodel.views.UserNameCountEmails;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * The CRUD repository connecting User to the rest of the application
 */
public interface UserRepository extends CrudRepository<User, Long>
{
    /**
     * Find a user based off over username
     *
     * @param username the name (String) of user you seek
     * @return the first user object with the name you seek
     */
    User findByUsername(String username);

    /**
     * Find all users whose name contains a given substring ignoring case
     *
     * @param name the substring of the names (String) you seek
     * @return List of users whose name contain the given substring ignoring case
     */
    List<User> findByUsernameContainingIgnoreCase(String name);

    /*
     *
     * The following are new from initial
     *
     */

    /**
     * Custom Query finding the users and the count of their emails.
     * nativeQuery is set to true. This means the query will be using the actual database names of these. A preference of mine.
     * native queries are using faster
     * can lose portability to other databases if care is not taken in naming conventions
     *
     * @return List (element type is the interface UserNameCountEmails) containing usernames and the number of emails they have - not counting the primary email
     */
    @Query(value = "SELECT u.username as usernamerpt, count(ue.useremailid) as countemails FROM users u JOIN useremails ue ON u.userid = ue.userid GROUP BY u.username",
        nativeQuery = true)
    List<UserNameCountEmails> getCountUserEmails();
}
