package com.kodilla.jdbc;

import org.junit.Assert;
import org.junit.Test;
import java.sql.*;

public class DbManagerTestSuite {
    @Test
    public void testConnect() throws SQLException {
        //Given
        //When
        DbManager dbManager = DbManager.getInstance();
        //Then
        Assert.assertNotNull(dbManager.getConnection());
    }


    @Test
    public void testSelectUsers() throws SQLException {
        //Given
        DbManager dbManager = DbManager.getInstance();

        //When
        String sqlQuery = "SELECT * FROM USERS";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(sqlQuery);

        //Then
        int counter = 0;
        while(rs.next()) {
            System.out.println(rs.getInt("ID") + ", " +
                    rs.getString("FIRSTNAME") + ", " +
                    rs.getString("LASTNAME"));
            counter++;
        }
        rs.close();
        statement.close();
        Assert.assertEquals(5, counter);
    }

    @Test
    public void testSelectUsersByPostCount() throws SQLException {
        //given
        DbManager dbManager = DbManager.getInstance();

        //when
        String sqlQuery = "SELECT U.FIRSTNAME, U.LASTNAME, COUNT(*) AS Post_count\n" +
                "FROM  USERS U, POSTS P\n" +
                "WHERE P.USER_ID = U.ID\n" +
                "GROUP BY U.FIRSTNAME\n" +
                "HAVING COUNT(*) > 1 \n" +
                "ORDER BY U.FIRSTNAME;";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(sqlQuery);

        //then
        int counter2 = 0;
        while (rs.next()) {
            System.out.println(rs.getString("FIRSTNAME")+" "+
                                rs.getString("LASTNAME")+", "+
                                rs.getInt("Post_count"));
            counter2++;
        }
        rs.close();
        statement.close();
        Assert.assertEquals(2,counter2);
    }
}