package lessonnumberten;


public class Box {

    private String color;

    private int length;

    private int width;

    private int height;

    private boolean isOpen = false;

    private String content = "";

    public Box(String color, int length, int width, int height) {
        this.color = color;
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public String getColor() {
        return color;
    }

    public void open() {
        this.isOpen = true;
        System.out.println("Коробка открыта.");
    }

    public void close() {
        this.isOpen = false;
        System.out.println("Коробка закрыта.");
    }

    public void repaint(String color) {
        this.color = color;
        System.out.println("Цвет коробки изменен. Цвет коробки " + this.color);
    }

    public void put(String thing) {
        if (isOpen) {
            if("".equals(content)) {
                content = thing;
                System.out.println("Вещь " + thing + " теперь внутри коробки.");
            }else {
                System.out.println("Коробка не пуста, нельзя положить ваш/вашу " + thing + " в коробку.");
            }
        }else {
            System.out.println("Коробка закрыта. Перед тем, как положить вещь в коробку, откройте ее.");
        }
    }

    public String get(){
        String thing = "";
        if(isOpen){
            if(!"".equals(content)){
                thing=content;
                System.out.println("Вещь " + thing + " достали из коробки. Коробка теперь пуста.");
            }else {
                System.out.println("Коробка пуста. Нельзя достать что-то из пустой коробки.");
            }
        }else {
            System.out.println("Коробка закрыта. Перед тем, как достать вещь из коробки, откройте ее.");
        }
        return thing;
    }

    @Override
    public String toString() {
        return "Эта коробка имеет размеры:\nдлина " + length + "\nширина " + width + "\nвысота " + height
                + ".\nИ ее цвет " + color;
    }

    public void print() {
        System.out.println(this.toString());
    }


}
