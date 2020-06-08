package com.oklimenko.oauth2.mapper;

import com.oklimenko.oauth2.dto.TestDto;
import com.oklimenko.oauth2.entity.Test;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * Converts DTO and Entity, related to Test domain object.
 *
 * @author oklimenko@gmail.com
 */
@Mapper(componentModel = "spring")
public interface TestMapper {
    Test createDtoToEntity(TestDto request);
    List<TestDto> createDtoToEntity(List<Test> request);
}
