# NumbStroka

***Класс, представляющий главное окно приложения,наследующий класс JFrame***

Содержит на главной панели два поля ввода "Число" и "Строка", поле вывода "Результат" (JTextArea), а также 4 кнопки: "Добавить", "Вывести всё", "Вывести только числа" и "Вывести только строки". 

Поведение программы удовлетворяет следующим требованиям:
<li> пользователь может ввести в поле "Число" только целые числа, а в поле "Строка" - произвольную, но не пустую строку;
<li> при нажатии на кнопку "Добавить" содержимое полей ввода сохраняется во внутренней коллекции(!) приложения;
<li> при нажатии на кнопку "Вывести всё" в поле "Результат" выводятся все ранее ведённые данные - и строки, и числа;
<li> при нажатии на кнопку "Вывести только числа" в поле "Результат" выводятся только числовые данные, введённые ранее;
<li> при нажатии на кнопку "Вывести только строки" в поле "Результат" выводятся только строковые данные, введённые ранее.
