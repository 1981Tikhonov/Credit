class OldSystemCheck {
    public boolean oldCheckMethod(CreditApplication application) {
        // Логика проверки в старой системе
        return true; // false при отказе
    }
}

class OldSystemCheckAdapter implements CreditCheck {
    private OldSystemCheck oldSystemCheck;

    public OldSystemCheckAdapter(OldSystemCheck oldSystemCheck) {
        this.oldSystemCheck = oldSystemCheck;
    }

    @Override
    public boolean check(CreditApplication application) {
        return oldSystemCheck.oldCheckMethod(application);
    }
}
