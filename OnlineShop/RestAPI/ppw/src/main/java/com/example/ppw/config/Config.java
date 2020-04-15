
// muzanni
// malasngoding.com
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class config {
    private static Connection mysqlconfig;
    public static Connection configDB()throws SQLException{
        try {
            String url="jdbc:mysql://localhost:3306/mahasiswa"; //url database
            String user="root"; //user database
            String pass=""; //password database
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            mysqlconfig=DriverManager.getConnection(url, user, pass);            
        } catch (Exception e) {
            System.err.println("koneksi gagal "+e.getMessage()); //perintah menampilkan error pada koneksi
        }
        return mysqlconfig;
    }    
}
// muzanni
// malasngoding.com
// malasngoding.com
package materi_array;
public class materi_array {
    public static void main(String[]args){
        int [][] data = new int[0][0];        
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.println(+i+" | "+j);
            }
            System.out.println(" ");
        }        
    }
}
/* Hello this is the way
  to write multi line comments in Java */
package materi_array;
public class materi_array {
    public static void main(String[]args){
        int [] nilai ={1,2,3,4,5};
        System.out.println(nilai[2]);
    }
}
}