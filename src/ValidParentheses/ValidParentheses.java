package ValidParentheses;

import java.util.ArrayList;

public class ValidParentheses {

    String openParentheses = "(";
    String openBrakets = "[";
    String openBrace = "{";

    final String closeParentheses = ")";
    final String closeBrakets = "]";
    final String closeBrace = "}";

    private boolean isOpenSymbol(String s) {
        return s.equals(openBrace) || s.equals(openBrakets) || s.equals(openParentheses);
    }

    private boolean isCloseSymbol(String s) {
        return s.equals(closeBrace) || s.equals(closeBrakets) || s.equals(closeParentheses);
    }

    public boolean isValid(String s) {

        String[] p = s.split("");
        ArrayList<String> aux = new ArrayList<String>();
        if (p.length == 1 || p.length % 2 != 0 || (p.length >  1 && isCloseSymbol(p[0]))) {
            return false;
        }
        for (int i = 0; i < p.length; i ++) {
            if (isOpenSymbol(p[i])) {
                aux.add(p[i]);
                continue;
            }

            if (aux.isEmpty()) {
                return false;
            }
            String last;
            switch (p[i]) {
                case closeParentheses:
                    last = aux.remove(aux.size() - 1);
                    if (last.equals(openBrace) || last.equals(openBrakets)){
                        return false;
                    }
                    break;
                case closeBrace:
                    last = aux.remove(aux.size() - 1);
                    if (last.equals(openParentheses) || last.equals(openBrakets)){
                        return false;
                    }
                    break;
                case closeBrakets:
                    last = aux.remove(aux.size() - 1);
                    if (last.equals(openParentheses) || last.equals(openBrace)){
                        return false;
                    }
                    break;

            }
        }
        return aux.isEmpty();
    }
}
