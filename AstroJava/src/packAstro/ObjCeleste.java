package packAstro;

import java.util.ArrayList; 

// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.56F9E98C-C4A9-3A93-9650-93A53D285CDE]
// </editor-fold> 
public abstract class ObjCeleste {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.481F45DA-1DE7-3607-5F30-31C6EEF8E12C]
    // </editor-fold> 
    private int codeObj;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.1D93FA6A-8C26-630C-79AA-30089EA51862]
    // </editor-fold> 
    private String nom;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.533FE177-F36C-6E92-D1EC-03FFB7A65AA7]
    // </editor-fold> 
    private int type;
    
    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.FC59270B-EEA3-D62E-32DA-A0B650974291]
    // </editor-fold> 
    public static final int ETOILE = 0;
    
    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.95FF9B30-8AEB-9677-F52A-4F759C8B41C3]
    // </editor-fold> 
    public static final int PLANETE = 1;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.CFA56F75-FE01-A994-248A-E6C129C1DC29]
    // </editor-fold> 
    public static final int PLANETE_NAINE = 2;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.FA28A661-B6DE-9AED-11E5-9C07C281127B]
    // </editor-fold> 
    public static final int EXO_PLANETE = 3;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.98196517-D5ED-5542-7435-3FB82CDFBD30]
    // </editor-fold> 
    public static final int LUNE = 4;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.33F150AF-E50C-9631-0A5B-B812B6229D50]
    // </editor-fold> 
    private ArrayList<ObjFroid> satellites;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.0564FCB1-3E54-54C2-DC2B-5E8C110B17F1]
    // </editor-fold> 
    public int getType () {
        return this.type;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.8ABB9C5E-5297-4140-9E90-51889C54DB0A]
    // </editor-fold> 
    public abstract Galaxie getGalaxie ();

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.7DE7586A-B0D8-52C1-01F6-4EB25F670582]
    // </editor-fold> 
    public int nbDeSatellites () {
        return this.satellites.size();
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.DAB882EF-D15E-76AB-0B01-C462898FF191]
    // </editor-fold> 
    public abstract String toString ();
    
    protected void setNom(String nom) {
        this.nom = nom;
    }
    
    protected void setCodeObj(int code) {
        this.codeObj = code;
    }
    
    protected void setType(int type) {
        this.type = type;
    }

    public void setSatellites(ArrayList<ObjFroid> sat) {
        this.satellites = sat;
    }
    
    public String getNom() {
        return this.nom;
    }
    
    public int getCodeObj() {
        return this.codeObj;
    }
    
    public ArrayList<ObjFroid> getSatellites() {
        return this.satellites;
    }
    
    public String getTypeString() {
        String s = "";
        switch(this.getType()) {
            case ObjCeleste.ETOILE:
                s = "étoile";
                break;
            case ObjCeleste.PLANETE:
                s = "planete";
                break;
            case ObjCeleste.PLANETE_NAINE:
                s = "planete naine";
                break;
            case ObjCeleste.EXO_PLANETE:
                s = "exo Planete";
                break;
            case ObjCeleste.LUNE:
                s = "lune";
                break;
        }
        return s;
    }
}

