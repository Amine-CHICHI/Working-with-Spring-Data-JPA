package com.example.demo.runner;

import com.example.demo.Student;
import com.example.demo.models.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyRunner implements CommandLineRunner {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("HOLLA");

        Student amine = new Student("Amine", "CHICHI", "aminechichi99@gmail.com", 21);
        studentRepository.save(amine);

        System.out.println(studentRepository.existsById(1L));
        System.out.println("HEEY");
    }
}
