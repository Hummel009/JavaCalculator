[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=Hummel009_Basics-of-Software-Engineering&metric=alert_status)](https://sonarcloud.io/summary/new_code?id=Hummel009_Basics-of-Software-Engineering)

Мой проект для BSUIR/БГУИР (белорусский государственный университет информатики и радиоэлектроники).

Предмет - OPI/ОПИ (основы программной инженерии).

## Общая информация

Этот репозиторий - проект Gradle, который должен быть открыт через IntelliJ IDEA или импортирован в Eclipse IDE (for Enterprise Web Developers).

| Технология | Версия  | Пояснение                                     |
|------------|---------|-----------------------------------------------|
| Gradle     | 8.4-bin | Версия системы автоматической сборки          |
| Gradle JVM | 17.0.9  | Версия Java, используемая для запуска Gradle  |
| JDK        | 17.0.9  | Версия Java, используемая для запуска проекта |
| Java       | 17      | Синтаксис Java, используемый в проекте        |

## Установка

Первым делом нужно скачать репозиторий и разархивировать его в любое место на диске. Если всё сделано правильно, вы должны увидеть папку, в которой находятся файлы `build.gradle.kts`, `settings.gradle.kts` и другие. Полученную папку будем называть ***папкой проекта***.

### IntelliJ IDEA

Запустите IntelliJ IDEA и откройте папку проекта: `File -> Open -> [Выбираете папку] -> OK`. Сразу после открытия начнётся установка среды. Если от вас потребуется разрешение на скачивание файлов, дайте его. Спустя некоторое время все необходимые файлы скачаются, и среда будет готова к работе.

Если на этом моменте что-то пошло не так и среда не установилась, значит, самое время проверить значения, указанные в таблице из первого раздела. Где их настроить:
* Gradle JVM: `File -> Settings -> Build -> Build Tools -> Gradle -> Gradle JVM`;
* JDK: `File -> Project Structure -> Project -> SDK`;
* Java: `File -> Project Structure -> Project -> Language Level`.

После изменения этих значений необходимо перезагрузить проект Gradle. Это можно сделать в ***меню Gradle***: `View -> Tool Windows -> Gradle`, нажав на значок перезагрузки в появившемся справа меню.

### Eclipse IDE (Enterprise Web Developers)

Запустите Eclipse IDE и импортируйте папку проекта: `File -> Import -> Gradle -> Existing Gradle Project -> Next -> [Выбираете папку] -> Finish`. Сразу после импорта начнётся установка среды. Если от вас потребуется разрешение на скачивание файлов, дайте его. Спустя некоторое время все необходимые файлы скачаются, и среда будет готова к работе.

Если на этом моменте что-то пошло не так и среда не установилась, значит, самое время проверить значения, указанные в таблице из первого раздела. Где их настроить:
* Gradle JVM: *переменные среды ОС, а именно JAVA_HOME и Path*;
* JDK: `Project -> Properties -> Java Build Path -> Libraries -> [нажимаете на JRE System Library] -> Remove -> Add Library -> JRE System Library -> Next -> Alternate JRE -> Installed JREs -> Add -> Standard VM -> Next -> [выбираете JRE home] -> Finish -> Apply and close -> [в выпадающем меню справа от Alternate JRE выбираете нужную JRE] -> Finish -> Apply and close`;
* Java: `Project -> Properties -> Java Compiler -> [галочка на Enable project specific settings] -> [выставляете Compiler compliance level] -> Apply and close`.

После изменения этих значений необходимо перезагрузить проект Gradle. Это можно сделать, нажав слева (под панелью Package Explorer) ПКМ по названию проекта и выбрав `Gradle -> Refresh Gradle Project`. После перезагрузки проекта в нижней части окна появится ***меню Gradle***. 

## Основы работы

После установки среды весь необходимый инструментарий готов к работе. Вот самые важные команды, необходимые каждому разработчику:

* Запуск приложения: `Меню Gradle -> Application -> run`.
* Компиляция приложения в файл с расширением .jar: `Меню Gradle -> build -> build`. После компиляции ваше приложение появится в папке `папка_проекта/build/libs`. 

Примечания: 
* Команды запускаются двойным нажатием по ним.
* В IntelliJ IDEA все вышеуказанные команды содержатся в категории Gradle "Tools".

## Использование

Запустить скомпилированный файл с расширением .jar двойным нажатием ЛКМ.

## Условие

Тема - калькулятор с графическим интерфейсом. Необходимо покрыть его юнит-тестами, настроить Github Actions, подключить SonarCloud и активировать в нём интеграцию анализа покрытия от Jacoco.

Покрытие юнит-тестами составляет 94%, что является крайне хорошим показателем. Инкапсуляция соблюдена. SonarCloud пишет, что качество достойное. Github Actions работают. Jacoco подключен и работает. Интеграция SonarCloud с Jacoco не удалась.
