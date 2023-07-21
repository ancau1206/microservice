package com.vn.serviceinventory.service.impl;

import com.vn.serviceinventory.dto.InventoryResponse;
import com.vn.serviceinventory.model.Inventory;
import com.vn.serviceinventory.repository.InventoryRepository;
import com.vn.serviceinventory.service.InventoryService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class InventoryServiceImpl implements InventoryService {
    private static final Logger logger = LoggerFactory.getLogger(InventoryService.class);
    private final InventoryRepository inventoryRepository;

    @Override
    @Transactional(readOnly = true)
    public List<InventoryResponse> findBySkuCode(List<String> skuCode) {
        return inventoryRepository.findBySkuCodeIn(skuCode).stream().
                map(inventory -> InventoryResponse.builder()
                        .skuCode(inventory.getSkuCode())
                        .isInStock(inventory.getQuantity() > 0)
                        .build()).toList();
    }
}
