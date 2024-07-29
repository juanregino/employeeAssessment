package com.riwi.base_project.infrastructure.helpers.mappers;

import com.riwi.base_project.api.dto.request.UserRequest;
import com.riwi.base_project.api.dto.response.basic.UserBasicResponse;
import com.riwi.base_project.domain.entities.UserEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

import java.util.List;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface UserMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "name")
    @Mapping(target = "phone")
    @Mapping(target = "email")
    @Mapping(target = "password")
    UserEntity toUserEntity(UserRequest userRequest);

    @InheritInverseConfiguration
    UserBasicResponse toUserBasicResponse(UserEntity userEntity);

    List<UserBasicResponse> userListtoUserBasicResponseList(List<UserEntity> userEntities);

}