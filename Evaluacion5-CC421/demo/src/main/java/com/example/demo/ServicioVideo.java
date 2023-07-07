package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServicioVideo {
    static List<Video> videos = List.of(
            new Video("Tutorial SpringBoot"),
            new Video("Primer demo"),
            new Video("Avanzando!"));

    public Video create(Video nuevoVideo) {
        List<Video> extend = new ArrayList<>(videos);
        extend.add(nuevoVideo);
        this.videos = List.copyOf(extend);
        return nuevoVideo;
    }

}
