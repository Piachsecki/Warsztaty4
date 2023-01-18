import java.sql.*;

public class Example2 {
    public static void main(String[] args) {
        String address = "jdbc:postgresql://127.0.0.1:5432/zajavka";
        String dbUsername = "postgres";
        String dbPassword = "postgres";

        String username = "ntinner27";


        //SQL INJECTION

        String query1 = "DELETE FROM OPINION WHERE CUSTOMER_ID " +
                "IN (SELECT ID FROM CUSTOMER WHERE USER_NAME = ?);" ;

        String query2 = "DELETE FROM PURCHASE WHERE CUSTOMER_ID " +
                "IN (SELECT ID FROM CUSTOMER WHERE USER_NAME = ?);" ;

        String query3 = "DELETE FROM CUSTOMER WHERE USER_NAME = ?;";

        try (
                Connection connection = DriverManager.getConnection(address, dbUsername, dbPassword);
                PreparedStatement statement1 = connection.prepareStatement(query1);
                PreparedStatement statement2= connection.prepareStatement(query2);
                PreparedStatement statement3 = connection.prepareStatement(query3);
        ){
            statement1.setString(1, username);
            statement2.setString(2, username);
            statement3.setString(3, username);
            int count1= statement1.executeUpdate();
            int count2= statement2.executeUpdate();
            int count3 = statement3.executeUpdate();
            System.out.println("Changed " + count1 + " row");
            System.out.println("Changed " + count2 + " row");
            System.out.println("Changed " + count3 + " row");

        }catch(Exception e){
            System.err.println("Exception " + e.getMessage());
        }
    }
}
