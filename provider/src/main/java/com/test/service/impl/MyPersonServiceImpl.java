package com.test.service.impl;

import com.test.pojo.Person;
import com.test.service.MyPersonService;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

/**
 * Author: ping.deng
 * Date: 2022 - 04 - 14 - 3:27 PM
 * Description: RPCDemo -com.test.service.impl
 * Version: 1.0
 */

public class MyPersonServiceImpl extends UnicastRemoteObject implements MyPersonService {
    public MyPersonServiceImpl() throws RemoteException {
        super();
    }

    @Override
    public List<Person> findAll() throws RemoteException {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person(1,"张污污"));
        personList.add(new Person(2,"李珊珊"));
        return personList;
    }
}
