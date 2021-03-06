package br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.rule;

import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.rule.proponent.OnlyOnePrincipalProponentRule;
import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.rule.proponent.TwoProponentsRule;
import java.util.ArrayList;
import java.util.List;

public class ProponentRules {

    public static List<Rule> getRules() {
        List<Rule> rules = new ArrayList<Rule>();

        rules.add(new TwoProponentsRule());
        rules.add(new OnlyOnePrincipalProponentRule());

        return rules;
    }

}
