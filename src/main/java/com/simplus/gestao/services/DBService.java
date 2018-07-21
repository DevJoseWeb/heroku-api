package com.simplus.gestao.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

import com.simplus.gestao.domain.*;
import com.simplus.gestao.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class DBService {

    @Autowired
    private CompanyRepository companyRepository;

    public void instantiateTestDatabase() throws ParseException {

        Company com1 = new Company(null,"Empresa de Produtos Para Banho");
        Company com2 = new Company(null,"Empresa de Produtos Higiênicos");

        companyRepository.saveAll(Arrays.asList(com1, com2));

    }
}
