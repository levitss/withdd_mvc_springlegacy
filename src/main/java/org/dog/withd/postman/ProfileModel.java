package org.dog.withd.postman;

import lombok.Data;

@Data
public class ProfileModel {
    private int profileIdx;
    private String profileName;
    //사진 URL
    private String profileURL;
}
