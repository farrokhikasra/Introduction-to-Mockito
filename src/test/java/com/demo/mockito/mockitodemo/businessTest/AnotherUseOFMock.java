package com.demo.mockito.mockitodemo.businessTest;

import com.demo.mockito.mockitodemo.business.DataService;
import com.demo.mockito.mockitodemo.business.SomeBusinessImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.internal.matchers.Any;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@SpringBootTest
public class AnotherUseOFMock {

    @Mock
    private DataService dataService;

    @InjectMocks
    private SomeBusinessImpl businessImpl;

    @Test
    public void testWithInject() {
        when(dataService.retieveAllData()).thenReturn(new int[]{11, 3, 34, 5, 1}).thenReturn(new int[]{});
        assertEquals(34, businessImpl.findTheGreatestFromAllData());
        assertEquals(Integer.MIN_VALUE, businessImpl.findTheGreatestFromAllData());
    }

    @Test
    public void genericParameters() {
        List listMock = mock(List.class);
        when(listMock.get(Mockito.anyInt())).thenReturn("Some String").thenReturn("Another String");
        assertEquals("Some String", listMock.get(1));
        assertEquals("Another String", listMock.get(10006016));
    }
}
