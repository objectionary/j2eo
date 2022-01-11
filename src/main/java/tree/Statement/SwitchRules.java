package tree.Statement;

import java.util.ArrayList;
import tree.Entity;

public class SwitchRules extends Entity {
    // Structure
    public ArrayList<SwitchRule> rules;

    // Creation
    public SwitchRules(SwitchRule rule) {
        this.rules = new ArrayList<>();
        this.rules.add(rule);
    }

    public SwitchRules add(SwitchRule rule) {
        this.rules.add(rule);
        return this;
    }

    // Reporting
    public void report(int sh) {

    }

}
