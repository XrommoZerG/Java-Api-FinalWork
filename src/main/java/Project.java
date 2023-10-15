import javax.swing.text.html.parser.Parser;
import java.util.*;

public class Project {


    public static void main(String[] args) {
        String[][] param = new String[][]{
                {"brand", "Lenovo", "Asus", "Apl", "Msi"},
                {"ram", "6", "8", "16", "32"},
                {"memory", "256", "512", "1024"},
                {"processors", "Intel", "Amd"},
                {"graphics", "Nvidia", "Intel", "Amd"},
                {"color", "Black", "Red", "Green", "Metalick"}
        };
        //String[] shracteristic = new String[]{"brand", "ram", "memory", "processors", "graphics", "color"};
        Map<String, String[]> mapMagazine = generateMap(param);
        Map<String, String> filter = generateFilterNull(param);
        int lenghte = 10;
        NotebookBetta[] notebookBettas = generateNotebook(mapMagazine, lenghte);

        Boolean boolKey = true;
        Integer intKey;
        Scanner scanner = new Scanner(System.in);
        String zagl = "MAGAZIN";

        showNotebooks(notebookBettas,zagl);

        while (boolKey) {


            System.out.println("1: Настроить фильтр поиска; 2:Показать результат поиска;  3: Сбросиь фильтр;  4: Обновить магазин; 5: Выйти;");
            System.out.println("Выберите:");

            String chois = scanner.nextLine();


            switch (Integer.parseInt(chois)){
                case 1:
                    filter = filterMag(param);
                    break;
                case 2:

                    break;
                case 3:
                    filter = generateFilterNull(param);
                    break;
                case 4:
                    notebookBettas = generateNotebook(mapMagazine, lenghte);
                    showNotebooks(notebookBettas,zagl);
                    break;
                case 5:
                    boolKey = false;
                    break;
                default:
                    System.out.println("Вы вели не коректные данные");
                    break;
            }

        }


    }

//    private static boolean cheked(){
//
//    }

    //region Map
    private static Map<String, String[]> generateMap(String[][] param) {
        Map<String, String[]> mapMagazine = new HashMap<>();
        for (int i = 0; i < param.length; i++) {
            mapMagazine.put(param[i][0], param[i]);
        }
        return mapMagazine;
    }

    private static void vuvodParam(String[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + ": " + arr[i][0]);
        }
    }
    private static void vuvodParam(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + ": " + arr[i]);
        }
    }

    private static  Map<String, String> filterMag(String[][] param){
        boolean key1 =true;
        boolean key2= false;
        Map<String, String> filter = generateFilterNull(param);
        while (key1){
            Scanner scanner = new Scanner(System.in);
            int chois = 0;
            for (int i = 0; i < param.length; i++) {
                System.out.println( i + ": "+ vuvodFilter(filter,param[i][0]));
            }
            System.out.println(param.length + ": - Выйти;");
            System.out.println("Выберите:");
            if (scanner.hasNextInt()){
                chois = scanner.nextInt();
            }
            else {
                System.out.println("ВЫ ВЕЛИ НЕ КОРЕКТНЫЕ ДАННЫЕ ПОВТОРИТЕ ПОПЫТКУ\n");
            }
                key1 = provChois(chois,param.length);
                key2 = provChois(chois,param.length);
            while (key2){
                scanner = new Scanner(System.in);
                int chois2 = 0;
                for (int i = 1; i <param[chois].length ; i++) {
                    System.out.println( i + ": "+ param[chois][i]);
                }
                System.out.println(param[chois].length + ": Удалить выбор;");
                System.out.println(param[chois].length + 1 + ": - Выйти;");
                System.out.println("Выберите:");
                if (scanner.hasNextInt()){
                    chois2 = scanner.nextInt();
                }
                else {
                    System.out.println("ВЫ ВЕЛИ НЕ КОРЕКТНЫЕ ДАННЫЕ ПОВТОРИТЕ ПОПЫТКУ\n");
                }
                key2 = provChois(chois2,param[chois].length);
                if (key2) {
                    filter.put(param[chois][0],param[chois][chois2]);
                    key2 = false;
                }
                if (chois2 == param[chois].length){
                    filter.put(param[chois][0],null);
                }
            };
        }

return filter;

    }

    private static Boolean provChois(int chois , int lenght){

        if (chois>=0 && chois< lenght) {
            return true;
        }

        return false;


    }

    private static String vuvodFilter(Map<String, String> filter,String key){
        return key + ": " + filter.get(key) + ";";

    }

    private static Map<String, String> generateFilterNull(String[][] arr) {

        Map<String, String> mapMagazine = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            mapMagazine.put(arr[i][0], null);
        }
//        mapN.put("brand", null);
//        mapN.put("ram", null);
//        mapN.put("memory", null);
//        mapN.put("processors", null);
//        mapN.put("graphics", null);
//        mapN.put("color", null);

        return mapMagazine;

    }

    //endregion

    //region notebook
    private static NotebookBetta[] generateNotebook(Map<String, String[]> map, int lenght) {
        NotebookBetta[] notebookBettas = new NotebookBetta[lenght];

        for (int i = 0; i < lenght; i++) {

            notebookBettas[i] = NotebookBetta.randomCreatMap(map);
            ;
        }
        return notebookBettas;
    }

    private static void showNotebooks(NotebookBetta[] notebookBettas, String zagl) {
        System.out.println("**********" + zagl + "**********");


        for (int i = 0; i < notebookBettas.length; i++) {
            notebookBettas[i].showNotebook();
            System.out.println("\n");
            System.out.println("---------------------------");
        }
        System.out.println("**********" + zagl + "**********");

    }
    //endregion
}
