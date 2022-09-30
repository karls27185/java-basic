package academy.section07_String;

public class StringBuilderUsage {
    public static void main(String[] args) {
        String s = "hello";

        StringBuilder builder = new StringBuilder();
        System.out.println("builder = " + builder);
        builder.append("world"); //добавление в конец
        builder.insert(0, "hello"); //добавление в начало
        builder.insert(5, ' '); //добовление наченая с 5го знака

        String result = builder.toString();
        System.out.println(result);

        builder.deleteCharAt(0); //удаление нулевого символа
        System.out.println(builder.toString());

        builder.setLength(0); //обнуление строки
        builder.delete(0, builder.length()); //удаление символов с нулевой и до конца

        System.out.println(builder.toString());

        System.out.println("qwerty");

    }
}
