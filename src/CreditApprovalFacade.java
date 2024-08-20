class CreditApprovalFacade {
    private CompositeCreditCheck creditCheck;

    public CreditApprovalFacade() {
        creditCheck = new CompositeCreditCheck();
        creditCheck.addCheck(new AgeCheck());
        creditCheck.addCheck(new BlacklistCheck());
        creditCheck.addCheck(new AlimonyCheck());
        creditCheck.addCheck(new FineCheck());
        creditCheck.addCheck(new CreditHistoryCheck());
        creditCheck.addCheck(new EmploymentCheck());
        creditCheck.addCheck(new MaritalStatusCheck());
    }

    public boolean approveCredit(CreditApplication application) {
        return creditCheck.check(application);
    }
}
