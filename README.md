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

