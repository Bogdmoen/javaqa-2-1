# Отчёт о тестировании Money transfer

## Краткое описание

25.01.2021 было проведено исследовательское тестирование кода приложения  Money transfer

На тестирование затрачено: 2ч

В результате тестирования выявлены следующие дефекты:
* [Некорректная сумма баланса после перевода](https://github.com/Bogdmoen/javaqa-2-1/issues/1)



## Описание процесса тестирования


- В качестве тестовых данных использовались различные комбинации чисел, которые присваивались переменным "balance" и "transfer"
1000 и 500
10000 и 100
0 и 1000 и т.д.


1. Приложение Money transfer запускается и польностью совместимо с java 11.


2. Проверка функционала выполнялась путем присвоения различных числовых значений  переменным "balance" и "transfer"  и выполения кода в среде IntelliJ IDEA

3. В ходе тестирования выявлены проблемы с подсчетом суммы, если она превышает 
 2 147 483 647

![](files/Money_transfer_invalid_sum.png)


Тестирование производилось в следующем окружении:
* Win 10 x64
* Java 11.0.9.1

