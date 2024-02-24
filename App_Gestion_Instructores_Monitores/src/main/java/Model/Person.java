package Model;

import java.sql.Date;

public class Person {
    private int id;
    private String name;
    private String phoneNumber;
    private Date birthDate;
    private String address;
    private String email;
    private Role role;

    public Person(int id, String name, String phoneNumber, Date birthDate, String address, String email, Role role) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.birthDate = birthDate;
        this.address = address;
        this.email = email;
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Person [id=" + id + ", name=" + name + ", phoneNumber=" + phoneNumber + ", birthDate=" + birthDate
                + ", address=" + address + ", email=" + email + ", role=" + role.toString() + "]";
    }

}
