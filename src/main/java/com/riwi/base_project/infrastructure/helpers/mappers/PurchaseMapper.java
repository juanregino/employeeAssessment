package com.riwi.base_project.infrastructure.helpers.mappers;

import com.riwi.base_project.api.dto.request.PurchaseRequest;
import com.riwi.base_project.api.dto.response.basic.PurchaseBasicResponse;
import com.riwi.base_project.domain.entities.PurchaseEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

import java.util.List;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface PurchaseMapper {

    @Mapping(target = "id",ignore = true)
    @Mapping(target = "subtotal")
    @Mapping(target = "total")
    @Mapping(target = "dueDate")
    PurchaseEntity toPurchaseEntity(PurchaseRequest purchaseRequest);

    @InheritInverseConfiguration
    PurchaseBasicResponse toPurchaseBasicResponse(PurchaseEntity purchaseEntity);

    List<PurchaseBasicResponse> purchaseListoToPurchaseBasicResponseList(List<PurchaseEntity> purchaseEntities);
}
