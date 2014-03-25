package packAstro;


// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.99C0E25B-0BEC-B7BD-DBC2-7B2F24CA8194]
// </editor-fold> 
public class Etoile extends ObjCeleste {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.FC59270B-EEA3-D62E-32DA-A0B650974291]
    // </editor-fold> 
    public static final int ETOILE = 4;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.C0BA0B6E-BF74-357E-BB49-B08B13CFB7B5]
    // </editor-fold> 
    private int magnitude;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.C53EFBBA-DF25-4ADB-CC80-47675298ED69]
    // </editor-fold> 
    private char ageLettre;
    
    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.DF14E4CB-5136-153E-DFB6-D829C2724E05]
    // </editor-fold> 
    public Etoile () {
        
    }
    
    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.364061EA-8F89-4037-0F74-289687D76A61]
    // </editor-fold> 
    public String toString () {
        return null;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.3050F754-130A-D834-2EF9-0D498B7143C8]
    // </editor-fold> 
    public void creerEtoile (String nom, int magnitude, char age_lettre, Galaxie galaxie) {
    }

    public Galaxie getGalaxie() {
        return null;
    }
    
    public int getMagnitude() {
        return magnitude;
    }
    
    public char getAgeLettre() {
        return ageLettre;
    }

}

