import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CustomerMapper {
    public static List<Customer> mapToCustomers(ResultSet resultSet) {
        List<Customer> result = new ArrayList<>();

        try {
            while (resultSet.next()){
                result.add(new Customer(
//                        resultSet.getString("id"),
//                        resultSet.getString("user_name"),
//                        resultSet.getString("email"),
//                        resultSet.getString("name"),
//                        resultSet.getString("surname"),
//                        LocalDate.parse(resultSet.getString("date_of_birth")),
//                        resultSet.getString("telephone_number")
                        resultSet.getString(1),
                        resultSet.getString(2),
                        resultSet.getString(3),
                        resultSet.getString(4),
                        resultSet.getString(5),
                        resultSet.getDate(6).toLocalDate(),
                        resultSet.getString(7)
                ));
            }

        } catch (Exception e) {
            System.err.println("Error while mapping resultSet to Customer list : " + e.getMessage());
        }

        return result;
    }

}
