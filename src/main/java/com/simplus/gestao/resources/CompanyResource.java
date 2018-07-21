package com.simplus.gestao.resources;

import java.util.List;
import java.util.stream.Collectors;

import com.simplus.gestao.resources.utils.URL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.simplus.gestao.domain.Product;
import com.simplus.gestao.domain.Company;
import com.simplus.gestao.dto.ProductDTO;
import com.simplus.gestao.dto.CompanyDTO;
import com.simplus.gestao.services.ProductService;
import com.simplus.gestao.services.CompanyService;

@RestController
@RequestMapping(value="/companys")
public class CompanyResource {

    @Autowired
    private CompanyService service;

    @Autowired
    private ProductService productService;

    @RequestMapping(method=RequestMethod.GET)
    public ResponseEntity<List<CompanyDTO>> findAll() {
        List<Company> list = service.findAll();
        List<CompanyDTO> listDto = list.stream().map(obj -> new CompanyDTO(obj)).collect(Collectors.toList());
        return ResponseEntity.ok().body(listDto);
    }

    @RequestMapping(value="/{companyId}/products", method=RequestMethod.GET)
    public ResponseEntity<List<ProductDTO>> findProducts(@PathVariable Integer companyId) {
        List<Product> list = productService.findByCompany(companyId);
        List<ProductDTO> listDto = list.stream().map(obj -> new ProductDTO(obj)).collect(Collectors.toList());
        return ResponseEntity.ok().body(listDto);
    }

    @RequestMapping(value="/products13", method=RequestMethod.GET)
    public ResponseEntity<List<ProductDTO>> findProducts13() {
        List<Product> list = productService.findByCompany13();
        List<ProductDTO> listDto = list.stream().map(obj -> new ProductDTO(obj)).collect(Collectors.toList());
        return ResponseEntity.ok().body(listDto);
    }

    @RequestMapping(value="/products14", method=RequestMethod.GET)
    public ResponseEntity<List<ProductDTO>> findProducts14() {
        List<Product> list = productService.findByCompany14();
        List<ProductDTO> listDto = list.stream().map(obj -> new ProductDTO(obj)).collect(Collectors.toList());
        return ResponseEntity.ok().body(listDto);
    }

}

