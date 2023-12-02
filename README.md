[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=Hummel009_Basics-of-Software-Engineering&metric=alert_status)](https://sonarcloud.io/summary/new_code?id=Hummel009_Basics-of-Software-Engineering)

Мой проект для BSUIR/БГУИР (белорусский государственный университет информатики и радиоэлектроники).

Предмет - OPI/ОПИ (основы программной инженерии).

## Общая информация

Этот репозиторий - проект Gradle, который должен быть открыт через IntelliJ IDEA.

| Технология                                    | Версия    |
|-----------------------------------------------|-----------|
| Версия системы автоматической сборки Gradle   | 8.5       |
| Версия Java, используемая для запуска Gradle  | 21.0.1    |
| Версия Java, используемая для запуска проекта | 21.0.1    |
| Версия Java, используемая для сборки проекта  | 21.0.1    |
| Уровень используемого в коде синтаксиса Java  | 21        |

## Установка

Установка и системные требования всех моих проектов Gradle примерно одинаковы, так что смотрите [общую инструкцию](https://github.com/Hummel009/Legendary-Item#readme). Проект из этого репозитория устанавливается так же, как проект Minecraft 1.18.2 из общей инструкции.

## Использование

* Скомпилировать приложение в файл с расширением .jar;
* Запустить вышеупомянутый файл двойным нажатием ЛКМ.

## Условие

Тема - калькулятор с графическим интерфейсом. Необходимо покрыть его юнит-тестами, настроить Github Actions, подключить SonarCloud и активировать в нём интеграцию анализа покрытия от Jacoco.

Покрытие юнит-тестами составляет 94%, что является крайне хорошим показателем. Инкапсуляция соблюдена. SonarCloud пишет, что качество достойное. Github Actions работают. Jacoco подключен и работает. Интеграция SonarCloud с Jacoco не удалась.
