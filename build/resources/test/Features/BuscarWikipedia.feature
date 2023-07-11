# language: es

  Característica: Yo como usuario
    quiero Iniciar sesion en swagslabs
    para validar el inicio de sesion exitoso

  Esquema del escenario: Inicio sesion exitoso
    Dado Ingreso las credenciales de inicio sesion
      |User        | Password   |
      | <user>     | <password> |
    Entonces valido el inicio sesion exitoso

    Ejemplos:
      | user     | password  |
      | Jfsl7548 | Jfsl7548* |
      | Ects2022 | Ects2022* |

