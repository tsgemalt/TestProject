package com.example.a10054341.myapplication.testbean;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by 10054341 on 30/10/2017.
 */


public class UserTest {
    @Test
    public void UserNameTest() {
        User u = new User();

        u.setName("foo");

        Assert.assertEquals("foo", u.getName());
    }
}
