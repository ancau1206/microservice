package com.vn.productservice.service;

import com.vn.productservice.dto.ProductRequest;
import com.vn.productservice.dto.ProductResponse;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ProductService {
    public void createProduct(ProductRequest productRequest);
    public List<ProductResponse> getAllProducts();
}
