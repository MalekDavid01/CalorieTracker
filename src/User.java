import java.util.*;

public class User {
    private String userName;
    private String gender;
    private int height;
    private int weight;
    private int goalWeight;
    private String email;
    private String password;
    private ArrayList<FoodItem> breakfast;
    private ArrayList<FoodItem> lunch;
    private ArrayList<FoodItem> dinner;
    private ArrayList<FoodItem> snacks;
    private int water;
    private String fitnessActivity;

    //No argument constructor
    public User() {
        breakfast = new ArrayList<>();
        lunch = new ArrayList<>();
        dinner = new ArrayList<>();
        snacks = new ArrayList<>();
    }

    public String getEmail() { return email; }
    public String getUserName() { return userName; }

    public void addToBreakfast(FoodItem food) { breakfast.add(food); }
    public void addToLunch(FoodItem food) { lunch.add(food); }
    public void addToDinner(FoodItem food) { dinner.add(food); }
    public void addToSnacks(FoodItem food) { snacks.add(food); }
    public int getTotalCalories() {
        int totalCal = 0;
        ArrayList<FoodItem> FoodItems = new ArrayList<>();
        FoodItems.addAll(breakfast);
        FoodItems.addAll(lunch);
        FoodItems.addAll(dinner);
        FoodItems.addAll(snacks);

        for(FoodItem food: FoodItems) {
            totalCal += food.getCalories();
        }
        return totalCal;
    }


}
