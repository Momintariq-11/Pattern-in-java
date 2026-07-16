//Task 3: Builder — Meal Order Builder
//Design a Meal object that can have many optional parts: mainCourse, drink, dessert, extraSpicy, noOnions, etc.
//Instead of a constructor with 8 parameters, use a MealBuilder with chainable methods:
//javaMeal m = new MealBuilder().addMain("Burger").addDrink("Coke").extraSpicy().build();
//This directly demonstrates KISS, the calling code stays simple even though the object is complex
class Meal {
    String mainCourse;
    String drink;
    String dessert;
    String spicyLevel;
    String onionsOption;
    Meal(MealBuilder builder) {
        this.mainCourse = builder.getMainCourse();
        this.drink = builder.getDrink();
        this.dessert = builder.getDessert();
        this.spicyLevel = builder.getSpicyLevel();
        this.onionsOption = builder.getOnionsOption();
    }
    public void showMeal() {
        System.out.println(" Your Meal Order");
        System.out.println("Main Course: " + (mainCourse != null ? mainCourse : "None"));
        System.out.println("Drink:       " + (drink != null ? drink : "None"));
        System.out.println("Dessert:     " + (dessert != null ? dessert : "None"));
        System.out.println("Spicy Level: " + (spicyLevel != null ? spicyLevel : "None"));
        System.out.println("Onions:      " + (onionsOption != null ? onionsOption : "None"));
    }
    public static class MealBuilder {
        private String mainCourse;
        private String drink;
        private String dessert;
        private String spicyLevel;
        private String onionsOption;
        public MealBuilder() {}
        public MealBuilder addMain(String mainCourse) {
            this.mainCourse = mainCourse;
            return this;
        }
        public MealBuilder addDrink(String drink) {
            this.drink = drink;
            return this;
        }
        public MealBuilder addDessert(String dessert) {
            this.dessert = dessert;
            return this;
        }
        public MealBuilder addextraSpicy(String spicyLevel) {
            this.spicyLevel = spicyLevel;
            return this;
        }
        public MealBuilder addnoOnions(String onionsOption) {
            this.onionsOption = onionsOption;
            return this;
        }
        public String getMainCourse()   { return this.mainCourse; }
        public String getDrink()        { return this.drink; }
        public String getDessert()      { return this.dessert; }
        public String getSpicyLevel()   { return this.spicyLevel; }
        public String getOnionsOption() { return this.onionsOption; }
        public Meal build() {
            return new Meal(this);
        }
    }
}
public class builder {
    public static void main(String[] args) {
        Meal m = new Meal.MealBuilder()
                .addMain("Burger")
                .addDrink("Coke")
                .addDessert("Ice Cream")
                .addextraSpicy("extra")
                .addnoOnions("no onions")
                .build();

        m.showMeal();
    }
}
