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

    public static NotebookBetta randomCreatMap(Map<String,String[]> map){
        String[] arrbrand = map.get("brand");
        String[] arrram = map.get("ram");
        String[] arrmemory = map.get("memory");
        String[] arrprocessors =map.get("processors");
        String[] arrgraphics = map.get("graphics");
        String[] arrcolor = map.get("color");

        Random random = new Random();

        NotebookBetta notebookBetta = new NotebookBetta();


        notebookBetta.brand = arrbrand[random.nextInt(1,arrbrand.length)];
        notebookBetta.ram = arrram[random.nextInt(1,arrram.length)];
        notebookBetta.memory = arrmemory[random.nextInt(1,arrmemory.length)];
        notebookBetta.processors = arrprocessors[random.nextInt(1,arrprocessors.length)];
        notebookBetta.graphics = arrgraphics[random.nextInt(1,arrgraphics.length)];
        notebookBetta.color = arrcolor[random.nextInt(1,arrcolor.length)];

        return notebookBetta;
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

    //region Set

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public void setProcessors(String processors) {
        this.processors = processors;
    }

    public void setGraphics(String graphics) {
        this.graphics = graphics;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //endregion


    public NotebookBetta() {
        this.brand = " ";
        this.ram = " ";
        this.memory = " ";
        this.processors = " ";
        this.graphics = " ";
        this.color = " ";
    }
}
