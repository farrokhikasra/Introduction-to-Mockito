package com.demo.mockito.mockitodemo.businessTest;

import com.demo.mockito.mockitodemo.business.DataService;
import com.demo.mockito.mockitodemo.business.SomeBusinessImpl;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@SpringBootTest
public class SomeBusinessImplMockTest {
    @Test
    public void findTheGreatestFromALlData_basicScenario() {
        DataService dataServiceMock = mock(DataService.class);
        when(dataServiceMock.retieveAllData()).thenReturn(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
        SomeBusinessImpl business = new SomeBusinessImpl(dataServiceMock);
        assertEquals(9, business.findTheGreatestFromAllData());
    }

}
