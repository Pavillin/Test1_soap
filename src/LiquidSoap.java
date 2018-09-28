import javafx.scene.image.Image;

public class LiquidSoap {
    private String brandName, intendedUse;
    private int volume;
    private Image image;

    public LiquidSoap(String brandName, String intendedUse, int volume, Image image) {
        setBrandName(brandName);
        setIntendedUse(intendedUse);
        setVolume(volume);
        setImage(image);
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        if(brandName.isEmpty()){
            throw new IllegalArgumentException("The brand name cannot be empty");
        } else {
            this.brandName = brandName;
        }
    }

    public String getIntendedUse() {
        return intendedUse;
    }

    public void setIntendedUse(String intendedUse) {
        if(intendedUse.equals("Dish") || intendedUse.equals("Hand") || intendedUse.equals("Floor")) {
            this.intendedUse = intendedUse;
        } else {
            throw new IllegalArgumentException("The intended use must be one of the following: Dish, Hand, or Floor.");
        }
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if(volume > 0 && volume <= 10000){
            this.volume = volume;
        } else {
            throw new IllegalArgumentException("The volume (in mL) must be between 0 and 10000");
        }
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public String toString(){
        return (brandName + " (" + volume + "ml)");
    }
}
