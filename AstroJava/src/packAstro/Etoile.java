package packAstro;


// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.99C0E25B-0BEC-B7BD-DBC2-7B2F24CA8194]
// </editor-fold> 
public abstract class Etoile extends ObjCeleste {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.51214FDF-16ED-8AA5-3B01-89BC081A7D05]
    // </editor-fold> 
    private Galaxie galaxie;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.FC59270B-EEA3-D62E-32DA-A0B650974291]
    // </editor-fold> 
    private static final int ETOILE = 4;

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
    // #[regen=yes,id=DCE.24E96F7F-A8FB-E5F1-4E57-5358BE5981EC]
    // </editor-fold> 
    public Galaxie getGalaxie () {
        return null;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.28E51D75-6AB4-83FA-057B-D4A09008C037]
    // </editor-fold> 
    public void setGalaxie (Galaxie val) {
        this.galaxie = val;
    }

}

