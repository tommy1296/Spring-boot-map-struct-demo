package com.example.mapstructdemoproject.controllers;

import com.example.mapstructdemoproject.dtos.ContactDTO;
import com.example.mapstructdemoproject.models.Contact;
import com.example.mapstructdemoproject.services.ContactService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ContactController {

    private final ContactService contactService;

    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }

    @PostMapping("/contacts")
    public ResponseEntity<Contact> save(@RequestBody ContactDTO contactDTO) {
        return ResponseEntity.ok(contactService.saveContact(contactDTO));
    }

    @GetMapping("/contacts/{id}")
    public ResponseEntity<ContactDTO> getById(@PathVariable Long id) {
        return ResponseEntity.ok(contactService.getContactById(id));
    }

    @GetMapping("/contacts")
    public ResponseEntity<List<ContactDTO>> getAll() {
        return ResponseEntity.ok(contactService.getAllContacts());
    }

}
