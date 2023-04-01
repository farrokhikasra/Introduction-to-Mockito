package com.demo.mockito.mockitodemo.business;

public class SomeBusinessImpl {
    private DataService dataService;

    public SomeBusinessImpl(DataService dataService) {
        super();
        this.dataService = dataService;
    }

    public int findTheGreatestFromAllData() {
        int[] data = dataService.retieveAllData();
        int greatestValue = Integer.MIN_VALUE;
        for (int value : data) {
            if (greatestValue < value) {
                greatestValue = value;
            }
        }
        return greatestValue;
    }
}
