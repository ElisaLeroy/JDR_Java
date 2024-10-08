package personnage;

import equipement.defensif.EquipementDefensif;
import equipement.offensif.EquipementOffensif;
import equipement.potion.Potion;

public abstract class Personnage {
    private String name;
    private String type;
    private int defaultPV;
    private int PV;
    private int forceAttaque;
    private int defaultForceAttaque;
    private EquipementOffensif equipementOffensif;
    private EquipementDefensif equipementDefensif;
    private Potion potion;

    public Personnage() {
        this("Toto");
    }
    public Personnage(String name) {
        this(name, "Personnage.Guerrier");
    }
    public Personnage(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public int getPV() {
        return PV;
    }
    public void setPV(int PV) {
        this.PV = PV;
    }
    public int getForceAttaque() {
        return forceAttaque;
    }
    public void setForceAttaque(int forceAttaque) {
        this.forceAttaque = forceAttaque;
    }
    public int getDefaultForceAttaque() {
        return defaultForceAttaque;
    }
    public int getDefaultPV() {
        return defaultPV;
    }

    public String toString() {
        return "";
    } //en mettre un par défaut


}
