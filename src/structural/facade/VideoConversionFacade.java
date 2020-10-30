package structural.facade;

import structural.facade.codecfactory.Codec;
import structural.facade.codecfactory.CodecFactory;
import structural.facade.codecfactory.MPEG4CompressionCodec;
import structural.facade.codecfactory.OggCompressionCodec;

import java.io.File;
import java.util.Objects;

public class VideoConversionFacade {

    public File convertVideo(String fileName, String format) {
        System.out.println("VideoConversionFacade: conversion started.");
        VideoFile videoFile = new VideoFile(fileName);
        Codec sourceCode = CodecFactory.extract(videoFile);
        Codec destinationCodec = CodecFactory.getCodecByFormat(format);
        VideoFile buffer = BitrateReader.read(videoFile, sourceCode);
        VideoFile intermediateResult = BitrateReader.convert(buffer, destinationCodec);
        File result = new AudioMixer().fix(intermediateResult);
        System.out.println("VideoConversionFacade: conversion completed.");
        return result;
    }

}
