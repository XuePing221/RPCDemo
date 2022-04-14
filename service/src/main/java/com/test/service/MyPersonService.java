package com.test.service;

import com.test.pojo.Person;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 * Author: ping.deng
 * Date: 2022 - 04 - 14 - 3:20 PM
 * Description: RPCDemo -com.test.service
 * Version: 1.0
 */

public interface MyPersonService extends Remote {
    public List<Person> findAll() throws RemoteException;
}
