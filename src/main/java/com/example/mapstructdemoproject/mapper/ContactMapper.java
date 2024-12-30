package com.example.mapstructdemoproject.mapper;

import com.example.mapstructdemoproject.dtos.ContactDTO;
import com.example.mapstructdemoproject.models.Contact;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ContactMapper {

    @Mapping(source = "emailId", target = "email")
    @Mapping(source = "contactNo", target = "phoneNo")
    Contact toEntity(ContactDTO contactDTO);

    @Mapping(source = "email", target = "emailId")
    @Mapping(source = "phoneNo", target = "contactNo")
    ContactDTO toDTO(Contact contact);

    List<ContactDTO> toDTOList(List<Contact> contacts);

}
