package gestionnaires;

import java.util.ArrayList; 
import packAstro.*;

// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.9AFD4011-A39C-430E-A12A-0B7897A740C7]
// </editor-fold> 
public class Univers {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.4F58CB74-C014-F3F9-EE89-DDC828B3AF38]
    // </editor-fold> 
    private static int s_nextCodeObj;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.3A28CE60-1D14-AF3E-376F-17873C6C177D]
    // </editor-fold> 
    private static ArrayList<Galaxie> galaxies;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.007C29D3-A5E4-CB42-9305-5F4A171C77DB]
    // </editor-fold> 
    public static Galaxie s_getGalaxie (String nom) {
        for (Galaxie g : galaxies) {
            if (g.getNom().equals(nom)) {
                return g;
            }
        }
        return null;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.6977E68F-35C4-8465-9B4E-7CC1E4E4FAE6]
    // </editor-fold> 
    public static ArrayList<Galaxie> s_getTteGalaxies () {
        return galaxies;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.153A9C78-82E1-3007-33DE-F296B0BAEE3A]
    // </editor-fold> 
    public ObjFroid s_theBigOne () {
//        ObjFroid big = null;
//        for (Galaxie g : galaxies) {
//            for (ObjCeleste oc : g.getObjets()) {
//                if(oc instanceof ObjFroid) {
//                    ObjFroid of = (ObjFroid)oc;
//                    
//                }
//            }
//        }
        return null;
    }
    
    public Etoile s_getSoleil() {
        return null;
    }
    
    public int getNextCode() {
        return s_nextCodeObj;
    }

}

