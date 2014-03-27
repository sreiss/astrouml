
package packAstro;

import java.util.ArrayList; 

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
    private static ArrayList<Galaxie> s_galaxies;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.007C29D3-A5E4-CB42-9305-5F4A171C77DB]
    // </editor-fold> 
    public static Galaxie s_getGalaxie (String nom) {
        for (Galaxie g : s_galaxies) {
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
        return s_galaxies;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.153A9C78-82E1-3007-33DE-F296B0BAEE3A]
    // </editor-fold> 
    public static ObjFroid s_theBigOne () {
        ObjFroid big = null;
        int diam = 0;
        for (Galaxie g : s_galaxies) {
            for (ObjCeleste oc : Univers.s_getObjets(g)) {
                if(oc instanceof ObjFroid) {
                    ObjFroid of = (ObjFroid)oc;
                    if (of.getDiametre()>diam) {
                        diam = of.getDiametre();
                        big = of;
                    }
                }
            }
        }
        return big;
    }
    
    public static Etoile s_getSoleil() {
        for (Galaxie g : s_galaxies) {
            for (Etoile e : g.ListeEtoiles()) {
                if (e.getNom().equalsIgnoreCase("soleil")) {
                    return e;
                }
            }
        }
        return null;
    }
    
    public static int getNextCode() {
        return s_nextCodeObj;
    }
    
    public static void incrNextCode() {
        s_nextCodeObj++;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.020981A7-1EAA-C919-1E47-5CEF81DBF05D]
    // </editor-fold> 
    public static ArrayList<ObjCeleste> getObjcelestes () {
        return null;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.8A6CA7AE-AC12-D371-99C8-E245B5979F5A]
    // </editor-fold> 
    public static ArrayList<ObjCeleste> s_getObjets (Galaxie g) {
        if(g instanceof Galaxie) {
            
        }
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.C1E86127-C69D-BA62-85EF-C18CEB3226B1]
    // </editor-fold> 
    public static ObjCeleste s_getObjet (int num) {
        if(num > Univers.s_nextCodeObj)
            return null;
        boolean found = false;
        ObjCeleste obj;
        while(!found) {
            for(Galaxie g : Univers.s_galaxies) {
                for(Etoile e : g.listeEtoiles()) {
                    if(e.getCodeObj() == num) {
                        obj = e;
                        found = true;
                    } else {
                        for (ObjFroid o : e.getSatellites()) {
                            if (o.getCodeObj() == num && o.nbDeSatellites() != 0) {
                                obj = o;
                                found = true;
                            } else if (o.nbDeSatellites() != 0){
                               for (ObjFroid s : o.getSatellites()) {
                                   if (s.getCodeObj() == num) {
                                       obj = s;
                                       found = false;
                                   }
                               }
                            }
                        }
                    }
                }
            }
        }
        return obj;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.A356380E-FA38-C98B-BD23-02631D7C6C1C]
    // </editor-fold> 
    public static ObjFroid creerObjFroid (String nom, int rayonOrbite, int diametre, int periode, ObjCeleste centreOrbite) { 
        ObjFroid obj = new ObjFroid(
                Univers.s_nextCodeObj, 
                nom, 
                Univers.calculeType(diametre, centreOrbite), 
                rayonOrbite, 
                diametre, 
                periode, 
                centreOrbite
        );
        Univers.s_nextCodeObj++;
        return obj;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.E3C56E34-E174-5A49-FB76-D7CEB2386E55]
    // </editor-fold> 
    public static Etoile creerEtoile (String nom, int magnitude, char age_lettre, Galaxie galaxie) {
        Etoile e = new Etoile(
                Univers.s_nextCodeObj,
                nom,
                galaxie,
                magnitude,
                age_lettre
        );
        Univers.s_nextCodeObj++;
        return e;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.6E2F61E6-B458-AFD7-8899-BE6F07A282A5]
    // </editor-fold> 
    public static Galaxie creerGalaxie (String nom, String type, int eloignement) {
        Galaxie g = new Galaxie(
                nom,
                type,
                eloignement
        );
        Univers.s_galaxies.add(g);
        return g;
    }
    
    private static int calculeType (int diam, ObjCeleste centreOrbite) {
        int type;
        if (diam >= 6000 && centreOrbite.getNom().equalsIgnoreCase("soleil"))
            type = ObjCeleste.PLANETE;
        else if (diam < 6000 && centreOrbite.getNom().equalsIgnoreCase("soleil"))
            type = ObjCeleste.PLANETE_NAINE;
        else if (!centreOrbite.getNom().equalsIgnoreCase("soleil"))
            type = ObjCeleste.EXO_PLANETE;
        else
            type = ObjCeleste.LUNE;
        return type;
    }
}

