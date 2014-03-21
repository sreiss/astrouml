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
    // #[regen=yes,id=DCE.33F150AF-E50C-9631-0A5B-B812B6229D50]
    // </editor-fold> 
    private ArrayList<ObjFroid> satellites;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.0564FCB1-3E54-54C2-DC2B-5E8C110B17F1]
    // </editor-fold> 
    public int getType () {
        return type;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.8ABB9C5E-5297-4140-9E90-51889C54DB0A]
    // </editor-fold> 
    public abstract Galaxie getGalaxie ();

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.7DE7586A-B0D8-52C1-01F6-4EB25F670582]
    // </editor-fold> 
    public int nbDeSatellites () {
        return satellites.size();
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.C6BB3EA2-DFFA-38C8-91C0-6803D6953C6F]
    // </editor-fold> 
    public ArrayList<ObjFroid> getSatellites () {
        return satellites;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.DAB882EF-D15E-76AB-0B01-C462898FF191]
    // </editor-fold> 
    public abstract String toString ();

}

