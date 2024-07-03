package com.csi.service.test;

import com.csi.service.ApplicationSevice;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ApplicationServiceTest {
    ApplicationSevice applicationSevice = new ApplicationSevice();

    @Test
    public void addTest()
    {
        Assertions.assertEquals(15,applicationSevice.add(6,9));
    }
    @Test
    public void subTest()
    {
        Assertions.assertEquals(3,applicationSevice.sub(5,2));
    }
}
