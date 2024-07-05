package com.example.Server.Repository;

import com.example.Server.Models.User;
import org.springframework.data.repository.CrudRepository;

public interface Repo extends CrudRepository<User,Integer> {
}
