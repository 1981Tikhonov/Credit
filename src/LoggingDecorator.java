class LoggingDecorator implements CreditCheck {
    private CreditCheck decoratedCheck;

    public LoggingDecorator(CreditCheck decoratedCheck) {
        this.decoratedCheck = decoratedCheck;
    }

    @Override
    public boolean check(CreditApplication application) {
        System.out.println("Checking " + decoratedCheck.getClass().getSimpleName());
        boolean result = decoratedCheck.check(application);
        System.out.println("Result: " + (result ? "Approved" : "Rejected"));
        return result;
    }
}
