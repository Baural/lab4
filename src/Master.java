class Master {
    private String name;

    String GetName() {
        return this.name;
    }

    Master(String Name){
        this.name = Name;
    }

    public void getFood(int food, int drink, String korm){
        System.out.println(korm);
    }
}
