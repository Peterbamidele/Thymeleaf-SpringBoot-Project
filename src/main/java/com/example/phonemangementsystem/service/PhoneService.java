package com.example.phonemangementsystem.service;

import com.example.phonemangementsystem.model.Phone;
import org.springframework.stereotype.Service;

import java.util.List;


public interface PhoneService {
    List<Phone> getAllPhones();
    void savePhone(Phone phone);
    Phone getPhonebyId(Long id);
    void deletePhoneById(Long id);

}
