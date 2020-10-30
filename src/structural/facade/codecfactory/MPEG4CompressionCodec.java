package structural.facade.codecfactory;

import structural.facade.codecfactory.Codec;

public class MPEG4CompressionCodec implements Codec {
    public String type = "mp4";

    @Override
    public String getType() {
        return type;
    }
}
