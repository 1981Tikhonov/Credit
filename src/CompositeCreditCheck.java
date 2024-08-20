import java.util.ArrayList;
import java.util.List;

class CompositeCreditCheck implements CreditCheck {
    private List<CreditCheck> checks = new ArrayList<>();

    public void addCheck(CreditCheck check) {
        checks.add(check);
    }

    @Override
    public boolean check(CreditApplication application) {
        for (CreditCheck check : checks) {
            if (!check.check(application)) {
                return false;
            }
        }
        return true;
    }
}
