public class BonusMilesService {
    public int calculate (int price) {
        int rubForBonus = 20;
        int miles = price / rubForBonus;
        return miles;
    }
}
