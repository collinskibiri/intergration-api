package com.collins.socket.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class DatabaseModel {

    @Id
    private Long id;
    private final String name="Colz";
    private final   String firstName="King";
    private final String secondName="Zakayo";
}
