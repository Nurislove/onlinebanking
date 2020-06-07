package com.mycompany.onlinebanking.repositories;


import com.mycompany.onlinebanking.repositories.interfaces.IDBRepository;

import javax.ws.rs.ServerErrorException;
import javax.ws.rs.core.Response;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PostgresRepository implements IDBRepository {
    @Override
    public Connection getConnection() {
        try {
            String connStr = "jdbc:postgresql://localhost:5432/bank";
            return DriverManager.getConnection(connStr, "postgres", "0410");
        } catch (SQLException ex) {
            throw new ServerErrorException("Cannot connect to DB: " + ex.getMessage(), Response.Status.INTERNAL_SERVER_ERROR);
        }
    }
}