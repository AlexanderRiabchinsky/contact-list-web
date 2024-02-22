package com.example.reportweb.service;

import com.example.reportweb.Contact;
import com.example.reportweb.repository.ContactRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class ContactServiceImpl implements ContactService{
    private final ContactRepository contactRepository;

    @Override
    public List<Contact> findAll() {
        log.info("Call findAll in ContactServiceImpl");
        return contactRepository.findAll();
    }

    @Override
    public Contact findById(Long id) {
        log.info("Call findById in ContactServiceImpl");
        return contactRepository.findById(id).orElse(null);
    }

    @Override
    public Contact save(Contact contact) {
        log.info("Call save in ContactServiceImpl");
        return contactRepository.save(contact);
    }

    @Override
    public Contact update(Contact contact) {
        log.info("Call update in ContactServiceImpl");
        return contactRepository.update(contact);
    }

    @Override
    public void deleteById(Long id) {
        log.info("Call deleteById in ContactServiceImpl");
        contactRepository.deleteById(id);
    }

    @Override
    public void batchInsert(List<Contact> contacts) {
        log.info("Call batchInsert in ContactServiceImpl");
        contactRepository.batchInsert(contacts);
    }
}
