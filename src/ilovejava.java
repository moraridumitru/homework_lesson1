public class ilovejava {

    public static void main(String[] args) {
        String phrase = "I love java";

        // а) Подсчет количества букв в фразе
        int letterCount = phrase.length();
        System.out.println("Numarul de litere este: " + letterCount);

        // б) Вывод буквы под индексом 4
        char letterAtIndex4 = phrase.charAt(4);
        System.out.println("Litara cu indexul 4: " + letterAtIndex4);

        // в) Вывод индекса буквы 'j'
        int indexOfJ = phrase.indexOf('j');
        System.out.println("Indexul literei 'j': " + indexOfJ);

        // г) Добавление фразы "and QA Automation"
        String updatedPhrase = phrase.concat(" and QA Automation");
        System.out.println("Fraza actualizata: " + updatedPhrase);
        //2 Проверить через boolean что фраза I love java типа String
        boolean fraza = phrase.equals("I love java");
        /**
         используя оператор сравнения с помощью метода equals()**/
        System.out.println("I love java este de tip String: " + fraza);
        //Проверить через boolean что фраза I love java типа String
        boolean fr = true;
        System.out.println("I love java : " + fr + " este de tip String");
    }
}
