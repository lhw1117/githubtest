package com.example.demo;

import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Profile("test1")
public class BookService {
}
