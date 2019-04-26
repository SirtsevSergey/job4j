package ru.job4j.condition;

/**
 * Вычисляем растояние между точками в системе кординат
 *
 * @author Sergey Surtsev (artman99@yandex.ru)
 * @version 1
 * @since 29.12.2018
 */
public class DummyBot {
    /**
     * Отвечает на вопросы.
     * @param question Вопрос от клиента.
     * @return Ответ.
     */
    public String answer(String question) {
        String result = "Это ставит меня в тупик. Спросите другой вопрос.";
        if ("Привет, Бот.".equals(question)) {
            result = "Привет, умник.";
        } else if ("Пока.".equals(question)) {
            result = "До скорой встречи.";
        }
        return result;
    }
}
