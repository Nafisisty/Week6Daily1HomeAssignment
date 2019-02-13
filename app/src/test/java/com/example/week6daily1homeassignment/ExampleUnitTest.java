package com.example.week6daily1homeassignment;

import com.example.week6daily1homeassignment.model.User;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    User user = new User("Nafis", "Pret", "Lord of the Rings");

    @Test
    public void sameValuePassed() {

        assertEquals("Nafis", user.getName());
        assertEquals("Pret", user.getFavBook());
        assertEquals("Lord of the Rings", user.getFavMovie());

    }
}