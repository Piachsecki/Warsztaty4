import java.sql.*;

public class Example1 {
    public static void main(String[] args) {
        String address = "jdbc:postgresql://127.0.0.1:5432/zajavka";
        String username = "postgres";
        String password = "postgres";

//        String query1 = "INSERT INTO PRODUCER (ID, PRODUCER_NAME, ADDRESS)" +
//                "VALUES (2, 'Zajavka 2', 'Zajavkowa 15, Warszawa')";

//        String query2 = "UPDATE PRODUCER SET ADDRESS = 'Nowy adres siedziby'" +
//                "WHERE ID = 1";

        String query3 = "DELETE FROM PRODUCER WHERE ID = 2";

        String query4 = "SELECT * FROM PRODUCER;";

        try (
                Connection connection = DriverManager.getConnection(address, username, password);
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(query4);
            ){
//            int i = statement.executeUpdate(query3);
//            System.out.println(i);
            if(resultSet.next()){
                System.out.println(resultSet.getString("producer_name"));
            }


        }catch(Exception e){
            System.err.println("Exception " + e.getMessage());
        }
    }
}
