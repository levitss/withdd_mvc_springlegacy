package org.dog.withd.controller;

import lombok.RequiredArgsConstructor;
import org.dog.withd.component.S3Uploader;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RequiredArgsConstructor
@Controller
public class S3Controller {

    private final S3Uploader s3Uploader;

//    @GetMapping("/index")
//    public String index() {
//        return "/index";
//    }

    @PostMapping("/upload/image")
    @ResponseBody
    public String upload(@RequestParam("data") MultipartFile multipartFile) throws IOException {
        return s3Uploader.upload(multipartFile, "static");
    }
    @PostMapping("/upload/image/dog")
    @ResponseBody
    public String uploadDog(@RequestParam("data") MultipartFile multipartFile) throws IOException {
        return s3Uploader.upload(multipartFile, "static/dog");
        //업로드 후 세션에 있는 user id 조회 후 해당 dto에 정보 넣고 dao행
    }
}




