package com.collins.socket.repository;

import com.collins.socket.Entity.TestTable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DatabaseRepo extends JpaRepository<TestTable, Long> {

}
