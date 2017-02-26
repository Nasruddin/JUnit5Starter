package com.nasir;

import org.junit.Test;
import org.junit.jupiter.api.*;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

/**
 * Created by nasir on 26/2/17.
 */
@RunWith(JUnitPlatform.class)
public class AppTest {

    @BeforeAll
    static void setup() {
        System.out.println("@BeforeAll - Execute once before all test methods in this class");
    }

    @BeforeEach
    void init() {
        System.out.println("@BeforeEach - Executed before each test method in this class");
    }

    @DisplayName("Test add todo successfully")
    @Test
    void addTodoSuccess() {
        System.out.println("Test add todo successfully");
    }

    @DisplayName("Test add todo with passed argument is null")
    void testAddTodoNull() {
        System.out.println("Test add todo with passed argument is null");
    }

    @DisplayName("No implemented")
    @Test
    void testDeleteTodo() {

    }

    @AfterEach
    void tearDown() {
        System.out.println("@AfterEach - This method is called after each test method");
    }

    @AfterAll
    static void done() {
        System.out.println("@AfterAll - This method is called after all test methods.");
    }
}
