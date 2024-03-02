package lessonnumberten;


public class User {

    private String name;
    private String surname;
    private String patronymic;
    private int yearOfBirth;
    private String email;

    public User(String surname, String name, String patronymic, int yearOfBirth, String email) {
        this.setName(name);
        this.setSurname(surname);
        this.setPatronymic(patronymic);
        this.setYearOfBirth(yearOfBirth);
        this.setEmail(email);
    }

    public void printUserInfo() {
        System.out.println("ФИО: " + getSurname() + " " + getName() + " " + getPatronymic() + "\n"
                + "Год рождения: " + getYearOfBirth() + "\n" + "e-mail: " + getEmail() + "\n");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
