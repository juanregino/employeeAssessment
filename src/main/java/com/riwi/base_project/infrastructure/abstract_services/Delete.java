package com.riwi.base_project.infrastructure.abstract_services;

public interface Delete<RequestDTO,ResponseDTO, ID> {
    void delete (ID id);
}
