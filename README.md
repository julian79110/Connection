# Conexion a base de datos
## Julian Tique
### 2687351 

En este repositorio se encontraran varias formas de conectar una base de datos cada una va optimizando su forma de conectarse, todos estos archivos se encontraran en la carpeta util

- Archivo ConnectionBasic: este archivo es la forma mas simple y basica de conectarse a la base de datos. 

Empezamos declarando las 3 variables para conectar la base de datos, primero con url para poner el nombre de nuestra base de datos. Despues tenemos user para el usuario de nuestra base de datos, y por ultimo la contraseña de nuestro usuario. 


![img](https://user-images.githubusercontent.com/128442954/236638873-b795a29c-662a-44dd-9fe4-ac67d3d9629b.JPG)

Ahora tenemos una cadena de caracteres sql inicializada en null esta nos servira para hacer la consulta a la base de datos, luego la Connection para el DriverManager, el objeto statement para que procese la sentencia sql a traves de nuestro objeto ResultSet que se le pone executeQuery para todo lo que sea consultas. 

![img2](https://user-images.githubusercontent.com/128442954/236639473-5e241044-c4bd-418b-b6f6-b03972f9cedf.JPG)

aqui declaramos todo la anterior con la instruccion try diciendole que intente las instrucciones dadas 

![img3](https://user-images.githubusercontent.com/128442954/236639523-a22d240e-ea87-48b4-8a41-0eb154940ad8.JPG)

Luego con la instruccion while le decimos que mientras ResultSet tenga algun dato nos muestre las columnas del nombre y el apellido 

![img4](https://user-images.githubusercontent.com/128442954/236640538-b6d9fe3c-4278-4729-8325-e1ff430c9533.JPG)

ahora con la palabra reservada catch le decimos que atrape los errores que podamos tener 

![imagen5](https://user-images.githubusercontent.com/128442954/236640630-cd75bdc6-d4ee-4fc7-87a7-96a480ccb248.JPG)

Por ultimo con las palabras reservadas try catch cerramos todos los objetos que inicializamos para limpiar el buffer 

![img](https://user-images.githubusercontent.com/128442954/236640775-b1adcb58-d750-42f1-aa27-5b92dd0ab512.JPG)

-Archivo BasicConnectionWithResources: optimizando el basico ahora con la instruccion throws no es necesario cerrar los objetos  

![img2](https://user-images.githubusercontent.com/128442954/236641019-07273722-7cf0-49be-ab24-0d2d6ee4c7db.JPG)

-Archivo ConnectionSingleton: en esta conexion se hace para un solo usuario, no se puede usar para varias conexiones al tiempo 

![img3](https://user-images.githubusercontent.com/128442954/236641366-6f3b169a-6d16-400e-98d0-a52f49718c0e.JPG)

para visualizar la conexion usamos otro archivo llamado useConnectionSingleton, en este caso solo para que nos muestre el nombre y el apellido

![img4](https://user-images.githubusercontent.com/128442954/236641457-7b8d8b3d-8766-4fa8-acf6-c477096561d9.JPG)

-Archivo ConnectionPool: Por ultimo para las formas de conexiones que tenemos es el pool de conexiones para que se pueda conectar varios usuarios al mismo tiempo, funciona como un cajon para guardar cada conexion una vez se deja de usar una conexion la devuelve 

funciona con una dependencia de apache en este caso dbcp2 a traves de BasicDataSource y como singleton se declara en este archivo todo lo que vamos a usar y en otro archivo usamos para probar si funciona nuestra conexion. 

![img5](https://user-images.githubusercontent.com/128442954/236641677-b700a551-754f-4ad3-afd5-8e27dc2ab2db.JPG)

-UseConnectionPool: 

![img](https://user-images.githubusercontent.com/128442954/236641715-27a07f46-35f4-416e-b5f1-061136a5a82d.JPG)

-Encriptamiento de la contraseña: Con el gestor de base de datos mysql en la base de datos MyApp ingresamos un registro y encriptamos la contraseña y la desencriptamos para poder visualizarla, y pedirle que el nombre y el apellido siempre esten en mayusculas 

![img2](https://user-images.githubusercontent.com/128442954/236641970-bdbb6b6a-a30c-4813-9238-6bef1219e0e1.JPG)








