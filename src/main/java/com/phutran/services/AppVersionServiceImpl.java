package com.phutran.services;

import com.phutran.domain.AppVersion;
import com.phutran.domain.dto.AppVersionDto;
import com.phutran.repositories.AppVersiionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppVersionServiceImpl implements AppVersionService {
    @Autowired
    private AppVersiionRepository appVersiionRepository;

    @Override
    public List<AppVersionDto> getVersionDto() {
        return appVersiionRepository.getVersionDto();
    }
}
