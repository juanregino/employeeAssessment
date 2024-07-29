package com.riwi.base_project.infrastructure.abstract_services;

public interface GetEntity<RequestDTO,ResponseDTO, ID>{
    ResponseDTO read (ID id);
}
