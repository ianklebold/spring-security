# SPRING SECURITY

## Mapa conceptual


## Estrategias

Spring security comprende estrategias para establecer seguridad en las aplicaciones diseñadas con el framework. Estas estrategia se basan en la autenticación y en la autorización de los usuarios al acceder a la aplicación.

```
- La autenticación : Se basa en definir ¿Quien eres?
- La autorización: Se basa en definir ¿Que puedes hacer?
```

## Autenticación

La autenticación presenta una interfaz denominada **AutenticacionManager**. Esta tiene un solo metodo, autenticate() el cual recibe un Authentication y puede retornar :

```
- authenticated = true si el usuario es identificado y valido
- Authentication Exception si el usuario no es identificado
- null si no puede decidir 
```

Generalmente la excepcion es manejada por el framework, no se espera que la aplicación de usuario tenga que atraparla, en su lugar el framework retornará un codigo de error **401 "Error por no autenticado"** y el mismo se retoran cuando quiere acceder o hacer una request y no se está autenticado o la autenticación falló. 

```
HTTP/1.1 401 Unauthorized
Date: Wed, 21 Oct 2015 07:28:00 GMT
WWW-Authenticate: Basic realm="Access to staging site"
```




