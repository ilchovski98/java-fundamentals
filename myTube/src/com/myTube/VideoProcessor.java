package com.myTube;

public class VideoProcessor {
    private VideoEncoderable encoder;
    private VideoDatabasable database;
    private EmailServicable emailService;

    public VideoProcessor(VideoEncoderable encoder, VideoDatabasable database, EmailServicable emailService) {
        this.encoder = encoder;
        this.database = database;
        this.emailService = emailService;
    }

    public void process(Video video) {
        encoder.encode(video);
        database.store(video);
        emailService.sendEmail(video.getUser());
    }
}

