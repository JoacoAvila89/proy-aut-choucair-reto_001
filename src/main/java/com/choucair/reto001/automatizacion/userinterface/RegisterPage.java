package com.choucair.reto001.automatizacion.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class RegisterPage {

    private RegisterPage(){}

    public static final Target INGRESAR_NOMBRES = Target.the("Campo para ingresar Nombre")
            .locatedBy("//input[contains(@placeholder,'First Name')]");

    public static final Target INGRESAR_APELLIDOS = Target.the("Campo para ingresar Apellidos")
            .locatedBy("//input[contains(@placeholder,'Last Name')]");

    public static final Target INGRESAR_DIRECCION = Target.the("Campo para ingresar Dirección")
            .locatedBy("//textarea[contains(@ng-model,'Adress')]");

    public static final Target INGRESAR_CORREO = Target.the("Campo para ingresar Correo")
            .locatedBy("//input[contains(@ng-model,'EmailAdress')]");

    public static final Target INGRESAR_TELEFONO = Target.the("Campo para ingresar Telefono")
            .locatedBy("//input[contains(@ng-model,'Phone')]");

    public static final Target SELECCIONAR_SEXO = Target.the("Opciones de Sexo")
            .locatedBy("//input[@name='radiooptions']");

    public static final Target SELECCIONAR_HOBBIES = Target.the("Opciones de Hobbies")
            .locatedBy("//input[@id='checkbox2']");

    public static final Target DESPLEGAR_IDIOMAS = Target.the("Opciones de Idiomas a elegir")
            .locatedBy("//multi-select//div[@id ='msdd']");

    public static final Target OPCIONES_IDIOMAS = Target.the("Opciones de Idiomas")
            .locatedBy("//ul[contains(@class, 'ui-autocomplete')]");

    public static final Target SELECCIONAR_ESPANOL = Target.the("Selecciona idioma Español")
            .locatedBy("//a[contains(text(),'Spanish')]");

    public static final Target SELECCIONAR_HABILIDADES = Target.the("Selecciona Habilidades")
            .locatedBy("//select[@id ='Skills']");

    public static final Target SELECCIONAR_PAIS = Target.the("Selecciona pais")
            .locatedBy("//select[@id ='countries']");

    public static final Target SELECCIONAR_CIUDAD = Target.the("Selecciona Ciudad/Pais - Revisar")
            .locatedBy("//select[@id ='country']");

    public static final Target SELECCIONAR_ANO = Target.the("Selecciona año de nacimiento")
            .locatedBy("//select[@id = 'yearbox']");

    public static final Target SELECCIONAR_MES = Target.the("Selecciona mes de nacimiento")
            .locatedBy("//select[@placeholder = 'Month']");

    public static final Target SELECCIONAR_DIA = Target.the("Selecciona dia de nacimiento")
            .locatedBy("//select[@id = 'daybox']");

    public static final Target INGRESAR_CONTRASENA = Target.the("Ingresar Contraseña")
            .locatedBy("//input[@id = 'firstpassword']");

    public static final Target CONFIRMAR_CONTRASENA = Target.the("Confirmar Contraseña")
            .locatedBy("//input[@id = 'secondpassword']");

    public static final Target BOTON_ENVIAR = Target.the("Boton para enviar registro de datos")
            .locatedBy("//button[@id = 'submitbtn']");

}
