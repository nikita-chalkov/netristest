package ru.netristest.entity;

import lombok.Data;

@Data
public class CamList {
//    "id": 1,
//    "sourceDataUrl": "http://www.mocky.io/v2/5c51b230340000094f129f5d",
//    "tokenDataUrl": "http://www.mocky.io/v2/5c51b5b6340000554e129f7b?mocky-delay=1s"

    private long id;
    private String sourceDataUrl;
    private String tokenDataUrl;
}
