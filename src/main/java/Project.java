import java.util.HashMap;
import java.util.Map;

public class Project {

    private static Map<String, String[]> generateMap() {
        String[] arrbrand = new String[]{"Lenovo", "Asus", "Apl", "Msi"};
        String[] arrram = new String[]{"6", "8", "16", "32"};
        String[] arrmemory = new String[]{"256", "512", "1024"};
        String[] arrprocessors = new String[]{"Intel", "Amd"};
        String[] arrgraphics = new String[]{"Nvidia", "Intel", "Amd"};
        String[] arrcolor = new String[]{"Black", "Red", "Green", "Metalick"};

        Map<String, String[]> mapN = new HashMap<>();
        mapN.put("brand", arrbrand);
        mapN.put("ram", arrram);
        mapN.put("memory", arrmemory);
        mapN.put("processors", arrprocessors);
        mapN.put("graphics", arrgraphics);
        mapN.put("color", arrcolor);

        return mapN;
    }

    private static NotebookBetta[] generateNotebook(Map<String, String[]> map,int lenght ) {
        NotebookBetta[] notebookBettas = new NotebookBetta[lenght];
        NotebookBetta notebookBetta = new NotebookBetta();

        for (int i = 0; i < notebookBettas.length; i++) {
            notebookBetta.randomCreatMap(map);
            notebookBettas[i] = notebookBetta;
        }
        return notebookBettas;
    }

    private static void showNotebooks(NotebookBetta[] notebookBettas){

        for (int i = 0; i < notebookBettas.length; i++) {
            notebookBettas[i].showNotebook();
            System.out.println("\n");
            System.out.println("---------------------------");
        }

    }


    public static void main(String[] args) {
        Map<String, String[]> mapN = generateMap();
        int lenght = 10;
        NotebookBetta[] notebookBettas = generateNotebook(mapN,lenght);
        showNotebooks(notebookBettas);





//        Notebook[] notebook = new Notebook[7];
//        Notebook notebook1 = new Notebook();
//        for (int i = 0; i < notebook.length; i++) {
//            notebook1.randomCreat();
//            notebook[i] = notebook1;
//        }
//        for (int i = 0; i < notebook.length; i++) {
//            notebook[i].showNotebook();
//            System.out.println("---------------------------------------");
//        }
//        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
//
//        NotebookBetta notebookBetta = new NotebookBetta();
//        notebookBetta.randomCreatMap(mapN);
//        notebookBetta.showNotebook();


    }
}
