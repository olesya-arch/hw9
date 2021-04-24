package com.company;

public class Person  {
    private String name;
    private String lastName;
    private Address address;


    public Person (String name, String lastName, Address address) {
        if (name == null || lastName == null || address==null) {
            throw  new NullFieldException("Ошибка - пустое поле!!!");
        }

        this.name = name;
        this.lastName = lastName;
        this.address = address;
    }

    public String getName() {return name; }

    public void setName(String name) throws NullFieldException {
        if (name == null) {
            throw new NullFieldException("Ошибка - пустое поле!!!");
        }
        { this.name = name; }
    }
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) throws NullFieldException {
        if (lastName == null) {
          throw  new NullFieldException("Ошибка - пустое поле!!!");
        }
        { this.lastName = lastName;}
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) throws NullFieldException {
        if (address==null) {
            throw new NullFieldException("Ошибка - пустое поле!!!");
        }
        { this.address = address; }
    }


    @Override
    public String toString()  {
                return "Person{" +
                "name - " + name +
                ", lastName - " + lastName +
                ", address - " + address +
                '}';
    }


}
