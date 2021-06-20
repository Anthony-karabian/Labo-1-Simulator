package simulation.usine;

public class Entree {

    private MaterialType materialType;

    private int quantity = 0;

    private String iconPath;

    public Entree(MaterialType materialType){

        this.materialType = materialType;
    }

    public void setMaterialType(MaterialType materialType) {
        this.materialType = materialType;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setIconPath(String iconPath) {
        this.iconPath = iconPath;
    }
}
