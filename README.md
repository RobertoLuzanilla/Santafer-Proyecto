# Proyecto-de-programacion
Proyecto de programacion de Estructura de datos




BANCO SANTANFER

Hacer un programa en Java que controle la afluencia de clientes del Banco “Santanfer”. Cabe mencionar que existen dos cajas, y que se pedirá el nombre del cliente. El usuario también determinará cuando se va a llamar a un cliente de la cola a la caja, obviamente para hacer esto, la caja debe de estar vacía. El programa estará en base al siguiente menú:

Menú de Opciones:

1)	Apertura de Cuenta
2)	Depósito
3)	Retiro
4)	Cambio de Cheque
5)	Saldo de una cuenta
6)	Datos de una Cuenta
7)	Datos de todas las cuentas.
8)	Último cliente atendido
9)	Clientes en la cola
10)	Clientes que están en caja
11)	Pasar cliente a una caja
12)	Atender a un cliente en una caja
13)	Salir


Consideraciones:

1)	Apertura de Cuenta
El cliente NO hace cola para abrir una cuenta en Santanfer. Los datos que se le piden son: No. de Cuenta (la cual NO debe de estar repetida, si está repetido, mostrar un mensaje y regresar al Menú Principal), Nombre y Saldo Inicial (realmente este es el depósito con el que abre la cuenta). Una vez dados los datos del cliente en el arreglo, se pasa a la pila de clientes atendidos.

2)	Depósito
Se le pide al cliente el no. de cuenta y nos debemos de asegurar de que ésta exista. Si no existe, mostrar un mensaje y regresar al Menú Principal. Si existe, se pasa a la cola de las cajas, y se le pide su nombre y el importe del depósito.

3)	Retiro
Se le pide al cliente el no. de cuenta y nos debemos de asegurar de que exista. Si no existe, mostrar un mensaje y regresar al Menú Principal. Si existe, se pasa a la cola de las cajas. Aquí no se le pide nombre al cliente ya que debe de ser el titular de la cuenta. Antes de pasarlo a la cola, se le pide el importe del retiro.

4)	Cambio de Cheque
Se le pide al cliente el no. de cuenta y nos debemos de asegurar de que ésta exista. Si no existe, mostrar un mensaje y regresar al Menú Principal. Si existe, se pasa a la cola de las cajas, y se le pide su nombre y el importe del cheque. 

5)	Saldo de una cuenta
Se pide el no. de cuenta y si existe, se debe de desplegar el mismo. Si no existe, mostrar un mensaje y regresar al Menú Principal.

6)	Datos de una Cuenta
Se pide el no. de cuenta y si existe, se deben desplegar todos los datos de la cuenta: número, nombre y saldo. Si no existe, mostrar un mensaje y regresar al Menú Principal.

7)	Datos de todas las cuentas
Se despliegan los datos de todas las cuentas en forma de tabla. Si no hay cuentas dadas de alta, mostrar un mensaje y regresar al Menú Principal.

8)	Último cliente atendido
Se muestra (si es que lo hay) el nombre del último cliente que se atendió y el tipo de movimiento que hizo. Por ejemplo: Juan hizo un Depósito. Si no hay registros, mostrar un mensaje y regresar al Menú Principal.


9)	Clientes en la cola
Se muestran todos los nombres de los clientes que están en la cola, comenzando por el que está más próximo a ser atendido y la transacción que va a hacer. 
Por ejemplo: Juan – depósito.

10)	Clientes que están en caja
Se muestra el nombre de los clientes, el movimiento que van a hacer, así como lo caja en la que están. Si la caja está vacía, mostrar un mensaje (por caja). Por ejemplo:
Caja 1: Vacía
Caja 2: Juan – depósito

11)	Pasar cliente a una caja
Se pasa al cliente de mayor estadía en la cola (el primero que llegó de los que están en la cola) a la caja (es decir, se elimina de la cola y se da de alta en la caja. Si no ya clientes en la Cola, mostrar un mensaje. El programa buscará una caja vacía, empezando por la caja 1, y si ésta está desocupada y si hay un cliente en la cola, lo pasa. Si estuviera ocupada la caja 1, se pasa a la caja 2. Si no hay cajas desocupadas se manda un mensaje de error, y se regresa al menú principal.

12)	Atender a un cliente en una caja
Se le pide que se introduzca el no. de la caja y si hay cliente, es en ese momento donde se realiza la transacción (depósito, retiro o cambio de cheque). Si no hay cliente, mostrar un mensaje y regresar al Menú Principal. Una vez realizada la transacción se le saca de la caja y se pasa al registro de clientes atendidos.

13)	Salir


Consideraciones extras:
•	Cuando se atienda a un cliente que vaya a realizar un cambio de cheque, si el saldo de la cuenta es insuficiente, mandar un mensaje en pantalla, y se le cobrará una comisión de $500.00, pudiendo la cuenta quedar con saldo negativo.
•	Cuando se atienda a un cliente que vaya a realizar un retiro, si el saldo de la cuenta es insuficiente, mandar un mensaje en pantalla, y se le dará al cliente el total del saldo que trae (no se le cobrará comisión), por lo que la cuenta quedará con saldo $0.00 (mostrar en pantalla lo que se le dará al cliente). Si el saldo estaba en negativo, mostrar el mensaje de saldo insuficiente y dejar el saldo intacto (en negativo), es decir, NO se cambia a cero.


Aclaraciones:

•	Existen 2 cajas.
•	Los clientes que aperturan cuentas no pasan a las cajas pero sí al registro de clientes atendidos.
•	La implementación del registro de clientes se hará con un arreglo simple de objetos, la de la cola de clientes será con COLAS, y la de clientes atendidos con una PILA.
•	El programa se tendrá que implementar con arreglo de objetos en la implementación de la pila y de la cola.
•	Se tendrán las siguientes 7 clases: Principal, Oper_clientes, Oper_colas, Oper_pilas, Clientes, Cola, Pila (pueden ser otros nombres más significativos).

Criterio de evaluación:

•	Apertura de Cuenta				(5 puntos)
•	Depósito						(5 puntos)
•	Retiro						(5 puntos)
•	Cambio de Cheque				(5 puntos)
•	Saldo de una cuenta				(5 puntos)
•	Datos de una Cuenta				(5 puntos)
•	Datos de todas las cuentas			(5 puntos)
•	Último cliente atendido			(10 puntos)
•	Clientes en la cola				(10 puntos)
•	Clientes que están en caja			(10 puntos)
•	Pasar cliente a una caja			(15 puntos)
•	Atender a un cliente en una caja		(20 puntos)

TOTAL: 100 puntos

