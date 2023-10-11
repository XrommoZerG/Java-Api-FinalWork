import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

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

    private static Map<String,String> generateFilterNull(){
        Map<String, String> mapN = new HashMap<>();
        mapN.put("brand", null);
        mapN.put("ram", null);
        mapN.put("memory", null);
        mapN.put("processors", null);
        mapN.put("graphics", null);
        mapN.put("color", null);

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
        Map<String,String> filter = generateFilterNull();
        int lenghte = 10;
        NotebookBetta[] notebookBettas = generateNotebook(mapN,lenghte);
        showNotebooks(notebookBettas);

        Boolean key = true;
        Scanner scanner = new Scanner(System.in);

        while (key){
            System.out.println("Укажите фильтр\n");
            String chois = scanner.nextLine();


            switch (chois){
                case "0":
                    key = true;
                    break;
                case "1":
                    key = false;
                    break;
            }

        }











    }
}
