class Pet {
    Master person;
    int weight, age, eatTime1;
    int eat(int food, int drink, int time, String korm){
        if(time == eatTime1){
            person.getFood(food, drink, korm);
            return 1;
        } else return 0;
    }
    void voice(){};
}
