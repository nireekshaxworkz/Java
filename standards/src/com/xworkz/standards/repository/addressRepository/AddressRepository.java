package com.xworkz.standards.repository.addressRepository;

public interface AddressRepository {
    boolean save();
    int update();
    void delete();
    String read();
}
