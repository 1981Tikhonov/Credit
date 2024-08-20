public class Main {
    public static void main(String[] args) {
        // Заявка на кредит
        CreditApplication application = new CreditApplication();
        // Заполняем заявку

        // Используем фасад для проверки заявки
        CreditApprovalFacade facade = new CreditApprovalFacade();
        boolean result = facade.approveCredit(application);

        if (result) {
            System.out.println("Credit approved");
        } else {
            System.out.println("Credit denied");
        }
    }
}
