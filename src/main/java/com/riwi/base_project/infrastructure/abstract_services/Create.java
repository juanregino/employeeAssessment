package com.riwi.base_project.infrastructure.abstract_services;

public interface Create<RequestDTO, ResponseDTO, ID> {
    ResponseDTO create (RequestDTO request);
}
