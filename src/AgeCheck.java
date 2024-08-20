class AgeCheck implements CreditCheck {
    @Override
    public boolean check(CreditApplication application) {
        // Проверка возраста
        return true; // false при отказе
    }
}

class BlacklistCheck implements CreditCheck {
    @Override
    public boolean check(CreditApplication application) {
        // Проверка по стоп-листам
        return true; // false при отказе
    }
}

class AlimonyCheck implements CreditCheck {
    @Override
    public boolean check(CreditApplication application) {
        // Проверка алиментов
        return true; // Или false при отказе
    }
}

class FineCheck implements CreditCheck {
    @Override
    public boolean check(CreditApplication application) {
        // Проверка штрафов
        return true; // false при отказе
    }
}

class CreditHistoryCheck implements CreditCheck {
    @Override
    public boolean check(CreditApplication application) {
        // Проверка кредитной истории
        return true; // false при отказе
    }
}

class EmploymentCheck implements CreditCheck {
    @Override
    public boolean check(CreditApplication application) {
        // Проверка места работы
        return true; // false при отказе
    }
}

class MaritalStatusCheck implements CreditCheck {
    @Override
    public boolean check(CreditApplication application) {
        // Проверка семейного положения
        return true; // false при отказе
    }
}
