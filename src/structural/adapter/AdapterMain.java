package structural.adapter;

/**
 *
 * Description: https://refactoring.guru/design-patterns/adapter
 *
 * Adapter is a structural design pattern that allows objects with incompatible interfaces to collaborate.
 *
 * An structural.adapter wraps one of the objects to hide the complexity of conversion happening behind the scenes.
 * The wrapped object isn’t even aware of the structural.adapter. For example, you can wrap an object that operates in
 * meters and kilometers with an structural.adapter that converts all of the data to imperial units such as feet and miles.
 *
 * Adapters can not only convert data into various formats but can also help objects with different interfaces
 * collaborate. Here’s how it works:
 *
 * 1. The structural.adapter gets an interface, compatible with one of the existing objects.
 * 2. Using this interface, the existing object can safely call the structural.adapter’s methods.
 * 3. Upon receiving a call, the structural.adapter passes the request to the second object,
 * but in a format and order that the second object expects.
 *
 */

public class AdapterMain {

    public static void main(String[] args) {
        RoundHole roundHole = new RoundHole(5);
        RoundPeg roundPeg = new RoundPeg(5);
        System.out.println(roundHole.fits(roundPeg));

        SquarePeg smallSquarePeg = new SquarePeg(2);
        SquarePeg bigSquarePeg = new SquarePeg(20);
        // roundHole.fits(smallSquarePeg) this won't compile (incompatible types)

        RoundPeg smallSquarePegAdapter = new SquarePegAdapter(smallSquarePeg);
        RoundPeg bigSquarePegAdapter = new SquarePegAdapter(bigSquarePeg);

        System.out.println(roundHole.fits(smallSquarePegAdapter));
        System.out.println(roundHole.fits(bigSquarePegAdapter));
    }
}
