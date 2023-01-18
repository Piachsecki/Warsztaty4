import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

public class Example3 {
    public static void main(String[] args) {
        String query = "SELECT * FROM CUSTOMER WHERE NAME LIKE ?;";
        String parameter = "%me%";

        String address = "jdbc:postgresql://127.0.0.1:5432/zajavka";
        String dbUsername = "postgres";
        String dbPassword = "postgres";


        try(
                Connection connection = DriverManager.getConnection(address, dbPassword, dbPassword);
                PreparedStatement preparedStatement = connection.prepareStatement(query);
            )
        {
            preparedStatement.setString(1, parameter);
            try(
                    ResultSet resultSet = preparedStatement.executeQuery()){
                List<Customer> customerList = CustomerMapper.mapToCustomers(resultSet);
                customerList.forEach(customer -> System.out.println("Customer: " + customer));
            }

        }catch (Exception e){
            System.err.println("Error on working on database " + e.getMessage());
        }
    }
}
