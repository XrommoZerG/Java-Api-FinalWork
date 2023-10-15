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
        Map<String, String[]> mapMagazine = generateMap(param);
        Map<String, String> filter = generateFilterNull(param);
        int lenghte = 10;
        List<NotebookBetta> listNotebook = creatListNotebook(mapMagazine,lenghte);

        Boolean boolKey = true;
        Scanner scanner = new Scanner(System.in);

        showListNonebook(listNotebook,"MAGAZINE");
        List<NotebookBetta> aftefilterList;


        while (boolKey) {


            System.out.println("1: Настроить фильтр поиска; 2:Показать результат поиска;  3: Сбросиь фильтр;  4: Обновить магазин; 5: Выйти;");
            System.out.println("Выберите:");

            String chois = scanner.nextLine();


            switch (Integer.parseInt(chois)){
                case 1:
                    filter = filterMag(param);
                    break;
                case 2:
                    aftefilterList = filterListNotebook(listNotebook,filter);
                    showListNonebook(aftefilterList,"FILTER MAGAZINE");
                    break;
                case 3:
                    filter = generateFilterNull(param);
                    break;
                case 4:
                    listNotebook = creatListNotebook(mapMagazine,lenghte);
                    showListNonebook(listNotebook,"MAGAZINE");
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

    //region List
    static List<NotebookBetta> filterListNotebook(List<NotebookBetta> list,Map<String, String> filter){
        List<NotebookBetta> newlist = new ArrayList<>();
        String str;
        for (NotebookBetta notebookBetta:list){

            str = filter.get("brand");
            if (notebookBetta.getBrand() == str) {
                if (!newlist.contains(notebookBetta)){
                    newlist.add(notebookBetta);
                }
            } else if (str == null) {
            }
            else {
                continue;
            }

            str = filter.get("ram");
            if (notebookBetta.getRam() == str) {
                if (!newlist.contains(notebookBetta)){
                    newlist.add(notebookBetta);
                }
            } else if (str == null) {
            }
            else {
                newlist.remove(notebookBetta);
                continue;
            }

            str = filter.get("memory");
            if (notebookBetta.getMemory() == str) {
                if (!newlist.contains(notebookBetta)){
                    newlist.add(notebookBetta);
                }
            } else if (str == null) {
            }
            else {
                newlist.remove(notebookBetta);
                continue;
            }

            str = filter.get("processors");
            if (notebookBetta.getProcessors() == str) {
                if (!newlist.contains(notebookBetta)){
                    newlist.add(notebookBetta);
                }
            } else if (str == null) {
            }
            else {
                newlist.remove(notebookBetta);
                continue;
            }

            str = filter.get("graphics");
            if (notebookBetta.getGraphics() == str) {
                if (!newlist.contains(notebookBetta)){
                    newlist.add(notebookBetta);
                }
            } else if (str == null) {
            }
            else {
                newlist.remove(notebookBetta);
                continue;
            }

            str = filter.get("color");
            if (notebookBetta.getColor() == str) {
                if (!newlist.contains(notebookBetta)){
                    newlist.add(notebookBetta);
                }
            } else if (str == null) {
            }
            else {
                newlist.remove(notebookBetta);
                continue;
            }

        }

        return newlist;
    }
    private static List<NotebookBetta> creatListNotebook(Map<String, String[]> mapM, int lenght){
        List<NotebookBetta> list = new ArrayList<>();

        for (int i = 0; i < lenght; i++) {
            list.add(NotebookBetta.randomCreatMap(mapM));
        }
        return list;
    }

    private static void showListNonebook(List<NotebookBetta> list,String zagl){
        System.out.println("**********" + zagl + "**********");
        for(NotebookBetta notebookBetta: list){
            notebookBetta.showNotebook();
            System.out.println("---------------------------");

        }
        System.out.println("**********" + zagl + "**********");


    }

    //endregion


    //region Map
    private static Map<String, String[]> generateMap(String[][] param) {
        Map<String, String[]> mapMagazine = new HashMap<>();
        for (int i = 0; i < param.length; i++) {
            mapMagazine.put(param[i][0], param[i]);
        }
        return mapMagazine;
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
        return mapMagazine;

    }

    //endregion

}
