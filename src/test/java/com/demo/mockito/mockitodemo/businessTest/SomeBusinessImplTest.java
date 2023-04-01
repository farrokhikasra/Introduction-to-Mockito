package com.demo.mockito.mockitodemo.businessTest;

import com.demo.mockito.mockitodemo.business.DataService;
import com.demo.mockito.mockitodemo.business.SomeBusinessImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
public class SomeBusinessImplTest {

    @Test
    public void findTheGreatestFromALlData_basicScenario() {
        DataService dataServiceStub = new DataServiceStub();
        SomeBusinessImpl business = new SomeBusinessImpl(dataServiceStub);
        int result = business.findTheGreatestFromAllData();
        assertEquals(25, result);


    }
}
