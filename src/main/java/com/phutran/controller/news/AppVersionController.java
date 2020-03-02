package com.phutran.controller.news;

import com.phutran.domain.AppVersion;
import com.phutran.domain.dto.AppVersionDto;
import com.phutran.repositories.AppVersiionRepository;
import com.phutran.services.AppVersionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("news")
public class AppVersionController {
    @Autowired
    private AppVersionService appVersionService;

    @ResponseBody
    @GetMapping("version")
    public String index() {
        List<AppVersionDto> appVersions =  appVersionService.getVersionDto();
        System.out.println(appVersions);
        return "Controller app version";
    }
}
