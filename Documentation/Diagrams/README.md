
# UML Диаграммы
1. [Диаграмма прецедентов](#1)
2. [Диаграмма активности](#2)
3. [Диаграмма последовательности](#3)
4. [Диаграмма классов](#4)
5. [Диаграмма состояний](#5)
6. [Диаграмма развёртывания](#6)


### 1. Диаграмма прецедентов<a name="1"></a>
Диаграмма прецедентов представляет собой следующую диаграмму: 
![Use Case](https://github.com/Evgeniy999/Restaurant_terminal/blob/master/Documentation/Diagrams/UseCase/UseCase_.png)



#### 1.1 Актёры
Актёр | Описание
--- | ---
Пользователь|Человек, использующий систему

#### 1.2 Варианты использования

##### 1.2.1 Аутентификация
**Описание.** Вариант использования "Аутентификация" позволяет пользователю войти в приложение.
Поток выполнения:
1. Пользователь вводит логин и пароль.
2. Если приложение находит пользователя, то выполняется поток А, иначе поток Б.
Поток А:
1.Осуществляется переход в меню.
Поток Б:
1. Осуществляется переход на страницу входа.
##### 1.2.2 Выбор ингредиенты из списка
**Описание.** Вариант использования "Выбор ингредиентов из списка" позволяет пользователю выбирать продукты.
Поток выполнения:
1. Пользователь выбирает пункт из списка.
2. Осуществляется вывод найденных продуктов.
##### 1.2.3 Выбор готового заказа
**Описание.** Вариант использования "Выбор готового заказа" позволяет пользователю выбирать заказ.
Поток выполнения:
1. Пользователь выбирает пункт из списка.
2. Осуществляется вывод найденного заказа.
##### 1.2.4 Оформление заказа
**Описание.** Вариант использования "Оформление заказа" позволяет пользователю выбирать заказ.
Поток выполнения:
1. Пользователь нажимает на печать заказа.
2. Осуществляется печать заказа.
##### 1.2.5 Отмена заказа
**Описание.** Вариант использования "Отмена заказа" позволяет пользователю отменить заказ.
Поток выполнения:
1. Пользователь нажимает на отмена заказа.
2. Осуществляется переход в меню.
##### 1.2.6 История заказов
**Описание.** Вариант использования "История заказов" позволяет пользователю просматривать историю заказов.
Поток выполнения:
1. Пользователь нажимает на историю заказа.
2. Осуществляется просмотр заказов.
##### 1.2.7 Скидка клиентам
**Описание.** Вариант использования "Скидка клиентам" позволяет пользователю сделать скидку клиенту.
Поток выполнения:
1. Пользователь нажимает на скидку клиентам.
2. Выбирает нужный процент.
3. Осуществляется понижение суммы за заказ.

### 2. Диаграмма активности<a name="2"></a>
Диагаммы активности представлены в следующей [директории](https://github.com/Evgeniy999/Restaurant_terminal/tree/master/Documentation/Diagrams/Activity).

### 3. Диаграмма последовательности<a name="3"></a>
Диаграмма последовательности основного варианта использования представляет из себя следующую диаграмму:
## Authentication:

![Sequence Diagram](https://github.com/Evgeniy999/Restaurant_terminal/blob/master/Documentation/Diagrams/Sequence/Authentication.png)

## Choice ingredients:

![Sequence Diagram](https://github.com/Evgeniy999/Restaurant_terminal/blob/master/Documentation/Diagrams/Sequence/Choice_ingredients.png)

## Choice orders:

![Sequence Diagram](https://github.com/Evgeniy999/Restaurant_terminal/blob/master/Documentation/Diagrams/Sequence/Choice_order.png)

## Drawing up of an order:

![Sequence Diagram](https://github.com/Evgeniy999/Restaurant_terminal/blob/master/Documentation/Diagrams/Sequence/Drawing_order.png)

## Order cancellation:

![Sequence Diagram](https://github.com/Evgeniy999/Restaurant_terminal/blob/master/Documentation/Diagrams/Sequence/Exit.png)

## Order history:

![Sequence Diagram](https://github.com/Evgeniy999/Restaurant_terminal/blob/master/Documentation/Diagrams/Sequence/Order_history.png)


## Discount to customers:

![Sequence Diagram](https://github.com/Evgeniy999/Restaurant_terminal/blob/master/Documentation/Diagrams/Sequence/Discount_to_customers.png)



### 4. Диаграмма классов<a name="4"></a>
Диаграмма классов представляет собой следующую диаграмму: 

![Class](https://github.com/Evgeniy999/Restaurant_terminal/blob/master/Documentation/Diagrams/Class/ClassUML.PNG)
  
### 5. Диаграмма состояний<a name="5"></a>

#### 5.1 Вход в систему

![State](https://github.com/Evgeniy999/Restaurant_terminal/blob/master/Documentation/Diagrams/State/Access.PNG)

#### 5.2. Выбор определенных параметров

![State](https://github.com/Evgeniy999/Restaurant_terminal/blob/master/Documentation/Diagrams/State/Choice_.PNG)

#### 5.3 Печать заказ
![State](https://github.com/Evgeniy999/Restaurant_terminal/blob/master/Documentation/Diagrams/State/Print_.PNG)

### 6. Диаграмма развертывания<a name="6"></a>

![Deployment](https://github.com/Evgeniy999/Restaurant_terminal/blob/master/Documentation/Diagrams/Deployment/Deployment.PNG)
