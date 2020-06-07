package com.mycompany.onlinebanking.repositories.interfaces;

import java.sql.Connection;

public interface IDBRepository {
    Connection getConnection();
}
