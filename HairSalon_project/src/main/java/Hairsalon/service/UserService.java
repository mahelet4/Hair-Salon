package Hairsalon.service;

import Hairsalon.database.dao.UserDAO;
import Hairsalon.database.entity.User;
import Hairsalon.formbean.RegisterUserFormBean;
import lombok.extern.slf4j.Slf4j;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Locale;

@Slf4j
@Service
public class UserService {

    @Autowired
    private UserDAO userDao;

    @Lazy
    @Autowired
    private PasswordEncoder passwordEncoder;

    public User createNewUser(RegisterUserFormBean form) {
        User user = new User();

        user.setEmail(form.getEmail().toLowerCase());

        String encoded = passwordEncoder.encode(form.getPassword());
        log.debug("Encoded password: " + encoded);
        user.setPassword(encoded);

        // Set the create_date field to the current date and time
        user.setCreateDate(new Date());
        return userDao.save(user);
    }

}
