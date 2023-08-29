package com.platzi.market.persistence.mapper;

import ch.qos.logback.core.net.server.Client;
import com.platzi.market.domain.Costumer;
import com.platzi.market.persistence.entity.Cliente;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface CostumerMapper {
    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "nombre", target = "firstName"),
            @Mapping(source = "apellidos", target = "lastName"),
            @Mapping(source = "celular", target = "celphone"),
            @Mapping(source = "direccion", target = "address"),
            @Mapping(source = "correoElectronico", target = "email"),
    })
    Costumer toCostumer(Cliente cliente);
}
