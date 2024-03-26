class Vacancy {
    private String position;
    private String company;

    public Vacancy(String position, String company) {
        this.position = position;
        this.company = company;
    }

    public void sendVacancy() {
        // Здесь можно добавить логику отправки вакансии
        System.out.println("Вакансия отправлена: " + position + " в компании " + company);
    }
}