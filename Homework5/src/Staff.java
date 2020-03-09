import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Staff {

    protected String fullName;
    protected String position;
    protected String email;
    protected String phoneNumber;
    protected int salary;
    protected int age;

    public String getFullName() {return fullName; }
    public void setFullName(String fullName) {this.fullName = fullName; }

    public String getPosition() {return position; }
    public void setPosition(String position) {this.position = position; }

    public String getEmail() {return email; }
    public void setEmail(String email) {this.email = email; }

    public String getPhoneNumber() {return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) {this.phoneNumber = phoneNumber; }

    public int getSalary() {return salary; }
    public void setSalary(int salary) {this.salary = salary; }

    public int getAge() {return age; }
    public void setAge(int age) {this.age = age; }


    public Staff (String fullName, String position, String email, String phoneNumber, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Зарплата не должна быть меньше 0");
        }
        if (age >= 18 && age < 100) {
            this.age = age;
        } else {
            System.out.println("Сотрудник должен быть старше 18 лет");
        }
    }

    public void out () {
        System.out.println("ФИО: " + fullName + "; должность: " + position + ", e-mail: " + email + "; телефон: " +
                phoneNumber + "; зарплата: " + salary + "; возраст: " + age);
    }
}
