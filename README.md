# Приложение "Калькулятор отпускных"
Микросервис на SpringBoot + Java 11 c одним API:
GET "/calculacte"
# Задание
Минимальные требования: Приложение принимает твою среднюю зарплату за 12 месяцев и количество дней отпуска - отвечает суммой отпускных, которые придут сотруднику.
Доп. задание: При запросе также можно указать точные дни ухода в отпуск, тогда должен проводиться рассчет отпускных с учётом праздников и выходных.
Проверяться будет чистота кода, структура проекта, название полей\классов, правильность использования паттернов. Желательно написание юнит-тестов, проверяющих расчет.

# API

Стандартный GET-запрос: ```http://localhost:8080/calculacte?yearSalary=<int>&vacationDays=<int>```

GET-запрос с вводными данными: ```http://localhost:8080/calculacte?yearSalary=35000&vacationDays=18```

# Unit Test

## Входные данные

```averageSalary (Средняя з/п) = 35000```

```numberOfVacationDays (Кол-во отпускных дней) = 18```

## Результат

```resultPay (размер отпускного) = 21501```