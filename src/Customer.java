import java.time.LocalDate;

public class Customer {
    private final String id;
    private final String userName;
    private final String email;
    private final String surname;
    private final String name;
    private final LocalDate dateOfBirth;

    private final String telephone_number;


    @Override
    public String toString() {
        return "Customer{" +
                "id='" + id + '\'' +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", telephoneNumber='" + telephone_number + '\'' +
                '}';
    }

    public Customer(String id, String userName, String email, String surname, String name, LocalDate dateOfBirth, String telephoneNumber) {
        this.id = id;
        this.userName = userName;
        this.email = email;
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.telephone_number = telephoneNumber;
    }

    public String getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmail() {
        return email;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getTelephone_number() {
        return telephone_number;
    }
}
