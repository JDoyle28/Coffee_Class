public class Coworker {
    String name;
    String coffee;
    Integer price;
    Integer debt;

    public Coworker(String name, String coffee, Integer price) {
        this.name = name;
        this.coffee = coffee;
        this.price = price;
        this.debt = 0;
    }

    public void addDebt(Integer debt) {
        this.debt = this.debt + debt;
    }

    public void subDebt(Integer debt) {
        this.debt = this.debt - debt;
    }

    public Integer getDebt() {
        return this.debt;
    }
}
