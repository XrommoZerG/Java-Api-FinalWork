import java.util.Map;
import java.util.Random;

public class Notebook {

    private String brand;

    private Integer ram;

    private Integer memory;

    private String processors;

    private String graphics;

    private String color;

      Notebook(){
        String[] arrbrand = new String[]{"Lenovo","Asus","Apl","Msi"};
        Integer[] arrram = new Integer[]{6,8,16,32};
        Integer[] arrmemory = new Integer[]{256,512,1024};
        String[] arrprocessors = new String[]{"Intel","Amd"};
        String[] arrgraphics = new String[]{"Nvidia","Intel","Amd"};
        String[] arrcolor = new String[]{"Black","Red","Green","Metalick"};

        Random random = new Random();

        this.brand = arrbrand[random.nextInt(arrbrand.length)];
        this.ram = arrram[random.nextInt(arrram.length)];
        this.memory = arrmemory[random.nextInt(arrmemory.length)];
        this.processors = arrprocessors[random.nextInt(arrprocessors.length)];
        this.graphics = arrgraphics[random.nextInt(arrgraphics.length)];
        this.color = arrcolor[random.nextInt(arrcolor.length)];
    }



// Фунция рандомного заполнения обекта
    public void randomCreat(){
        String[] arrbrand = new String[]{"Lenovo","Asus","Apl","Msi"};
        Integer[] arrram = new Integer[]{6,8,16,32};
        Integer[] arrmemory = new Integer[]{256,512,1024};
        String[] arrprocessors = new String[]{"Intel","Amd"};
        String[] arrgraphics = new String[]{"Nvidia","Intel","Amd"};
        String[] arrcolor = new String[]{"Black","Red","Green","Metalick"};

        Random random = new Random();

        this.brand = arrbrand[random.nextInt(arrbrand.length)];
        this.ram = arrram[random.nextInt(arrram.length)];
        this.memory = arrmemory[random.nextInt(arrmemory.length)];
        this.processors = arrprocessors[random.nextInt(arrprocessors.length)];
        this.graphics = arrgraphics[random.nextInt(arrgraphics.length)];
        this.color = arrcolor[random.nextInt(arrcolor.length)];
    }

    public void randomCreatMap(Map<String,String[]> map){
        String[] arrbrand = new String[]{"Lenovo","Asus","Apl","Msi"};
        Integer[] arrram = new Integer[]{6,8,16,32};
        Integer[] arrmemory = new Integer[]{256,512,1024};
        String[] arrprocessors = new String[]{"Intel","Amd"};
        String[] arrgraphics = new String[]{"Nvidia","Intel","Amd"};
        String[] arrcolor = new String[]{"Black","Red","Green","Metalick"};

        Random random = new Random();

        this.brand = arrbrand[random.nextInt(arrbrand.length)];
        this.ram = arrram[random.nextInt(arrram.length)];
        this.memory = arrmemory[random.nextInt(arrmemory.length)];
        this.processors = arrprocessors[random.nextInt(arrprocessors.length)];
        this.graphics = arrgraphics[random.nextInt(arrgraphics.length)];
        this.color = arrcolor[random.nextInt(arrcolor.length)];
    }
    public void showNotebook(){
        System.out.println("Brand - " + brand);
        System.out.println("Ram - " + ram);
        System.out.println("Memory - " + memory);
        System.out.println("Processors - " + processors);
        System.out.println("Graphics - " + graphics);
        System.out.println("Color - " + color);

    }
}
