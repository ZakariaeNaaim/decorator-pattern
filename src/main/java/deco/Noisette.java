package deco;

import produits.Boisson;

/**
 * @author mohamedyoussfi
 **/
public class Noisette extends DecorateurBoisson {
    public Noisette(Boisson boisson) {
        super(boisson);
    }

    @Override
    public String getDescription() {
        return boisson.getDescription()+" Au Noisette";
    }

    @Override
    public double price() {
        return 1.2 + boisson.price();
    }
}
