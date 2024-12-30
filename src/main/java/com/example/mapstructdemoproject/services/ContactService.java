package com.example.mapstructdemoproject.services;

import com.example.mapstructdemoproject.dtos.ContactDTO;
import com.example.mapstructdemoproject.mapper.ContactMapper;
import com.example.mapstructdemoproject.models.Contact;
import com.example.mapstructdemoproject.repositories.ContactRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContactService {

    private final ContactRepository contactRepository;
    private final ContactMapper contactMapper;

    public ContactService(ContactRepository contactRepository, ContactMapper contactMapper) {
        this.contactRepository = contactRepository;
        this.contactMapper = contactMapper;
    }

    public Contact saveContact(ContactDTO contactDTO) {
        Contact contact = contactMapper.toEntity(contactDTO);
        return contactRepository.save(contact);
    }

    public ContactDTO getContactById(Long id) {
        Optional<Contact> contactFound = contactRepository.findById(id);
        return contactFound.map(contactMapper::toDTO).orElse(null);
    }

    public List<ContactDTO> getAllContacts() {
        List<Contact> contacts = contactRepository.findAll();
        return contactMapper.toDTOList(contacts);
    }

}
