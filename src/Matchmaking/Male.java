package Matchmaking;

public class Male extends Person {
    private int height; // In CM

    public Male(){
        super("male");
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    // Used for debugging
    public String toString() {
        return "Matchmaking.Male{" +
                ", fullName='" + getFullName() + '\'' +
                ", age=" + getAge() +
                ", profession='" + getProfession() + '\'' +
                ", preferredGender='" + getPreferredGender() + '\'' +
                ", dominantFeature='" + getDominantFeature() + '\'' +
                ", maxPreferredAge=" + getMaxPreferredAge() +
                ", preferredProfession='" + getPreferredProfession() + '\'' +
                ", preferredDominantFeature='" + getPreferredDominantFeature() + '\'' +
                ", height=" + height +
                '}';
    }
}
