package structural.facade.codecfactory;

import structural.facade.codecfactory.Codec;

public class OggCompressionCodec implements Codec {
    public String type = "ogg";

    @Override
    public String getType() {
        return type;
    }
}
