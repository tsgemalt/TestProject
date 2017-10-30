package com.example.a10054341.myapplication.testbean;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

/**
 * Created by 10054341 on 30/10/2017.
 */


@Config(sdk = 18, manifest = Config.NONE)
@RunWith(RobolectricTestRunner.class)
public class UserTest {
    @Test
    public void UserNameTest() {
        User u = new User();

        u.setName("foo");

        Assert.assertEquals("foo", u.getName());
    }

//    @Test
//    public void failTest() {
//        Assert.assertFalse(true);
//    }
}
