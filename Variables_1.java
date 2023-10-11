public class Variables_1 {
    public static void main(String[] args) {
        int intVariables = 15; // переменная oneVariables равна 15
        short shortVariables = 32767; // переменная shortVariables имеет диапозон -32768 до +32767 (имеет 2 байта)
        long longVariables = 34354643423l; // предназначен для хранения больших чисел(обязательно ставим l в конце числа)

        double doubleVariables = 12324.45; //64 битной информации
        float floatVariables = 213243.43f; //32 битная информация

        char charVariavles = 'c'; // предназначен для хранения символов
        boolean booleanVariables = true; // логический тип данных (либо true либо false)

        byte byteVariables = 99; // тип данных который принимает значение от -128 до 127


        System.out.println(intVariables); // выводим на экран значение переменной
        System.out.println(shortVariables);
        System.out.println(longVariables);
        System.out.println(doubleVariables);
        System.out.println(floatVariables);
        System.out.println(charVariavles);
        System.out.println(booleanVariables);
        System.out.println(byteVariables);
    }
}
