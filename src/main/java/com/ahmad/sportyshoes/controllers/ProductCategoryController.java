package com.ahmad.sportyshoes.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.ahmad.sportyshoes.services.ProductCategoryService;

/**
 * ProductCategoryController
 */
@RestController
public class ProductCategoryController {

    @Autowired
    ProductCategoryService service;

}