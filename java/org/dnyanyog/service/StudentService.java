package org.dnyanyog.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.dnyanyog.common.DBUtils;

public class StudentService {
    public String getStud_Name(String ID) {
        try {
            ResultSet rs = DBUtils.executeSelectQuery("SELECT Stud_Name FROM student WHERE ID = '" + ID + "'");
            if (rs.next()) {
                return rs.getString("Stud_Name");
            }
            return "No student found!";
        } catch (SQLException e) {
            return "Some error occurred!";
        }
    }

    public String getStud_Email(String ID) {
        try {
            ResultSet rs = DBUtils.executeSelectQuery("SELECT Stud_Email FROM student WHERE ID = '" + ID + "'");
            if (rs.next()) {
                return rs.getString("Stud_Email");
            }
            return "No student found!";
        } catch (SQLException e) {
            return "Some error occurred!";
        }
    }

    public String getStud_Mob(String ID) {
        try {
            ResultSet rs = DBUtils.executeSelectQuery("SELECT Stud_Mob FROM student WHERE ID = '" + ID + "'");
            if (rs.next()) {
                return rs.getString("Stud_Mob");
            }
            return "No student found!";
        } catch (SQLException e) {
            return "Some error occurred!";
        }
    }
}
