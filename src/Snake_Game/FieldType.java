package Snake_Game;

public enum FieldType {
    EMPTY(0," "),
    SNAKE(10, "*"),
    FRUIT(20,"+");

    int value;
    String display;
    FieldType(int value, String display){
        this.value = value;
        this.display = display;
    }


}
