package util;

import entities.Produto;

import java.util.function.Function;

public class UpperCaseName implements Function<Produto, String> {

    @Override
    public String apply(Produto p) {
        return p.getNome().toUpperCase();
    }
}
