package com.phutran.services;

import com.phutran.domain.AppVersion;
import com.phutran.domain.dto.AppVersionDto;

import java.util.List;


public interface AppVersionService {
    List<AppVersionDto> getVersionDto();
}
