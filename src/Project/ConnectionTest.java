/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;
import java.sql.*;
/**
 *
 * @author HP
 */
public class ConnectionTest {
    public static void main(String[] args) {
        Connection con = Connectionprovider.getCon();
        if (con != null) {
            System.out.println("✅ Connection successful!");
        } else {
            System.out.println("❌ Connection failed.");
        }
    }
}
