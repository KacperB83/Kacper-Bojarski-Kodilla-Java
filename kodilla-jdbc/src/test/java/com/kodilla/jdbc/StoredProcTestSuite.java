package com.kodilla.jdbc;

import org.junit.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static org.junit.Assert.assertEquals;

public class StoredProcTestSuite {
    @Test
    public void testUpdateBestsellers() throws SQLException {
        //Given
        DbManager dbManagerNew = DbManager.getInstance();
        String newRent = "INSERT INTO RENTS(BOOK_ID, READER_ID, RENT_DATE, RETURN_DATE) VALUES (1, 4, DATE_SUB(CURDATE(), INTERVAL 10 DAY), null)";
        String procedure = "CALL UpdateBestsellers()";
        Statement statementNew = dbManagerNew.getConnection().createStatement();
        int rsNew = statementNew.executeUpdate(procedure);
        //When
        DbManager dbManager = DbManager.getInstance();

        String sqlQuery = "SELECT * FROM BOOKS";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(sqlQuery);
        //Then
        int counter = 0;
        while (rs.next()) {
            if (rs.getString("BESTSELLER").equals("Bestseller")) {
                System.out.println(
                        rs.getInt("BOOK_ID") + ", "+
                        rs.getString("TITLE")+ ", "+
                        rs.getString("PUBYEAR"));
                counter++;
            }
        }
        rs.close();
        statement.close();
        assertEquals(2, counter);
    }

    @Test
    public void testUpdateVipLevels() throws SQLException {
        // Given
        DbManager dbManager = DbManager.getInstance();
        String sqlUpdate = "UPDATE READERS SET VIP_LEVEL=\"Not set\"";
        Statement statement = dbManager.getConnection().createStatement();
        int rs = statement.executeUpdate(sqlUpdate);

        // When
        DbManager dbManagerUpdate = DbManager.getInstance();
        Statement statementUpdate = dbManagerUpdate.getConnection().createStatement();
        String sqlProcedureCall = "CALL UpdateVipLevels()";
        statementUpdate.execute(sqlProcedureCall);

        // Then
        String sqlCheckTable = "SELECT COUNT(*) AS HOW_MANY FROM READERS WHERE VIP_LEVEL=\"Not set\"";
        ResultSet rs2 = statement.executeQuery(sqlCheckTable);
        int howMany = -1;
        if (rs2.next()) {
            howMany = rs2.getInt("HOW_MANY");
        }
        assertEquals(0, howMany);
        rs2.close();
        statement.close();

    }

}
