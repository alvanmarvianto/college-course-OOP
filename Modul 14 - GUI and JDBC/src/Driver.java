
import View.PageMahasiswa;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alvan
 */
public class Driver {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws SQLException {
        new PageMahasiswa().setVisible(true);
        System.out.println(5/4);
    }
    
}
