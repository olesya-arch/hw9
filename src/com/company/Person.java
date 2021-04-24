package com.company;

public class Person  {
    private String name;
    private String lastName;
    private Address address;


    public Person(String name, String lastName, Address address) {
        this.name = name;
        this.lastName = lastName;
        this.address = address;
    }

    public String getName() {return name; }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }


    @Override
    public String toString() throws NullFieldException {
        try {
            if (name == null || lastName == null || address == null) {
                throw new NullFieldException("Ошибка - пустое поле!!!");
            }
        } catch (NullFieldException e) {
            System.out.println(e.getMessage());
        }
                return "Person{" +
                "name - " + name +
                ", lastName - " + lastName +
                ", address - " + address +
                '}';
    }


}
