package com.phutran.repositories;

import com.phutran.domain.AppVersion;
import com.phutran.domain.dto.AppVersionDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
public interface AppVersiionRepository extends MyBaseRepository<AppVersion, Long> {

    //@Query(value = "SELECT new com.phutran.domain.AppVersion( app.androidVersion, app.androidUrl) FROM  AppVersion app")
    @Query(value = "SELECT android_url, app.android_version  FROM  meatbox.app_version app", nativeQuery = true)
    List<AppVersionDto> getVersionDto();

}
