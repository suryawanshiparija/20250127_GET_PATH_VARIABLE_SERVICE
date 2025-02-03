package org.dnyanyog.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.dnyanyog.common.DBUtils;

public class TeacherService {
    public String getTeach_Name(String ID) {
        try {
            ResultSet rs = DBUtils.executeSelectQuery("SELECT Teach_name FROM teacher WHERE ID = '" + ID + "'");
            if (rs.next()) {
                return rs.getString("Teach_name");
            }
            return "No teacher found!";
        } catch (SQLException e) {
            return "Some error occurred!";
        }
    }

    public String getTeach_Email(String ID) {
        try {
            ResultSet rs = DBUtils.executeSelectQuery("SELECT Teach_mail FROM teacher WHERE ID = '" + ID + "'");
            if (rs.next()) {
                return rs.getString("Teach_mail");
            }
            return "No teacher found!";
        } catch (SQLException e) {
            return "Some error occurred!";
        }
    }

    public String getTeach_Mob(String ID) {
        try {
            ResultSet rs = DBUtils.executeSelectQuery("SELECT Teach_mob FROM teacher WHERE ID = '" + ID + "'");
            if (rs.next()) {
                return rs.getString("Teach_mob");
            }
            return "No teacher found!";
        } catch (SQLException e) {
            return "Some error occurred!";
        }
    }
}
