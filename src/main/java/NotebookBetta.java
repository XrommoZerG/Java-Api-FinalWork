import java.util.Map;
import java.util.Random;

public class NotebookBetta {

    private String brand;

    private String ram;

    private String memory;

    private String processors;

    private String graphics;

    private String color;




    // Фунция рандомного заполнения обекта

    public void randomCreatMap(Map<String,String[]> map){
        String[] arrbrand = map.get("brand");
        String[] arrram = map.get("ram");
        String[] arrmemory = map.get("memory");
        String[] arrprocessors =map.get("processors");
        String[] arrgraphics = map.get("graphics");
        String[] arrcolor = map.get("color");

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

    //region Get

    public String getBrand() {
        return brand;
    }

    public String getRam() {
        return ram;
    }

    public String getMemory() {
        return memory;
    }

    public String getProcessors() {
        return processors;
    }

    public String getGraphics() {
        return graphics;
    }

    public String getColor() {
        return color;
    }

    //endregion
}
