package com.oklimenko.oauth2.service;

import com.oklimenko.oauth2.dto.TestDto;
import com.oklimenko.oauth2.logging.LogMethodStartExit;
import com.oklimenko.oauth2.mapper.TestMapper;
import com.oklimenko.oauth2.repository.TestRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Test service.
 *
 * @author oklimenko@gmail.com
 */
@Slf4j
@RequiredArgsConstructor
@LogMethodStartExit
@Service
@Transactional(Transactional.TxType.REQUIRED)
public class TestService {

    private final TestRepository testRepository;
    private final TestMapper testMapper;

    public List<TestDto> getResults() {
        return testMapper.createDtoToEntity(testRepository.findAll());
    }

}
