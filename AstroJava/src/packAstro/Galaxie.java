package packAstro;

import java.util.ArrayList; 

// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.A6D1F472-C7CA-11FF-2F58-DF1EBB79DAA3]
// </editor-fold> 
public class Galaxie {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.A9C859B4-C516-E099-9934-5D50EDC294A7]
    // </editor-fold> 
    private String nom;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.8D572F9A-A357-620A-B644-8ED44A5D1261]
    // </editor-fold> 
    private String type;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.EAC47BC2-201F-91AB-19FC-D3C25FF8FC62]
    // </editor-fold> 
    private int eloignement;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.DCC72505-612D-6FB9-CF24-30A0DD87A26B]
    // </editor-fold> 
    private ArrayList<Etoile> etoiles;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.E0441E6B-49B3-9F18-C989-65FD173159E3]
    // </editor-fold> 
    Galaxie (String nom, String type, int eloignement) {
        this.nom = nom;
        this.type = type;
        this.eloignement = eloignement;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.C56870D8-ED25-D73B-DAF0-0F5AB1D2D997]
    // </editor-fold> 
    public ArrayList<Etoile> listeEtoiles () {
        return this.etoiles;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.78735B16-2F21-6557-3CF5-7489A30C38ED]
    // </editor-fold> 
    public int nbEtoiles () {
        return this.etoiles.size();
    }
    
    public String getNom() {
        return nom;
    }
    
    /* TODO */
    public String toString() {
        return this.nom
                + ", "
                + this.type
                + ", eloignement "
                + this.eloignement
                + " ; "
                + this.nbEtoiles() 
                + " etoile(s)";
    }

}

