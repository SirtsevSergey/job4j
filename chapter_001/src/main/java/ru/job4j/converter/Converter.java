package ru.job4j.converter;

/**
 * Конвертер валют
 *
 * @author Sergey Surtsev (artman99@yandex.ru)
 * @version 1
 * @since 29.12.2018
 */

public class Converter {
    /**
     * Конвертируем рубли в евро.
     *
     * @param value рубли.
     * @return Евро.
     */
    public int rubleToEuro(int value) {
        return value / 70;
    }

    /**
     * Конвертируем рубли в доллары.
     *
     * @param value рубли.
     * @return Доллары
     */
    public int rubleToDollar(int value) {
        return value / 60;
    }

    /**
     * Конвертируем рубли в евро.
     *
     * @param value рубли.
     * @return Евро.
     */
    public int euroToRuble(int value) {
        return value * 70;
    }

    /**
     * Конвертируем рубли в доллары.
     *
     * @param value рубли.
     * @return Доллары
     */
    public int dollarToRuble(int value) {
        return value * 60;
    }
}