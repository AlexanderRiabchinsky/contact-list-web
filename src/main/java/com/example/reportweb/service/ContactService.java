package com.example.reportweb.service;

import com.example.reportweb.Contact;

import java.util.List;

public interface ContactService {
    List<Contact> findAll();
    Contact findById(Long id);
    Contact save(Contact contact);
    Contact update(Contact contact);
    void deleteById(Long id);
    void batchInsert(List<Contact>contacts);
}
