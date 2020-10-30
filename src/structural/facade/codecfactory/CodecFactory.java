package structural.facade.codecfactory;

import structural.facade.VideoFile;

import java.util.*;

public class CodecFactory {

    private static final Map<String, Codec> codecs = Map.ofEntries(
            Map.entry("mp4", new MPEG4CompressionCodec()),
            Map.entry("ogg", new OggCompressionCodec())
    );

    public static Codec extract(VideoFile videoFile) {
        String type = videoFile.getCodecType();
        Optional<String> first = codecs.keySet().stream()
                .filter(type::equals)
                .findFirst();

        if (first.isPresent()) {
            Codec codec = codecs.get(first.get());
            System.out.printf("CodeFactory: extracting %s audio...%n", codec.getType());
            return codec;
        }

        System.out.println("CodeFactory: extracting ogg audio...");
        return new OggCompressionCodec();
    }

    public static Codec getCodecByFormat(String format) {
        Optional<String> first = codecs.keySet().stream()
                .filter(format::equals)
                .findFirst();
        return first.isPresent() ? codecs.get(first.get()) : new OggCompressionCodec();
    }
}
