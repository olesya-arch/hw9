package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class PersonIOUtil {

    public static void writePersons(String fileName, List<Person> persons) {
        try (FileWriter writer = new FileWriter(fileName)) {
            for (Person person : persons)
                writer.write(PersonIOUtil.toIOString(person));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String toIOString(Person person) {
        return  "Person{" +
                "name - " + person.getName() + ", " +
                "lastName - " + person.getLastName() + ", " +
                person.getAddress() + "\n";

    }

    public static List<Person> readPersons (String fileName) throws IOException, EmptySourceFileException {

        List<Person> persons = new ArrayList<>();
            File file = new File(fileName);
            try {
                if (!file.exists()) {
                    throw new EmptySourceFileException("Ошибка - пустой файл!!!");
                }
            } catch (EmptySourceFileException e) {
                System.out.println(e.getMessage());
            }

        try {
            BufferedReader reader = new BufferedReader(new FileReader("text.txt"));

            String str;
            while ((str = reader.readLine()) != null) {
                System.out.println(str);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
       return persons;
    }

}