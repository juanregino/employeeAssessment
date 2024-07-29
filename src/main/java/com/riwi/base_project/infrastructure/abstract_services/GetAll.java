package com.riwi.base_project.infrastructure.abstract_services;

import java.util.List;

public interface GetAll<RequestDTO,ResponseDTO, ID> {
    List<ResponseDTO> getAll(ID id);
}
