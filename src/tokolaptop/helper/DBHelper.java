package tokolaptop.helper;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import tokolaptop.models.Laptop;

public class DBHelper {

    private final String dbUrl = "jdbc:mysql://localhost/toko_laptop";
    private final String user = "root";
    private final String pass = "";
    
    private Connection conn;
    private Statement stmt;
    private ResultSet rs;
    private String query;
    
    private static Connection getConnection() throws  SQLException{
        DBHelper helper = new DBHelper();
        return helper.conn;
    }
    
    public DBHelper(){
        try {
            conn = DriverManager.getConnection(dbUrl, user, pass);
        }catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public static boolean cekLogin(String username, String password){
        String sql = "SELECT * FROM admin WHERE username=? AND password=?";
        try(Connection conn = getConnection(); PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setString(1, username);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            return rs.next();
        } catch (SQLException e) {
            return false;
        }
    }
    
    public static List<Laptop> getAllLaptops(){
        List<Laptop> list = new ArrayList<>();
        try (Connection conn = getConnection()){
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM laptop");
            while (rs.next()){
                list.add(new Laptop(
                        rs.getString("id"),
                        rs.getString("merek"),
                        rs.getString("model"),
                        rs.getString("spesifikasi"),
                        rs.getDouble("harga"),
                        rs.getInt("stok")
                ));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return list;
    }
    
    public static boolean insertLaptop(Laptop l){
        String sql = "INSERT INTO laptop (id, merek, model, spesifikasi, harga, stok) VALUES (?,?,?,?,?,?)";
        try (Connection conn = getConnection(); PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setString(1, l.getId());
            ps.setString(2, l.getMerek());
            ps.setString(3, l.getModel());
            ps.setString(4, l.getSpesifikasi());
            ps.setDouble(5, l.getHarga());
            ps.setInt(6, l.getStok());
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            return false;
        }
    }
    
    public static boolean updateLaptop(Laptop l){
        String sql = "UPDATE laptop SET merek=?, model=?, spesifikasi=?, harga=?, stok=? WHERE id=?";
        try (Connection conn = getConnection(); PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setString(1, l.getMerek());
            ps.setString(2, l.getModel());
            ps.setString(3, l.getSpesifikasi());
            ps.setDouble(4, l.getHarga());
            ps.setInt(5, l.getStok());
            ps.setString(6, l.getId());
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            return false;
        }
    }
    
    public static boolean deleteLaptop(String id){
        String sql = "DELETE FROM laptop WHERE id=?";
        try (Connection conn = getConnection(); PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setString(1, id);
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            return false;
        }
    }
}
