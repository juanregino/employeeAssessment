package com.riwi.base_project.infrastructure.abstract_services;

public interface Update<RequestDTO,ResponseDTO, ID>{

    ResponseDTO update (ID id, RequestDTO request);
}
