package com.myTube;

public class Main {

    public static void main(String[] args) {
        var video = new Video();
        video.setFileName("birthday.mp4");
        video.setTitle("Jennifer's birthday");
        video.setUser(new User("john@domain.com"));

        VideoEncoderable videoEncoder = new VideoEncoder();
        VideoDatabasable videoDatabase = new VideoDatabase();
        EmailServicable emailService = new EmailService();

        var processor = new VideoProcessor(video, videoEncoder, videoDatabase, emailService);
        processor.process();
    }
}
