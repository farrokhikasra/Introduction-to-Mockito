package com.demo.mockito.mockitodemo.businessTest;

import com.demo.mockito.mockitodemo.business.DataService;

public class DataServiceStub implements DataService {
    @Override
    public int[] retieveAllData() {
        return new int[]{25, 15, 5};
    }
}
