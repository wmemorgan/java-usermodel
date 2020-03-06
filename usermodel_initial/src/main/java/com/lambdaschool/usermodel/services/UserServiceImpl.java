package com.lambdaschool.usermodel.services;

import com.lambdaschool.usermodel.models.Role;
import com.lambdaschool.usermodel.models.User;
import com.lambdaschool.usermodel.models.Useremail;
import com.lambdaschool.usermodel.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;

@Transactional
@Service(value = "userService")
public class UserServiceImpl implements UserService
{

    /**
     * Connects this service to the User table.
     */
    @Autowired
    private UserRepository userrepos;

    /**
     * Connects this service to the Role table
     */
    @Autowired
    private RoleService roleService;

    public User findUserById(long id) throws EntityNotFoundException
    {
        return userrepos.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("User id " + id + " not found!"));
    }

    @Override
    public List<User> findByNameContaining(String username)
    {
        return userrepos.findByUsernameContainingIgnoreCase(username.toLowerCase());
    }

    @Override
    public List<User> findAll()
    {
        List<User> list = new ArrayList<>();
        /*
         * findAll returns an iterator set.
         * iterate over the iterator set and add each element to an array list.
         */
        userrepos.findAll()
            .iterator()
            .forEachRemaining(list::add);
        return list;
    }

    @Transactional
    @Override
    public void delete(long id)
    {
        userrepos.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("User id " + id + " not found!"));
        userrepos.deleteById(id);
    }

    @Override
    public User findByName(String name)
    {
        User uu = userrepos.findByUsername(name.toLowerCase());
        if (uu == null)
        {
            throw new EntityNotFoundException("User name " + name + " not found!");
        }
        return uu;
    }

    @Transactional
    @Override
    public User save(User user)
    {
        User newUser = new User();

        if (user.getUserid() != 0)
        {
            userrepos.findById(user.getUserid())
                .orElseThrow(() -> new EntityNotFoundException("User " + user.getUserid() + " Not Found"));

            newUser.setUserid(user.getUserid());
        }

        newUser.setUsername(user.getUsername()
            .toLowerCase());
        newUser.setPassword(user.getPassword());
        newUser.setPrimaryemail(user.getPrimaryemail()
            .toLowerCase());

        for (Useremail ue : user.getUseremails())
        {
            newUser.getUseremails()
                .add(new Useremail(newUser,
                    ue.getUseremail()));
        }

        // role must already exist
        for (Role r : user.getRoles())
        {
            Role newRole = roleService.findRoleById(r.getRoleid());

            newUser.addRole(newRole);
        }

        return userrepos.save(newUser);
    }

    @Transactional
    @Override
    public User update(
        User user,
        long id)
    {

        User currentUser = findUserById(id);

        if (user.getUsername() != null)
        {
            currentUser.setUsername(user.getUsername()
                .toLowerCase());
        }

        if (user.getPassword() != null)
        {
            currentUser.setPassword(user.getPassword());
        }

        if (user.getPrimaryemail() != null)
        {
            currentUser.setPrimaryemail(user.getPrimaryemail()
                .toLowerCase());
        }

        // just adds new Roles. Roles must already exist. Delete Roles is a different method
        if (user.getRoles()
            .size() > 0)
        {
            for (Role r : user.getRoles())
            {
                Role newRole = roleService.findRoleById(r.getRoleid());

                currentUser.addRole(newRole);
            }
        }

        // Just adds new emails. Deleting emails is a different method
        if (user.getUseremails()
            .size() > 0)
        {
            for (Useremail ue : user.getUseremails())
            {
                currentUser.getUseremails()
                    .add(new Useremail(currentUser,
                        ue.getUseremail()));
            }
        }

        return userrepos.save(currentUser);
    }
}
