package org.nielsen.validParentheses;

import java.util.ArrayList;

public class ValidParentheses {

    static final String openParentheses = "(";
    static final String openBrakets = "[";
    static final String openBrace = "{";

    static final String closeParentheses = ")";
    static final String closeBrakets = "]";
    static final String closeBrace = "}";

    private static boolean isOpenSymbol(String s) {
        return s.equals(openBrace) || s.equals(openBrakets) || s.equals(openParentheses);
    }

    private static boolean isCloseSymbol(String s) {
        return s.equals(closeBrace) || s.equals(closeBrakets) || s.equals(closeParentheses);
    }

    public static boolean isValid(String s) {

        String[] p = s.split("");
        ArrayList<String> aux = new ArrayList<>();
        if (p.length % 2 != 0 || (p.length > 1 && isCloseSymbol(p[0]))) {
            return false;
        }
        for (String value : p) {
            if (isOpenSymbol(value)) {
                aux.add(value);
                continue;
            }

            if (aux.isEmpty()) {
                return false;
            }
            String last;
            switch (value) {
                case closeParentheses -> {
                    last = aux.remove(aux.size() - 1);
                    if (last.equals(openBrace) || last.equals(openBrakets)) {
                        return false;
                    }
                }
                case closeBrace -> {
                    last = aux.remove(aux.size() - 1);
                    if (last.equals(openParentheses) || last.equals(openBrakets)) {
                        return false;
                    }
                }
                case closeBrakets -> {
                    last = aux.remove(aux.size() - 1);
                    if (last.equals(openParentheses) || last.equals(openBrace)) {
                        return false;
                    }
                }
            }
        }
        return aux.isEmpty();
    }
}
