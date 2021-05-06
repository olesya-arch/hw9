
package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class PersonIOUtil {
    public final static String DELIMITER = ";";

    public static String toStrString(Person person) {
        return person.getName() + DELIMITER +
                person.getLastName() + DELIMITER +
                person.getAddress().getCity() + DELIMITER +
                person.getAddress().getStreet() + DELIMITER +
                person.getAddress().getNumberHouse() + "\n";
    }
    public static Person toObject (String strString) {
        String[] dataArray = strString.split(DELIMITER);

        String name = dataArray[0];
        String lastName = dataArray[1];
        String city = dataArray[2];
        String street = dataArray[3];
        int numberHouse = Integer.parseInt(dataArray[4]);


        return new Person(name, lastName, new Address(city, street, numberHouse));
    }


    public static void writePersons(String fileName, List<Person> persons) {
        try (FileWriter writer = new FileWriter(fileName)) {
            for (Person person : persons)
                writer.write(PersonIOUtil.toIOString(person));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String toIOString(Person person) {
        return  person.getName() + DELIMITER +
                person.getLastName() + DELIMITER +
                person.getAddress().getCity() + DELIMITER +
                person.getAddress().getStreet() + DELIMITER +
                person.getAddress().getNumberHouse() + DELIMITER + "\n";

    }

    public static List<Person> readPersons (String fileName) throws IOException, EmptySourceFileException {

        List<Person> persons = new ArrayList<>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));

            String str = reader.readLine();
         if (str == null || str.isEmpty()){
              throw new EmptySourceFileException("Ошибка!!!");
          }

         Person p = PersonIOUtil.toObject(str);
         persons.add(p);
            while ((str = reader.readLine()) != null) {
                Person person = PersonIOUtil.toObject(str);
                persons.add(person);
           }

        } catch (IOException e) {
            e.printStackTrace();
        }

       return persons;
    }


}

