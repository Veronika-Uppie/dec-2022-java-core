package lessons.task4;

public enum Gender {
    MALE(true), FEMALE(false);

    private boolean pipka;

    public boolean isPipka() {return pipka;}

    public void setPipka(boolean pipka) {this.pipka = pipka;}

    private Gender() {}

    Gender(boolean pipka) {this.pipka = pipka;}
}
