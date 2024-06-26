package com.icodeap.ecommerce.backend.domain.port;

import com.icodeap.ecommerce.backend.domain.model.User;

public interface IUserRepository {
    User save (User user);
    User findByEmail(String string);
    User findById(Integer id);
}
