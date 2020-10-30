package structural.facade;

import java.io.File;

/**
 * Description: https://refactoring.guru/design-patterns/facade
 *
 * Facade is a structural design pattern that provides a simplified interface to a library, a framework,
 * or any other complex set of classes.
 *
 * A facade is a class that provides a simple interface to a complex subsystem which contains lots of moving parts.
 * A facade might provide limited functionality in comparison to working with the subsystem directly.
 * However, it includes only those features that clients really care about.
 */

public class FacadeMain {
    public static void main(String[] args) {
        VideoConversionFacade converter = new VideoConversionFacade();
        File mp4Video = converter.convertVideo("video.ogg", "mp4");

    }
}
