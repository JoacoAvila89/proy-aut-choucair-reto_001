#language: es

Característica: Reto de automatización en pagina de Automation Demo Site
  Como colaborar de Choucair, quiero completar el reto 1.00 - Automatización Web

  @Reto_01
  Escenario: Completar Registro en Pagina Automation Demo Site
  Dado que Joaquin quiere acceder a la Web Automation Demo Site
  Cuando el realiza el registro en la página
    | Nombres     |  Apellidos  | Direccion         |Correo                       | Telefono   |Habilidades  |Pais   |Ciudad|Año |Mes    |Dia|Contraseña  |
    | JoseJoaquin |  Avila      | Panama, Venezuela | javilas@choucair.com        | 5076891294 | Java        |Panama |Japan |1989|October|26 |Choucair2020|
    Entonces el verifica que se carga la pantalla con texto Double Click on Edit Icon to EDIT the Table Row.
