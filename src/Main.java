import java.sql.*;

public class Main {
    public static void main(String[] args) {
//        String address = "jdbc:postgresql://127.0.0.1:5432/zajavka";
//        String username = "postgres";
//        String password = "postgres";
//
//
//        try (
//                Connection connection = DriverManager.getConnection(address, username, password);
//                Statement statement = connection.createStatement();
//                ResultSet resultSet = statement.executeQuery("");
//
//                ){
//
//        }catch(Exception e){
//            System.err.println("Exception " + e.getMessage());
//        }


        try {
            Connection conn = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/zajavka",
                    "postgres",
                    "postgres"
            );
            System.out.println(conn);
        } catch (SQLException e) {
            e.printStackTrace();

        }
    }
}