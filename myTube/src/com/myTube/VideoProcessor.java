package com.myTube;

public class VideoProcessor {
    Video video;
    VideoEncoderable encoder;
    VideoDatabasable database;
    EmailServicable emailService;

    public VideoProcessor(Video video, VideoEncoderable encoder, VideoDatabasable database, EmailServicable emailService) {
        this.video = video;
        this.encoder = encoder;
        this.database = database;
        this.emailService = emailService;
    }

    public void process() {
        encoder.encode(video);
        database.store(video);
        emailService.sendEmail(video.getUser());
    }
}

