package com.example.demo;

import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

@Repository
@Profile("test2")
public class TestBookRepository implements BookRepository {
}
