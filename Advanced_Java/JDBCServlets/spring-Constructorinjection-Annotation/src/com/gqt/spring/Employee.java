package com.gqt.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee{
    private Address addr;
    
    @Autowired
    public Employee(Address addr) {
    	super();
    	this.addr=addr;
    }
    public String getAddress() {
    	return addr.getAddress();
    }
}
