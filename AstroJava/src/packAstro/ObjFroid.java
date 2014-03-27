package packAstro;


// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.23C6C849-D4E8-6114-A642-72F3CECCDC68]
// </editor-fold> 
public class ObjFroid extends ObjCeleste {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.615E7352-67E0-CD04-92DD-6FAB2DDAF22C]
    // </editor-fold> 
    private int rayonMoyenOrbite;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.D0970C9F-F7F7-323B-DAD3-789B45321B61]
    // </editor-fold> 
    private int diametre;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.205944BB-4A75-A038-3813-93DD9B4E0F9D]
    // </editor-fold> 
    private int periodeRevo;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.4300CB92-222D-A1B0-8FD5-7DBF34021909]
    // </editor-fold> 
    private ObjCeleste centre;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.5EBFD394-3348-6BF4-6F8E-D1D388057DDF]
    // </editor-fold> 
    public ObjCeleste getCentre () {
        return this.centre;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.9418ADDE-1011-C0D9-D640-82F9210ADE3E]
    // </editor-fold> 
    public String toString () {
        int nbSat = super.nbDeSatellites();
        String s = super.getCodeObj() 
                + " - \"" 
                + super.getNom() 
                + "\" : " 
                + super.getTypeString()
                + " ; galaxie : " 
                + this.getGalaxie() 
                + " ; diam : " 
                + this.diametre 
                + " , gravite autour de " 
                + this.getCentre() 
                + " à " 
                + this.periodeRevo 
                + "mkm ; " 
                + nbSat
                + " satellite";
        if(nbSat > 1) 
            s += "s";
        return s;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.00AEA4DA-A61D-5F56-ACA3-2E02CE9E10F7]
    // </editor-fold> 
    ObjFroid (int codeObj, String nom, int type, int rayonMoyenOrbite, int diametre, int periodeRevolution, ObjCeleste centre) {
        super.setCodeObj(codeObj);
        super.setNom(nom);
        super.setType(type);
        this.rayonMoyenOrbite = rayonMoyenOrbite;
        this.diametre = diametre;
        this.periodeRevo = periodeRevolution;
        this.centre = centre;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.DB5B14C9-1375-BD5A-01F0-E8399CF4E4B2]
    // </editor-fold> 
    public Galaxie getGalaxie () {
        if(this.getCentre().getType() != ObjCeleste.ETOILE)
           return this.getCentre().getGalaxie();
        else 
           return this.getGalaxie();
    }
    
    public int getDiametre() {
        return this.diametre;
    }

}

