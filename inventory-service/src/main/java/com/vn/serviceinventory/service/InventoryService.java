package com.vn.serviceinventory.service;

import com.vn.serviceinventory.dto.InventoryResponse;
import com.vn.serviceinventory.model.Inventory;

import java.util.List;
import java.util.Optional;

public interface InventoryService {
    List<InventoryResponse> findBySkuCode(List<String> skuCode);
}
