/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package packAstro;

import java.util.Scanner;

/**
 *
 * @author Fred
 */
public class Ihm {
    
    private String[] menu;
    
    public Ihm() {
        menu = new String[]{
            "Initialiser le système avec le jeu d'essai",
            "Afficher les caractéristiques de l'objet N° x",
            "Lister toutes les galaxies : nom, type, eloignement",
            "Lister tous les objets connus de la galaxie de nom \"X\" avec leurs caractéristiques",
            "Lister les satellites de l'objet (étoile, planète,...) N°x",
            "Afficher le nombre total d'étoiles répertoriées dans l'univers",
            "Afficher les caractéristiques du plus gros objet froid",
            "Ajouter une nouvelle étoile",
            "Ajouter un nouvel objet froid (à une étoile ou à un objet froid)",
            "AJouter une galaxie(nom, type, eloignement)",
            "Quitter"
        };
    }
    
    public String[] getMenu() {
        return menu;
    }
    
    public void initJeuEssai() {
        Galaxie voie_lactee = Univers.creerGalaxie("Voie lactee", "Spirale", 0);
            Etoile soleil = Univers.creerEtoile("Soleil", 0, 'F', voie_lactee);
                ObjFroid terre = Univers.creerObjFroid("Terre", 150000, 13000, 365, soleil);
                    Univers.creerObjFroid("Lune", 200, 5000, 30, terre);
                ObjFroid mars = Univers.creerObjFroid("Mars", 200000, 11000, 750, soleil);
                    Univers.creerObjFroid("Phobos", 150, 500, 40, mars);
                Univers.creerObjFroid("Pluton", 1200000, 4000, 900, soleil);
            Etoile sirius = Univers.creerEtoile("Sirius", 2, 'B', voie_lactee);
                Univers.creerObjFroid("BIG1", 1000, 50000, 333, sirius);
        Galaxie m31 = Univers.creerGalaxie("M31", "Lenticulaire", 900000);
            Etoile xs67 = Univers.creerEtoile("XS67", 8, 'F', m31);
                Univers.creerObjFroid("XP88", 160000, 40000, 400, xs67);
    }
    
    public void launch(String[] args) {
        switch (Integer.parseInt(args[0])) {
            case 0:
                if (args.length == 1) {
                    this.initJeuEssai();
                    System.out.println("Jeu d'essaie initialisé");
                } else {
                    System.out.println("Nombre d'arguments incorrect!");
                }
                break;
            case 1:
                if (args.length == 2) {
                    System.out.println(Univers.s_getObjet(Integer.parseInt(args[1])).toString());
                } else {
                    System.out.println("Nombre d'arguments incorrect!");
                }
                break;
            case 2:
                if (args.length == 1) {
                    for (Galaxie g : Univers.s_getTteGalaxies()) {
                        System.out.print("("+g.toString()+"); ");
                    }
                } else {
                    System.out.println("Nombre d'arguments incorrect!");
                }
                break;
            case 3:
                if (args.length == 2) {
                    for (ObjCeleste obj : Univers.s_getObjets(Univers.s_getGalaxie(args[1]))) {
                        System.out.print("("+obj.toString()+"); ");
                    }
                } else {
                    System.out.println("Nombre d'arguments incorrect!");
                }
                break;
            case 4:
                if (args.length == 2) {
                    for (ObjFroid obj : Univers.s_getObjet(Integer.parseInt(args[1])).getSatellites()) {
                        System.out.print(obj.getNom()+", ");
                    }
                } else {
                    System.out.println("Nombre d'arguments incorrect!");
                }
                break;
            case 5:
                if (args.length == 1) {
                    int nb = 0;
                    for (Galaxie g : Univers.s_getTteGalaxies()) {
                        nb += g.listeEtoiles().size();
                    }
                    System.out.println(nb);
                } else {
                    System.out.println("Nombre d'arguments incorrect!");
                }
                break;
            case 6:
                if (args.length == 1) {
                    System.out.println(Univers.s_theBigOne().toString());
                } else {
                    System.out.println("Nombre d'arguments incorrect!");
                }
                break;
            case 7:
                if (args.length == 5) {
                    Etoile e = Univers.creerEtoile(args[1], Integer.parseInt(args[2]), args[3].charAt(0), Univers.s_getGalaxie(args[4]));
                    System.out.println("N°"+e.getCodeObj()+", "+e.getTypeString());
                } else {
                    System.out.println("Nombre d'arguments incorrect!");
                }
                break;
            case 8:
                if (args.length == 6) {
                    ObjFroid obj = Univers.creerObjFroid(args[1], Integer.parseInt(args[2]), Integer.parseInt(args[3]), Integer.parseInt(args[4]), Univers.s_getObjet(Integer.parseInt(args[5])));
                    System.out.println("N°"+obj.getCodeObj()+", "+obj.getTypeString());
                } else {
                    System.out.println("Nombre d'arguments incorrect!");
                }
                break;
            case 9:
                if (args.length == 4) {
                    Galaxie g = Univers.creerGalaxie(args[1], args[2], Integer.parseInt(args[3]));
                    System.out.println("Galaxie "+g.getNom()+" créée.");
                } else {
                    System.out.println("Nombre d'arguments incorrect!");
                }
                break;
            case 10:
                if (args.length == 1) {
                    System.exit(0);
                } else {
                    System.out.println("Nombre d'arguments incorrect!");
                }
                break;
            default:
                System.out.println("Commande non reconnue");
                break;
        }
    }
    
    public static void main(String[] args) {
        Ihm ihm = new Ihm();
        while (true) {
            System.out.println("----------------------------Menu----------------------------");
            for (int i = 0; i<ihm.menu.length; i++) {
                System.out.println(i+". "+ihm.getMenu()[i]);
            }
            System.out.println("------------------------------------------------------------");
            Scanner sc = new Scanner(System.in);
            String arg = sc.nextLine();
            ihm.launch(arg.split(" "));
        }
    }
}
