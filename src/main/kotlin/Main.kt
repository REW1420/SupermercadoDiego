fun main(args: Array<String>) {

    var usuario: String = "usuario"
    var contrasena: String = "contraseña"
    var LecturaUsuario: String
    var LecturaContrasena: String
    var opcion: Int
    var opcionContrasena: Int

    //saludo que no se repite
    println(
        "Bienvenido al sistema Nombre Supermercado Diego\n" +
                "Favor ingresar credenciales"
    )

    // este do/while esta para que se repita hasta que se ingresen las credecniales correctamente
    do {


        println("Usuario: ")
        LecturaUsuario = readln()!!
        println("Contraseña")
        LecturaContrasena = readln()!!

        //se muentra un mensaje error por si la contraseña esta mal, si no lo esta entra el do/while del menu
        if (usuario != LecturaUsuario && contrasena != LecturaContrasena) {
            println("Erro en contraseña y/o usuario\n" + "Ingrese denuevo")
        }

        //while para repetir el do siempre que no sean identicas las credenciales
    } while (usuario != LecturaUsuario && contrasena != LecturaContrasena)


        //condicion para entrar al menu. Aqui iria las diferentes condiciones para los diferentes menus para cada credencial
    if (usuario == LecturaUsuario && contrasena == LecturaContrasena) {


        do {
            println("Bienvenido $usuario \n" + "¿Qué desea hacer?\n" + "1.Venta nueva \n" + "2.Consultar inventario\n" + "3.Cambiar contraseña\n" + "4. Salir del sistema")
            opcion = readln()!!.toInt()

            if (opcion == 1) {
                println(
                    "Productos\n" +
                            "1- producto1 c/u \$0.10\n" +
                            "2- producto2 c/u \$5.00\n" +
                            "3- producto3 c/u \$3.00\n" +
                            "4- producto4 c/u \$0.50\n" +
                            "5- producto5 c/u \$ 0.80\n" +
                            "6- producto6 c/u \$0.30\n" +
                            "7- producto7 c/u \$ 2.25\n" +
                            "8- producto8 c/u \$ 2.75\n" +
                            "9- producto9 c/u \$1.80\n" +
                            "10- producto10 c/u \$3.25"
                )

            };
            if (opcion == 2) {

                println(
                    "PRODUCTO: CANTIDAD: unidades\n" +
                            "1- producto1 30\n" +
                            "2- producto2 5\n" +
                            "3- producto3 60\n" +
                            "4- producto4 100\n" +
                            "5- producto5 500\n" +
                            "6- producto6 20\n" +
                            "7- producto7 25\n" +
                            "8- producto8 30\n" +
                            "9- producto9 180\n" +
                            "10- producto10 50"
                )
            };
            if (opcion == 3) {
                println("Cambiar contreña\n" + "1.admid / admid123\n" + "2.vendedor / vendedor123\n" + "3.invitado / invitado123")


            }

            // se cierra el programa
        } while (opcion != 4)
    }


}
