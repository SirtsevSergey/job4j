package ru.job4j.calculate;
/**
 * Элементарный калькулятор
 * @author Sergey Surtsev (artman99@yandex.ru)
 * @version 1
 * @since 27.12.2018
 */
public class Calculate {
	private double result;
	/**
	 * Сложение.
	 * Method add.
	 * @param first первый аргумент.
	 * @param second второй аргумент.
	 * result результат.
	 */
	public void add(double first, double second) {
		this.result = first + second;
	}
	/**
	 * Вычитание.
	 * Method substruct.
	 * @param first первый аргумент.
	 * @param second второй аргумент.
	 * result результат.
	 */
	public void substruct(double first, double second) {
		this.result = first - second;
	}
	/**
	 * Деление.
	 * Method div.
	 * @param first первый аргумент.
	 * @param second второй аргумент.
	 * result результат.
	 */
	public void div(double first, double second) {
		this.result = first / second;
	}
	/**
	 * Умножение.
	 * Method multiple.
	 * @param first первый аргумент.
	 * @param second второй аргумент.
	 * result результат.
	 */
	public void multiple(double first, double second) {
		this.result = first * second;
	}

	public double getResult() {
		return this.result;
	}
}