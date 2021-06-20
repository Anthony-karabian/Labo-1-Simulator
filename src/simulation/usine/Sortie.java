package simulation.usine;

public class Sortie {

    private MaterialType materialType;

    private String iconPath;

    public Sortie(MaterialType materialType){
        this.materialType = materialType;
    }

    public void setMaterialType(MaterialType materialType) {
        this.materialType = materialType;
    }

    public void setIconPath(String iconPath) {
        this.iconPath = iconPath;
    }
}
