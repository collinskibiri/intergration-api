package com.collins.socket.repository;

import com.collins.socket.model.DatabaseModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DatabaseRepo extends JpaRepository<DatabaseModel, Long> {

}
